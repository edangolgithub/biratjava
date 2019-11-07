package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

public class Ewin {

	private JFrame frame;
	JButton btn;
	JTextField tf;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ewin window = new Ewin();
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
	public Ewin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn= new JButton();
		btn.setText("register");
		btn.setBounds(458, 248, 100, 20);
		frame.getContentPane().add(btn);
		
		tf= new JTextField();
		tf.setBounds(267, 215, 100, 20);
		frame.getContentPane().add(tf);
		
		textField = new JTextField();
		textField.setBounds(458, 304, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 283, 246, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Birat Software");
		lblNewLabel.setFont(new Font("Tekton Pro Ext", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(153, 51, 255));
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(182, 11, 284, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 51));
		panel.setBounds(10, 64, 203, 150);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
	}
}
