package pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JDialog implements ActionListener {
	private JTextField u;
	static String user;
	private JPasswordField passwordField;
JButton submit,forgot;
	public Login() {
		getContentPane().setBackground(SystemColor.textHighlight);
	getContentPane().setLayout(null);
	
	JLabel lblUsername = new JLabel("Username");
	lblUsername.setBounds(23, 53, 85, 24);
	getContentPane().add(lblUsername);
	
	JLabel lblPassword = new JLabel("Password");
	lblPassword.setBounds(23, 118, 85, 14);
	getContentPane().add(lblPassword);
	
	u = new JTextField();
	u.setBounds(143, 55, 86, 20);
	getContentPane().add(u);
	u.setColumns(10);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(143, 112, 86, 20);
	getContentPane().add(passwordField);
	
	submit = new JButton("Login");
	submit.setBackground(Color.PINK);
	submit.setMnemonic('l');
	submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	submit.setBounds(23, 154, 80, 23);
	getContentPane().add(submit);
	
	forgot = new JButton("Forgot Password");
	forgot.setBackground(Color.PINK);
	forgot.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});
	forgot.setMnemonic('f');
	forgot.setBounds(138, 154, 136, 23);
	getContentPane().add(forgot);
	submit.addActionListener(this);
	forgot.addActionListener(this);
	getRootPane().setDefaultButton(submit);
	setTitle("My Login Button");
	setLocationRelativeTo(null);
	setSize(300,250);
		// TODO Auto-generated constructor stub
	setVisible(true);

	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Login();
		//MyConnection.connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	Object ob=e.getSource();
	user=u.getText();
	if(ob==submit)
	{
		String pass= new String(passwordField.getPassword());
		String s="select * from Login where Username=? and Password=?";
		Connection c=MyConnection.connect();
		try {
			PreparedStatement ps=c.prepareStatement(s);
			ps.setString(1,user);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				JOptionPane.showMessageDialog(null,"ok");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid");
   }
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	}
}
