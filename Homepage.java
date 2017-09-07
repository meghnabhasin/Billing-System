package pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;

public class Homepage implements ActionListener{
JFrame frame;
JMenuItem add,delete,update,id,view,ex1,ex2,ex3,ex4,cpclose;
	public Homepage() {
		frame=new JFrame("HOME PAGE . . . ");
		frame.getContentPane().setBackground(SystemColor.menu);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		frame.setJMenuBar(menuBar);
		
		JMenu mnEmployee = new JMenu("Employee");
		mnEmployee.setForeground(new Color(0, 0, 0));
		menuBar.add(mnEmployee);
		
		add = new JMenuItem("New");
		mnEmployee.add(add);
		
		update = new JMenuItem("Update");
		mnEmployee.add(update);
		
		delete = new JMenuItem("Delete");
		delete.setForeground(new Color(0, 0, 0));
		mnEmployee.add(delete);
		
		JMenu mnView = new JMenu("View");
		mnEmployee.add(mnView);
		
		id = new JMenuItem("By ID");
		mnView.add(id);
		
		view = new JMenuItem("View All");
		mnView.add(view);
		
		JMenu mnSubmenus = new JMenu("SubMenus");
		mnSubmenus.setForeground(new Color(0, 0, 0));
		menuBar.add(mnSubmenus);
		
		ex1 = new JMenuItem("Ex 1");
		mnSubmenus.add(ex1);
		
		ex2 = new JMenuItem("Ex2");
		mnSubmenus.add(ex2);
		
		ex3 = new JMenuItem("Ex 3");
		mnSubmenus.add(ex3);
		
		ex4 = new JMenuItem("Ex 4");
		mnSubmenus.add(ex4);
		
		JMenu mnExit = new JMenu("Exit");
		mnExit.setForeground(new Color(0, 0, 0));
		menuBar.add(mnExit);
		
		cpclose = new JMenuItem("Close Program");
		mnExit.add(cpclose);
		// TODO Auto-generated constructor stub
	frame.setSize(frame.getMaximumSize());
	add.addActionListener(this);
    update.addActionListener(this);
	delete.addActionListener(this);
	id.addActionListener(this);
	view.addActionListener(this);
	ex1.addActionListener(this);
ex2.addActionListener(this);
	ex3.addActionListener(this);
	ex4.addActionListener(this);
	cpclose.addActionListener(this);
	frame.setVisible(true);
	
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
new Homepage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object j = e.getSource();
		if(j== add)
		{
			new EmployeeNew();
		}
		else if(j== update)
		{
			String st=JOptionPane.showInputDialog(null,"Enter Employee ID");
		int w=Integer.parseInt(st);
		new EmployeeUpdate(w);
		}
		else if(j== delete)
		{
		}
		else if(j== id)
		{
		}
		else if(j== cpclose){

		int yn= JOptionPane.showConfirmDialog(null, "Sure to Exit","Swings",JOptionPane.YES_NO_OPTION);
				if(yn == 0)
				{
							System.exit(0);
				}
		}
		else if(j == ex1)
		{
			new Controls();
		}
		else if(j == ex2)
		{
		}
		else if(j == ex3)
		{
		}
		else if(j== view)
		{
		}
		else if(j== ex4){
		}
		
	}

}
