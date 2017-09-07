package billing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

public class Card extends JDialog implements ActionListener{
JFrame frame;
	public Card() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		// TODO Auto-generated constructor stub
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeToBig = new JLabel("Welcome  To Big Bazaar Card  Privileges");
		lblWelcomeToBig.setFont(new Font("Stencil", Font.BOLD, 13));
		lblWelcomeToBig.setBounds(22, 23, 333, 30);
		getContentPane().add(lblWelcomeToBig);
        setSize(frame.getMaximumSize());		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
