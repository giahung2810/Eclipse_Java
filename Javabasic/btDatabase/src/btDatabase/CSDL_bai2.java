package btDatabase;

import java.awt.EventQueue;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CSDL_bai2 {
	java.sql.Connection connection;

	private JFrame frame;
	private JTextField txtInfor;
	private JTextField txtsql;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CSDL_bai2 window = new CSDL_bai2();
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
	public CSDL_bai2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 628, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtarea = new JTextArea();
		txtarea.setSelectionColor(Color.BLACK);
		txtarea.setEnabled(false);
		txtarea.setEditable(false);
		txtarea.setBounds(10, 80, 594, 294);
		frame.getContentPane().add(txtarea);
		
		JLabel lblNewLabel = new JLabel("Input Infor");
		lblNewLabel.setBounds(106, 26, 60, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SQL");
		lblNewLabel_1.setBounds(106, 49, 60, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtInfor = new JTextField();
		txtInfor.setBounds(210, 23, 246, 19);
		frame.getContentPane().add(txtInfor);
		txtInfor.setColumns(10);
		
		txtsql = new JTextField();
		txtsql.setBounds(210, 46, 246, 19);
		frame.getContentPane().add(txtsql);
		txtsql.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = txtInfor.getText();
				try {
					connection = DriverManager.getConnection(url,"giahung","giahung");
					if(connection != null)
					{
						System.out.println("Ket noi OK");
					}
					Statement stmt = connection.createStatement(); 
					String sql = txtsql.getText();
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next())
					{
						int id = rs.getInt("ID");
						String name = rs.getString("Name");
						String address = rs.getString("Address");
						double total = rs.getDouble("Total");
						txtarea.append("\t" + id + "\t"+" \t" + name+"\t"+" \t" + address +"\t"+ "\t "+"\t" + total + "\n");
						System.out.println("ID= " + id + " Name= "+ name + " Address =" +address + " Total=" + total);				
					}
					rs.close();
					stmt.close();	
				} catch (SQLException ex1) {
					System.out.println(ex1);
				}
			}
		});
		btnSubmit.setBounds(105, 384, 85, 21);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 txtInfor.setText(null);
			 txtsql.setText(null);
			 txtarea.setText(null);
			}
		});
		btnReset.setBounds(283, 384, 85, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(461, 384, 85, 21);
		frame.getContentPane().add(btnCancel);
	}
	
}
