package windows;

import javax.swing.JFrame;

public class Bwindow 
{
 JFrame j= new JFrame();
 
 public Bwindow()
 {
	    j.setBounds(400, 200, 200, 200);
		j.setTitle("Birat Window");
		j.setVisible(true);
 }
 
 public static void main(String[] args)
 {
	 Bwindow b= new Bwindow();
 }
}
