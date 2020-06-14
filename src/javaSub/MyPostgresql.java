package javaSub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class MyPostgresql {
	public static void main(String[] args) {
		HashMap<String, Long> map=new HashMap<String, Long>();
        Connection con = null;
        Statement st = null;
        PreparedStatement ps=null;
        ResultSet rs = null;
        String url = "jdbc:postgresql://127.0.0.1/postgres";
        String user = "postgres";
        String password = "0000";      

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();

            st.executeUpdate("DELETE FROM public.test");
            
            st.executeUpdate("INSERT INTO public.test( text, value) VALUES ( 'test1', 12 )");
            
            ps=con.prepareStatement("INSERT INTO public.test( text, value) VALUES ( ? , ?  )");
            ps.setString(1, "test1");
            ps.setLong(2, 13);
            ps.executeUpdate();
            ps.setString(1, "test2");
            ps.executeUpdate();           
            ps.setLong(2, 14);
            ps.executeUpdate();
            ps.setString(1, "test3");
            ps.executeUpdate();
            ps.setLong(2, 15);
            ps.executeUpdate();
            
            rs = st.executeQuery("select * from public.test");
            
            while(rs.next()) {
            	System.out.println(rs.getString(1)+" , "+rs.getLong(2));
            	if (map.containsKey(rs.getString(1))) {            		
            		map.put(rs.getString(1),map.get(rs.getString(1))+rs.getLong(2));
				}else {				
					map.put(rs.getString(1),rs.getLong(2));
				}
            }   
            System.out.println(map.toString()); // (A)
            
        } catch (Exception e) {	e.printStackTrace();
        } finally {
            try {
                if (rs != null) {rs.close();}
                if (st != null) {st.close();}
                if (con != null) {con.close();}
            } catch (Exception e) {e.printStackTrace();}
        }
	}
}
