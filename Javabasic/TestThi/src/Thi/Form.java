package Thi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
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
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Courses Management");
		lblNewLabel.setBounds(291, 53, 146, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAdd = new JButton("Add a new Courses");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormAdd f = new FormAdd();
				f.main(null);
			}
		});
		btnAdd.setBounds(198, 123, 308, 41);
		frame.getContentPane().add(btnAdd);
		
		JButton btnShow = new JButton("Display all Courses");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				FormView f = new FormView();
				f.main(null);
			}
		});
		btnShow.setBounds(198, 184, 308, 41);
		frame.getContentPane().add(btnShow);
		
		JButton btnSearch = new JButton("Search Courses by Courses Code");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSearch f = new FormSearch();
				f.main(null);
			}
			
		});
		btnSearch.setBounds(198, 251, 308, 41);
		frame.getContentPane().add(btnSearch);
		
		JButton btnExit = new JButton("Exit Application");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(198, 318, 308, 41);
		frame.getContentPane().add(btnExit);
	}
}
