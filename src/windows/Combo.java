package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Combo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combo window = new Combo();
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
	public Combo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 693, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(105, 11, 403, 27);
		String[] colors= {"default","red","green","blue"};
		DefaultComboBoxModel model= new DefaultComboBoxModel(colors);
		comboBox.setModel(model);
		
		JLabel lblColor = new JLabel("color");
		lblColor.setForeground(Color.BLACK);
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblColor.setBounds(129, 106, 206, 46);
		frame.getContentPane().add(lblColor);
         JList list = new JList();
         list.addListSelectionListener(new ListSelectionListener() {
         	public void valueChanged(ListSelectionEvent arg0) {
String selectedcolor=list.getSelectedValue().toString();
				
				switch (selectedcolor) {
				case "red":
					lblColor.setForeground(Color.red);
					break;
				case "blue":
					lblColor.setForeground(Color.blue);
					break;
				case "green":
					lblColor.setForeground(Color.green);
					break;


				default:
					lblColor.setForeground(null);
					break;
				}
         	}
         });
         
         
         DefaultListModel<String> paint=new DefaultListModel<String>();
         paint.addElement("default");
		paint.addElement("red");
		paint.addElement("green");
		paint.addElement("blue");
		list.setBounds(161, 248, 280, 85);
		list.setModel(paint);
		frame.getContentPane().add(list);
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String selectedcolor=comboBox.getSelectedItem().toString();
				
				switch (selectedcolor) {
				case "red":
					frame.getContentPane().setBackground(Color.red);
					break;
				case "blue":
					frame.getContentPane().setBackground(Color.blue);
					break;
				case "green":
					frame.getContentPane().setBackground(Color.green);
					break;


				default:
					frame.getContentPane().setBackground(null);
					break;
				}
			}
		});
		
		
		frame.getContentPane().add(comboBox);
		
		
		
		
		
		
	}
}
