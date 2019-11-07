package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Drake extends JFrame {

	private JPanel contentPane;
	private JTextField write;
	private JTextField give;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drake frame = new Drake();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Drake() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		write = new JTextField();
		write.setBounds(111, 58, 86, 20);
		contentPane.add(write);
		write.setColumns(10);
		give = new JTextField();
		give.setBounds(111, 359, 86, 20);
		contentPane.add(give);
		give.setColumns(10);
		
		JLabel you = new JLabel("New label");
		you.setBounds(251, 412, 46, 14);
		contentPane.add(you);
		
		
		JLabel display = new JLabel("New label");
		display.setBounds(286, 131, 46, 14);
		contentPane.add(display);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String a=write.getText();
				JOptionPane.showMessageDialog(null	, a);
				display.setText(a);
				
				
			}
		});
		btnNewButton.setBounds(111, 127, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
			  String f=give.getText();
			  JOptionPane.showMessageDialog(null, f);
			  you.setText(f);
			}
		});
		btnNewButton_1.setBounds(111, 403, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(523, 390, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(566, 448, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(426, 358, 89, 23);
		contentPane.add(btnNewButton_3);
		
	
		
		
	
	}

}
