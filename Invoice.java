package billing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JTable;

import java.awt.BorderLayout;

import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

public class Invoice extends JDialog implements ActionListener {
	private JTextField t;
	private JButton c;
	private JButton p;
	public Invoice() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOTAL");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 396, 81, 29);
		getContentPane().add(lblNewLabel);
		
		t = new JTextField();
		t.setBounds(237, 396, 86, 20);
		getContentPane().add(t);
		t.setColumns(10);
		
	    p = new JButton("Proceed");
		p.setBounds(134, 460, 89, 23);
		getContentPane().add(p);
		
		c = new JButton("Cancel");
		c.setBounds(285, 460, 89, 23);
		 ().add(c);
		setSize(400,600);
		p.addActionListener(this);
		c.addActionListener(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==p)
		{
	int yn=JOptionPane.showConfirmDialog(null,"Do you have a membership card?","MemberShip",JOptionPane.YES_NO_OPTION);
			if(yn==0)
			{
				new Card();
			}				
		}
		else if(ob==c)
		{
			System.exit(0);
		}

	
	}
		
	}
