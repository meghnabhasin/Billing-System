package pkg;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import java.awt.Font;

public class Controls extends JDialog implements ItemListener     {
	private JTextField gender;
	private JTextField radio;
	private JTextField check;
	private JTextField combo;
	JRadioButton m,f,hs,in,gr;
    JCheckBox sl,wa,ea;
    JComboBox city;
	public Controls() {
		getContentPane().setLayout(null);
		
		m = new JRadioButton("Male");
		m.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		m.setBounds(23, 37, 60, 23);
		getContentPane().add(m);
		
		f =new JRadioButton("Female");
		f.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		f.setBounds(23, 63, 70, 23);
		getContentPane().add(f);
		f.setOpaque(false);
		m.setOpaque(false);
		
		hs = new JRadioButton("Secondary");
		hs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		hs.setBounds(23, 108, 109, 23);
		getContentPane().add(hs);
		
		in = new JRadioButton("Sr. Secondary");
		in.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		in.setBounds(23, 134, 109, 23);
		getContentPane().add(in);
		
		gr = new JRadioButton("Graduate");
		gr.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		gr.setBounds(23, 160, 109, 23);
		getContentPane().add(gr);
		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg2= new ButtonGroup();
		bg1.add(m);
		bg1.add(f);
		bg2.add(hs);
		bg2.add(in);
		bg2.add(gr);
		sl = new JCheckBox("Sleeping");
		sl.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		sl.setBounds(22, 206, 97, 23);
		getContentPane().add(sl);
		
		wa = new JCheckBox("Whatsapp");
		wa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		wa.setBounds(23, 232, 97, 23);
		getContentPane().add(wa);
		
		ea = new JCheckBox("Eating");
		ea.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		ea.setBounds(23, 258, 97, 23);
		getContentPane().add(ea);
		
	    city = new JComboBox();
		city.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		city.setModel(new DefaultComboBoxModel(new String[] {"Select", "Lucknow", "Ahmedhabad", "Jaipur", "Delhi", "Mumbai", "Goa", "Kanpur", "Pune"}));
		city.setBounds(41, 316, 117, 20);
		getContentPane().add(city);
		
		gender = new JTextField();
		gender.setBounds(192, 38, 86, 20);
		getContentPane().add(gender);
		gender.setColumns(10);
		
		radio = new JTextField();
		radio.setBounds(192, 109, 146, 20);
		getContentPane().add(radio);
		radio.setColumns(10);
		
		check = new JTextField();
		check.setColumns(10);
		check.setBounds(192, 207, 146, 20);
		getContentPane().add(check);
		
		combo = new JTextField();
		combo.setColumns(10);
		combo.setBounds(192, 316, 124, 20);
		getContentPane().add(combo);
		setSize(400,600);
		hs.addItemListener(this);
		gr.addItemListener(this);
		wa.addItemListener(this);
		ea.addItemListener(this);
		in.addItemListener(this);
		city.addItemListener(this);
		sl.addItemListener(this);
		setModal(true);
		ImageIcon ii=new ImageIcon(getClass().getResource("file/bg.jpg"));
		JLabel img=new JLabel(ii);
		img.setBounds(0,0,400,600);
		add(img);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object ob= e.getSource();
		if(ob == hs)
		{
			radio.setText(hs.getText());
		}
		else if(ob == in)
		{
		radio.setText("10+2");	
		}
		else if(ob == gr)
		{
		radio.setText("Graduation");
		}
		else if(ob == sl || ob==ea|| ob==wa)
		{
			String msg="";
			if(sl.isSelected())
			{
 				msg+="Sleeping ";
			}
			if(wa.isSelected())
			{
				msg+="Whatsapp ";
			}
			if(ea.isSelected())
			{
			msg+="Eating ";
			}
			check.setText(msg.trim());
		}
		else if(ob== city)
		{
			String r=city.getSelectedItem().toString();
		combo.setText(r);
		}
	
	
	
	}
}
