package pkg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EmployeeUpdate extends JDialog implements ActionListener
{
	private JTextField tid;
	private JTextField tname;
	private JTextField tda;
	private JTextField ttax;
	private JTextField tbasic;
    JButton submit,cancel;
    JRadioButton m,f;
    JComboBox tcity;
    int id;
	public EmployeeUpdate(int id) {
		this.id=id;
		getContentPane().setBackground(new Color(102, 205, 170));
		getContentPane().setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		// TODO Auto-generated constructor stub
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(new Color(255, 0, 0));
		lblId.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblId.setBounds(32, 52, 76, 14);
		getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 0, 0));
		lblName.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblName.setBounds(32, 75, 76, 14);
		getContentPane().add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.RED);
		lblGender.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblGender.setBounds(32, 100, 76, 14);
		getContentPane().add(lblGender);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(Color.RED);
		lblCity.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblCity.setBounds(32, 125, 76, 14);
		getContentPane().add(lblCity);
		
		JLabel lblBasic = new JLabel("Basic");
		lblBasic.setForeground(Color.RED);
		lblBasic.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblBasic.setBounds(32, 147, 76, 14);
		getContentPane().add(lblBasic);
		
		JLabel lblDa = new JLabel("DA");
		lblDa.setForeground(Color.RED);
		lblDa.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblDa.setBounds(32, 172, 76, 14);
		getContentPane().add(lblDa);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setForeground(Color.RED);
		lblTax.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblTax.setBounds(32, 197, 76, 14);
		getContentPane().add(lblTax);
		
		tid = new JTextField(String.valueOf(id));
		tid.setBackground(Color.WHITE);
		tid.setEditable(false);
		tid.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tid.setBounds(186, 50, 86, 20);
		getContentPane().add(tid);
		tid.setColumns(10);
		
		tname = new JTextField();
		tname.setBackground(Color.WHITE);
		tname.setEditable(false);
		tname.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tname.setColumns(10);
		tname.setBounds(186, 73, 86, 20);
		getContentPane().add(tname);
		
		tda = new JTextField();
		tda.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tda.setColumns(10);
		tda.setBounds(186, 169, 86, 20);
		getContentPane().add(tda);
		
		ttax = new JTextField();
		ttax.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ttax.setColumns(10);
		ttax.setBounds(186, 195, 86, 20);
		getContentPane().add(ttax);
		
		tbasic = new JTextField();
		tbasic.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tbasic.setColumns(10);
		tbasic.setBounds(186, 145, 86, 20);
		getContentPane().add(tbasic);
		
	    m = new JRadioButton("Male");
	    m.setEnabled(false);
		m.setBounds(186, 97, 53, 23);
		getContentPane().add(m);
		
		 f = new JRadioButton("Female");
		 f.setEnabled(false);
		f.setBounds(248, 97, 59, 23);
		getContentPane().add(f);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(m);
		bg.add(f);
		
		
		tcity = new JComboBox();
		tcity.setModel(new DefaultComboBoxModel(new String[] {"Select", "Lucknow", "Delhi", "Jaipur", "Mumbai", "Hyderabad"}));
		tcity.setBounds(186, 123, 86, 20);
		getContentPane().add(tcity);
		
		submit = new JButton("Submit");
		submit.setBackground(new Color(0, 0, 0));
		submit.setForeground(new Color(148, 0, 211));
		submit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		submit.setBounds(10, 239, 135, 23);
		getContentPane().add(submit);
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancel.setBackground(new Color(0, 0, 0));
		cancel.setForeground(new Color(148, 0, 211));
		cancel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		cancel.setBounds(198, 239, 135, 23);
		getContentPane().add(cancel);
		submit.addActionListener(this);
         cancel.addActionListener(this);
		setSize(400,600);
        setModal(true);
        fillinfo();
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==cancel)
		{
			dispose();
		}
		else if(ob==submit)	
		{
			String city=tcity.getSelectedItem().toString();
			int basic=Integer.parseInt(tbasic.getText());
			int da=Integer.parseInt(tda.getText());
			int tax=Integer.parseInt(ttax.getText());
	String s="update employee set ecity=?,ebasic=?,eda=?,etax=? where eid=?";
	Connection con=MyConnection.connect();
	try {
		PreparedStatement ps=con.prepareStatement(s);
		ps.setString(1,city);
		ps.setInt(2,basic);
		ps.setInt(3, da);
			ps.setInt(4,tax);
			ps.setInt(5, id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null,"Updation Done");
			dispose();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		}
		
	}
void fillinfo()
{
	String s="select * from employee where eid=?";
	Connection con=MyConnection.connect();
	try {
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			tname.setText(rs.getString("ename"));
			if(rs.getString("egender").equalsIgnoreCase("Male"))
			{
				m.setSelected(true);
			}
			else
			{
				f.setSelected(true);
			}
			tcity.setSelectedItem(rs.getString("ecity"));
				tbasic.setText(String.valueOf(rs.getInt("ebasic")));
				tda.setText(String.valueOf(rs.getInt("eda")));
				ttax.setText(String.valueOf(rs.getInt("etax")));
			}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}