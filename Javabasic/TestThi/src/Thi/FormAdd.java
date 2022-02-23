package Thi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormAdd {

	private JFrame frame;
	private JTextField txtCode;
	private JTextField txtName;
	private JTextField txtCredit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAdd window = new FormAdd();
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
	public FormAdd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codel");
		lblNewLabel.setBounds(89, 110, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(89, 170, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setBounds(89, 233, 46, 14);
		frame.getContentPane().add(lblCredit);
		
		txtCode = new JTextField();
		txtCode.setBounds(189, 107, 86, 20);
		frame.getContentPane().add(txtCode);
		txtCode.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(189, 167, 189, 20);
		frame.getContentPane().add(txtName);
		
		txtCredit = new JTextField();
		txtCredit.setColumns(10);
		txtCredit.setBounds(189, 230, 86, 20);
		frame.getContentPane().add(txtCredit);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(107, 309, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(313, 309, 89, 23);
		frame.getContentPane().add(btnClear);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
