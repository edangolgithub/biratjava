package windows;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;


public class Window11 {

	private JFrame frame;
	JButton g;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window11 window = new Window11();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 685);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setForeground(new Color(153, 51, 102));
	panel.setBounds(50, 421, 300, 200);
	panel.setBackground(new Color(0, 204, 255));
	panel.setBorder(new TitledBorder(null, "AI", TitledBorder.CENTER, TitledBorder.TOP, new Font("Arial", Font.ITALIC, 74), Color.green));
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
	rdbtnNewRadioButton.setBounds(53, 51, 109, 23);
	frame.getContentPane().add(rdbtnNewRadioButton);
	
	JComboBox comboBox = new JComboBox();
	comboBox.setBounds(100, 196, 28, 20);
	frame.getContentPane().add(comboBox);
	
	
	g=new JButton(new ImageIcon("C:\\Users\\Raman\\Pictures\\propic.jpg"));
	g.setBounds(262, 11, 363, 391);
	frame.getContentPane().add(g);
	
	g.setText("enter");
	}
}
