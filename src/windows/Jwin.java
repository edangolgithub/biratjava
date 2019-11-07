package windows;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Jwin
{
JFrame a=new JFrame();
private JTextField birattext;
private JTextField etext;
private JTextField ltext;
public Jwin()
{
	   ltext = new JTextField();
	    ltext.setBounds(128, 271, 86, 20);
	    a.getContentPane().add(ltext);
	    ltext.setColumns(10);
	    JLabel plabel = new JLabel("plabel");
	    plabel.setBounds(252, 311, 46, 14);
	    a.getContentPane().add(plabel);
	    
	    
	
	a.setBounds(100, 100, 610, 449);
    a.setTitle("R window");	
    a.getContentPane().setLayout(null);
    
    
    birattext = new JTextField();
    birattext.setBounds(379, 11, 86, 20);
    a.getContentPane().add(birattext);
    birattext.setColumns(10);
    
    JLabel biratlabel = new JLabel("New label");
    biratlabel.setBounds(488, 14, 46, 14);
    a.getContentPane().add(biratlabel);
	a.setVisible(true);
    
	 etext = new JTextField();
	    etext.setBounds(449, 178, 86, 20);
	    a.getContentPane().add(etext);
	    etext.setColumns(10);
	    
	    JLabel ele = new JLabel("New label");
	    ele.setBounds(488, 145, 46, 14);
	    a.getContentPane().add(ele);
    JButton btnNewButton = new JButton("New button");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e)
    	{
    		int a=8;
    		int b=10;
    		int c= a+b;
    		JOptionPane.showMessageDialog(null, a+b);
    		birattext.setText(String.valueOf(c));
    		biratlabel.setText(String.valueOf(c));
    	}
    });
    btnNewButton.setBounds(389, 42, 89, 23);
    a.getContentPane().add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("New button");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) 
    	{
    		
    		int num=Integer.parseInt(etext.getText());
    		
    		if (num%2==0) {
				ele.setText("even");
			}
    		else
    		{
    			ele.setText("odd");
    		}
    	}
    });
    btnNewButton_1.setBounds(459, 205, 89, 23);
    a.getContentPane().add(btnNewButton_1);
    
    JButton btnNewButton_2 = new JButton("New button");
    btnNewButton_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e)
    	{
    		
    	      String g=ltext.getText();
    	      JOptionPane.showMessageDialog(null, g);
    	      plabel.setText(g);
    	}
    });
    btnNewButton_2.setBounds(128, 302, 89, 23);
    a.getContentPane().add(btnNewButton_2);
    
  
 
   
   
	
}


public static void main(String[] g)
{
	Jwin sin=new Jwin();
}
}
