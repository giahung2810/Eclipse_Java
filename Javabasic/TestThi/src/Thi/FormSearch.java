package Thi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormSearch {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSearch window = new FormSearch();
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
	public FormSearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Code");
		lblNewLabel.setBounds(62, 102, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(62, 164, 68, 14);
		frame.getContentPane().add(lblCourseName);
		
		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setBounds(62, 238, 68, 14);
		frame.getContentPane().add(lblCredit);
		
		textField = new JTextField();
		textField.setBounds(179, 99, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(179, 161, 202, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(179, 235, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(373, 98, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
