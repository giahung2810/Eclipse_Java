package De2;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Cau1 {

	private JFrame frame;
	private JTextField textField;
	
	public static final char SPACE = ' ';
	public static final char TAB = '\t';
	public static final char ENTER = '\n';
	
	public static int CountWords(String s)
	{
		if(s == null ) return -1;
		int count = 0;
		boolean notCount = true;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) != SPACE && s.charAt(i) != TAB && s.charAt(i) != ENTER )
			{
				if(notCount)
				{
					count++;
					notCount = false;
				}
			}
			else 
			{
				notCount = true;
			}
		}
		return count;
	}
	public String inMoiTu(String s)
    {
		StringBuilder result = new StringBuilder();
		String[] arrSt = s.split(" ");
		List<String> arr = new ArrayList<String>();		
		for (int i=0;i<arrSt.length;i++)
		arr.add(arrSt[i]);
		
		while (arr.size()>0 && arr.get(0)!=null) {
			if (arr.get(0).length()!=0) {
			int d=1;
			int j=1;
			while (j<arr.size()) {
				if (arr.get(j).equalsIgnoreCase(arr.get(0))) {
					d++;
					arr.remove(j);
				} else 
				j++;
			}
			//System.out.println(arr.get(0)+": "+d+" lan");
			result.append(arr.get(0)+": "+d+" lan\n");
			}
			arr.remove(0);
		}
		String k = result.toString();
		return k;
    }

	/*
	 * public static String ChuoiDao(String s) { StringBuffer reverse = new
	 * StringBuffer(s); return reverse.reverse().toString(); }
	 */
	public static String Chuoidao(String st)
    {
        String reverse = "";
        for(int i = st.length() - 1; i >= 0; i--)
        {
            reverse += st.charAt(i);
        }
        return reverse;
    }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau1 window = new Cau1();
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
	public Cau1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 717, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp chu\u1ED7i: ");
		lblNewLabel.setBounds(76, 46, 71, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblThcHin = new JLabel("Th\u1EF1c hi\u1EC7n: ");
		lblThcHin.setBounds(76, 99, 71, 27);
		frame.getContentPane().add(lblThcHin);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3:");
		lblKtQu.setBounds(76, 140, 71, 27);
		frame.getContentPane().add(lblKtQu);
		
		textField = new JTextField();
		textField.setBounds(229, 40, 360, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"dem tu", "dem tu trung lap", "dao chuoi"}));
		comboBox.setBounds(229, 104, 157, 22);
		frame.getContentPane().add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(229, 137, 360, 161);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox.getSelectedItem() == "dem tu")
				{
					String count = Integer.toString(CountWords(textField.getText()));
					textArea.append(count);
				}
				if(comboBox.getSelectedItem() == "dem tu trung lap")
				{
					String dem = inMoiTu(textField.getText());
					textArea.append(dem);
				}
				
				if(comboBox.getSelectedItem() == "dao chuoi")
				{
					String chuoi = Chuoidao(textField.getText());
					textArea.append(chuoi);
				}
			}
		});
		btnNewButton.setBounds(111, 324, 89, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);;
				textField.setText(null);
			}
		});
		btnReset.setBounds(321, 324, 89, 38);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(529, 324, 89, 38);
		frame.getContentPane().add(btnExit);
		
		
	}
}
