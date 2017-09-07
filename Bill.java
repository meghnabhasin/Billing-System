package billing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.SystemColor;

public class Bill extends JDialog implements ActionListener
{
	//JFrame frame;
	private JTextField epc;
	private JTextField q;
    private JButton atc;
    private JButton e;
	private JButton pwo;
    public Bill() {
    	//frame=new JFrame("Billing");
		//frame.getContentPane().setBackground(SystemColor.menu);
		getContentPane().setFont(new Font("Arial Black", Font.BOLD, 25));
		// TODO Auto-generated constructor stub
		getContentPane().setLayout(null);
		
		epc = new JTextField();
		epc.setBounds(152, 85, 105, 20);
		getContentPane().add(epc);
		epc.setColumns(10);
		
		JLabel lblEnterProductCode = new JLabel("Enter Product Code");
		lblEnterProductCode.setBounds(21, 88, 100, 14);
		getContentPane().add(lblEnterProductCode);
		
		JLabel lblPrice = new JLabel("Quantity");
		lblPrice.setBounds(31, 132, 53, 14);
		getContentPane().add(lblPrice);
		
		q = new JTextField();
		q.setBounds(152, 129, 105, 20);
		getContentPane().add(q);
		q.setColumns(10);
		
		atc = new JButton("Add To Cart");
		atc.setBounds(21, 180, 129, 23);
		getContentPane().add(atc);
		
		e = new JButton("Exit");
		e.setBounds(168, 180, 89, 23);
		getContentPane().add(e);
		
		JLabel lblBilling = new JLabel("Billing ");
		lblBilling.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblBilling.setBounds(102, 23, 129, 29);
		getContentPane().add(lblBilling);
		
	    pwo = new JButton("Proceed with The Order");
		pwo.setBounds(66, 250, 160, 23);
		getContentPane().add(pwo);
        e.addActionListener(this);
        atc.addActionListener(this);
        pwo.addActionListener(this);
		setSize(400,600);
        setModal(true);
        setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==atc)
				{
			
				}
		else if(ob==e)
		{
			System.exit(0);
		}
		else if(ob==pwo)
		{
		}
	}
}	
