package windows;

import javax.swing.JFrame;

public class Rwin extends JFrame
{
public Rwin()
{
	this.setBounds(100, 100, 200, 250);
	this.setTitle("my software");
	this.setVisible(true);
}

public static void main(String[] g)
{
	Rwin sin=new Rwin();
}
}
