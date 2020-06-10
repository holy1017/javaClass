/**
 * 
 */
package javaClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CAwt extends Frame{
	public CAwt() {
		setTitle("Test");setSize(300,150);
		setLayout(new BorderLayout(5,5));
		Panel pc=new Panel(new BorderLayout(5,5));
		
		add("Center",pc);
		pc.add("Center", getLabel("Center",Color.YELLOW));
		add("South" , getLabel("South",Color.green));
		add("North" , getLabel("North",Color.orange));
		add("West"  , getLabel("West",Color.PINK));
		add("East"  , getLabel("East",Color.CYAN));
		
		setVisible(true);		
		addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent e){System.exit(0);}
		});
	}
	public Label getLabel(String s ,Color cl) {
		Label lb=new Label(s ,Label.CENTER);
		lb.setBackground(cl);
		return lb;
	}
	public static void main(String[] args) { new CAwt(); }
}
