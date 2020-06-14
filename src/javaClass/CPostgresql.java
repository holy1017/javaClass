/**
 * 
 */
package javaClass;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;

public class CPostgresql {
	public static void main(String[] args) {
		HashMap<String, Long> map=null;
        Connection con = null;
        Statement st = null;
        PreparedStatement ps=null;
        ResultSet rs = null;
        ResultSetMetaData rsmd =null;
        int cl,rc;
        long l=0;
        String url = "jdbc:postgresql://127.0.0.1/postgres";
        String user = "postgres";
        String password = "0000";
 
        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            
            rs = st.executeQuery("SELECT VERSION()");
            if (rs.next()) {System.out.println(rs.getString(1));}
            
            rc= st.executeUpdate("DELETE FROM public.test");
            System.out.println("result:"+rc);
            
            rc= st.executeUpdate("INSERT INTO public.test( text, value, date) VALUES ( 'test1', 12, now() )");
            System.out.println("result:"+rc);
            
            ps=con.prepareStatement("INSERT INTO public.test( text, value, date) VALUES ( ? , ? , ? )");
            ps.setString(1, "test2");
            ps.setLong(2, 13);
            ps.setDate(3, new Date(new java.util.Date().getTime()));
            ps.executeUpdate();
            ps.executeUpdate();           
            ps.setLong(2, 14);
            ps.executeUpdate();
            ps.executeUpdate();
            ps.setLong(2, 15);
            
            rs = st.executeQuery("select * from public.test");
            rsmd = rs.getMetaData();
            cl = rsmd.getColumnCount();

            while(rs.next()) {
            	for (int i = 1; i <= cl; i++) {
					//
					switch (rsmd.getColumnType(i)) {
					case Types.VARCHAR://12 : TEXT
						System.out.println(rsmd.getColumnName(i)+":" +rs.getString(i));
						break;
					case Types.BIGINT://-5						
						System.out.println(rsmd.getColumnName(i)+":" +rs.getLong(i));
						l+=rs.getLong(i);
						break;
					case Types.DATE://12						
						System.out.println(rsmd.getColumnName(i)+":" +rs.getDate(i));
						break;
					default:
						System.out.println(rsmd.getColumnName(i)+":" +rsmd.getColumnType(i)+":"+rs.getString(i));
						break;
					}					
				}
            }   
            System.out.println("합계"+l);
        } catch (Exception e) {	
        	System.out.println(e);
        } finally {
            try {
                if (rs != null) {rs.close();}
                if (st != null) {st.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
            	System.out.println(e);
            }
        }
	}

}
