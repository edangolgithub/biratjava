package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class Comt {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comt window = new Comt();
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
	public Comt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String football=(String) comboBox.getSelectedItem();
				switch (football)
				{
				case "messi":
					
				}
			
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"messi ", "ronaldo", "ronaldinho", "ribery", "kaka"}));
		comboBox.setBounds(190, 11, 281, 27);
		frame.getContentPane().add(comboBox);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 49));
		rdbtnMale.setForeground(new Color(30, 144, 255));
		rdbtnMale.setBounds(56, 148, 203, 57);
		frame.getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 49));
		rdbtnFemale.setForeground(new Color(255, 20, 147));
		rdbtnFemale.setBounds(257, 148, 248, 69);
		frame.getContentPane().add(rdbtnFemale);
		
		JButton btnWhatIsYour = new JButton("what is your gender?");
		btnWhatIsYour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Boolean se=false;
				if(rdbtnMale.isSelected())
				{
					JOptionPane.showMessageDialog(null, "you are male");
					se=true;
				}
				if(rdbtnFemale.isSelected())
				{
					JOptionPane.showMessageDialog(null, "you are femalemale");
					se=true;
				}
				if(se==false)
				{
					JOptionPane.showMessageDialog(null, "select your gender");
				}
			}
		});
		btnWhatIsYour.setForeground(Color.RED);
		btnWhatIsYour.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnWhatIsYour.setBounds(29, 257, 503, 74);
		frame.getContentPane().add(btnWhatIsYour);
		
		JCheckBox chckbxNepal = new JCheckBox("Nepal");
		chckbxNepal.setForeground(new Color(128, 128, 0));
		chckbxNepal.setFont(new Font("Tahoma", Font.PLAIN, 49));
		chckbxNepal.setBounds(57, 432, 190, 69);
		frame.getContentPane().add(chckbxNepal);
		
		JCheckBox chckbxIndia = new JCheckBox("India");
		chckbxIndia.setForeground(new Color(128, 128, 0));
		chckbxIndia.setFont(new Font("Tahoma", Font.PLAIN, 49));
		chckbxIndia.setBounds(265, 432, 190, 69);
		frame.getContentPane().add(chckbxIndia);
		
		JCheckBox chckbxChina = new JCheckBox("China");
		chckbxChina.setForeground(new Color(128, 128, 0));
		chckbxChina.setFont(new Font("Tahoma", Font.PLAIN, 49));
		chckbxChina.setBounds(464, 432, 190, 69);
		frame.getContentPane().add(chckbxChina);
		
		JButton btnWhatIsYour_1 = new JButton("what is your fave country?");
		btnWhatIsYour_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String values=null;
				boolean se=false;
				if(chckbxNepal.isSelected())
				{
					values+="Nepal ";
					se=true;
				}
				if(chckbxIndia.isSelected())
				{
					values+="India ";
					se=true;
				}
				if(chckbxChina.isSelected())
				{
					values+="China ";
					se=true;
				}
				if(se==false)
				{
					JOptionPane.showMessageDialog(null, "You have not selected any country");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have selected"+values);
				}
			}
		});
		btnWhatIsYour_1.setForeground(Color.RED);
		btnWhatIsYour_1.setFont(new Font("Tahoma", Font.PLAIN, 43));
		btnWhatIsYour_1.setBounds(69, 532, 540, 74);
		frame.getContentPane().add(btnWhatIsYour_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(257, 49, 307, 92);
		frame.getContentPane().add(textArea);
		
		passwordField =   
				
				
				
				
				new JPasswordField();
		passwordField.setBounds(241, 382, 230, 20);
		frame.getContentPane().add(passwordField);
	}
}
