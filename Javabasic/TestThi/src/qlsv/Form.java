package qlsv;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form {

	private JFrame frame;
	private JTable table;
	private JTextField textMSSV;
	private JTextField textName;
	private JTextField textAge;
	private JTextField textDC;
	private JTextField textSearch;
	static String[] colNames = { "MSSV", "TenSV", "Age", "Dia Chi", "ID_Lop", "Lop_SH" };
	
	static DAO dao = new DAO();
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
	
	public static List<String>  cbbSort()
	{
		List<String> list = new ArrayList<String>();
		String[] s = {"MSSV", "TenSV" ,"Age" ,"DiaChi","ID_Lop","Ten_Lop"};
		//Array[] arr = new  {"MSSV", "TenSV" ,"Age" ,"DiaChi","ID_Lop","Ten_Lop"};
		for(int i = 0 ; i<s.length ; i++)
		{
			list.add(s[i]);
		}
		return list;
	}
	@SuppressWarnings("static-access")
	public void Show(List<SV> list) throws ClassNotFoundException, SQLException
	{
		DefaultTableModel t = new DefaultTableModel(colNames,0);
		for(SV s : list)
		{
			String tenlop ="";
			for(LSH lsh : dao.ListLSH())
			{
				if(s.getId_lop() == lsh.getID_Lop())
				{
					tenlop = lsh.getTenLop();
					break;
				}
			}
			Object[] row = {s.getMssv(), s.getTenSV() , s.getAge(), s.getDiachi(), s.getId_lop(), tenlop};
			t.addRow(row);
		}
		table.setModel(t);
	}
	@SuppressWarnings("static-access")
	public void Search(List<SV> list, String tenSV) throws ClassNotFoundException, SQLException  {
		DefaultTableModel tableModel = new DefaultTableModel(colNames, 0);
		for (SV sv : list) {
			String tenlop = "";
			for (LSH lsh : dao.ListLSH()) {
				if (sv.getId_lop() == lsh.getID_Lop()) {
					tenlop = lsh.getTenLop();
					break;
				}
			}
			if (sv.getTenSV().contains(tenSV)) {
				Object[] row = { sv.getMssv(), sv.getTenSV(), sv.getAge(), sv.getDiachi(), sv.getId_lop(), tenlop };
				tableModel.addRow(row);
			}
		}
		table.setModel(tableModel);
	}
	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public Form() throws ClassNotFoundException, SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 758, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cbbLSH = new JComboBox();
		DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cbbLSH.getModel();
		for (CBBItem i : DAO.getCBBItem() ) {
			CBBItem cbb = new CBBItem(i.getId(), i.getDescription());
			dcbm.addElement(cbb);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 239, 722, 184);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("static-access")
			@Override
			public void mouseClicked(MouseEvent e) {
				String mssv = table.getValueAt(table.getSelectedRow(), 0).toString();
				String ten = table.getValueAt(table.getSelectedRow(), 1).toString();
				String age = table.getValueAt(table.getSelectedRow(), 2).toString();
				String diachi = table.getValueAt(table.getSelectedRow(), 3).toString();
				int id_lop = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 4).toString());
				String tenlop = table.getValueAt(table.getSelectedRow(), 5).toString();
				textMSSV.setText(mssv);
				textName.setText(ten);
				textAge.setText(age);
				textDC.setText(diachi);
				//textID_Lop.setText(String.valueOf(id_lop));
				//txtID_Lop.setEnabled(false);
				//id = (int) tableModel.getValueAt(tblSV.getSelectedRow(), 0);
				try {
					for (LSH lsh : DAO.ListLSH()) {
						if (lsh.getTenLop().equals(tenlop)) {
							cbbLSH.getModel().setSelectedItem(new CBBItem(id_lop, tenlop));
							break;
						}
}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"MSSV", "Name", "Age", "Dia Chi", "ID_Lop", "Lop_SH"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("MSSV:");
		lblNewLabel.setBounds(10, 11, 78, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 53, 78, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblLopsh = new JLabel("Lop_SH:");
		lblLopsh.setBounds(10, 105, 78, 14);
		frame.getContentPane().add(lblLopsh);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(439, 11, 46, 14);
		frame.getContentPane().add(lblAge);
		
		JLabel lblDiachi = new JLabel("DiaChi:");
		lblDiachi.setBounds(439, 53, 46, 14);
		frame.getContentPane().add(lblDiachi);
		
		cbbLSH.setModel(dcbm);
		cbbLSH.setBounds(98, 101, 110, 22);
		frame.getContentPane().add(cbbLSH);
		
		textMSSV = new JTextField();
		textMSSV.setBounds(98, 8, 273, 20);
		frame.getContentPane().add(textMSSV);
		textMSSV.setColumns(10);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(98, 50, 273, 20);
		frame.getContentPane().add(textName);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(524, 8, 208, 20);
		frame.getContentPane().add(textAge);
		
		textDC = new JTextField();
		textDC.setColumns(10);
		textDC.setBounds(524, 50, 208, 20);
		frame.getContentPane().add(textDC);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Show(DAO.ListAllSV());
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnShow.setBounds(27, 175, 89, 23);
		frame.getContentPane().add(btnShow);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mssv = textMSSV.getText();
				String ten = textName.getText();
				String age = textAge.getText();
				String diachi = textDC.getText();
				CBBItem item = (CBBItem) cbbLSH.getSelectedItem();
				int idlop =item.getId();
				SV sv = new SV(mssv,ten,age,diachi,idlop);
				
				try {
					DAO.Insert(sv);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					Show(DAO.ListAllSV());
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(152, 175, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectIndex = table.getSelectedRow(); 
				if(selectIndex >= 0)
				{
					String tensv = textName.getText();
					CBBItem item = (CBBItem) cbbLSH.getSelectedItem();
					int id_lop = (int) item.getId();
					String diachi = textDC.getText();
					String age = textAge.getText();
					SV std = null;
					try {
						std = DAO.ListAllSV().get(selectIndex);
					} catch (ClassNotFoundException | SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
					SV sv = new SV(std.getMssv(), tensv, age, diachi, id_lop);
					
					try {
						DAO.Update(sv);
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Show(DAO.ListAllSV());
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					textMSSV.setText("");
					textName.setText("");
					textAge.setText("");
					cbbLSH.setSelectedIndex(0);
					textDC.setText("");
					//textID_Lop.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(btnEdit, "hay chon sinh vien muon edit");
				}
			}
		});
		btnEdit.setBounds(280, 175, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		JButton btnDel = new JButton("Delete");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = table.getSelectedRow();
				if (selectedIndex >= 0) {
					SV std = null;
					try {
						std = DAO.ListAllSV().get(selectedIndex);
					} catch (ClassNotFoundException | SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					int option = JOptionPane.showConfirmDialog(btnDel, "Xoa khong may?");
					System.out.println("option : " + option);
					if (option == 0) {
						try {
							DAO.Delete(std.getMssv());
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						try {
							Show(DAO.ListAllSV());
						} catch (ClassNotFoundException | SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				try {
					Show(DAO.ListAllSV());
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				textName.setText("");
				textAge.setText("");
				cbbLSH.setSelectedIndex(0);
				textAge.setText("");
				textDC.setText("");
			}
		});
		btnDel.setBounds(406, 175, 89, 23);
		frame.getContentPane().add(btnDel);
		
		textSearch = new JTextField();
		textSearch.setBounds(439, 118, 192, 20);
		frame.getContentPane().add(textSearch);
		textSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tenSV = textSearch.getText();
				try {
					Search(DAO.ListAllSV(), tenSV);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setBounds(641, 117, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JComboBox cbbSort = new JComboBox();
		DefaultComboBoxModel cbbmd = (DefaultComboBoxModel) cbbSort.getModel();
		for (String i : cbbSort() ) {
			CBBItem cbb = new CBBItem(0, (String) i);
			cbbmd.addElement(cbb);
			
		}
		cbbSort.setModel(cbbmd);
		cbbSort.setBounds(534, 175, 97, 22);
		frame.getContentPane().add(cbbSort);
		
		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(641, 175, 89, 23);
		frame.getContentPane().add(btnSort);
	}
}
