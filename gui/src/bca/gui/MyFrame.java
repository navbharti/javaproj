package bca.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JButton btn;
	JLabel label1, label2, label3, label4, label5, label6;
	JTextField input=null;
	
	MyFrame(){
		JFrame frame = new JFrame();
		
		 label1 = new JLabel("Enter PersonID: ");
		 input = new JTextField();
		 input.setSize(100, 20);
		//input.setText();
		input.setLocation(150, 10);
		 label2 = new JLabel("PersonID: ");
		 label3 = new JLabel("Last Name: ");
		 label4 = new JLabel("First Name: ");
		 label5 = new JLabel("Address: ");
		 label6 = new JLabel("City: ");
		label2.setLocation(10, 50); label2.setSize(200, 20);
		label3.setLocation(10, 70); label3.setSize(200, 20);
		label4.setLocation(10, 90); label4.setSize(200, 20);
		label5.setLocation(10, 110); label5.setSize(200, 20);
		label6.setLocation(10, 130); label6.setSize(200, 20);
		label1.setSize(100, 20);
		label1.setLocation(10, 10);
		
		btn = new JButton("Show");
		btn.setLocation(300, 10);
		btn.setSize(100, 20);
		btn.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.setSize(500, 500);
		//frame.pack();
		
		frame.setLocationRelativeTo(null);  
		frame.setVisible(true);
		frame.add(label1);
		
		frame.add(btn);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(input);
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		long id = Long.parseLong(input.getText());
		Person p=null;
		try {
			p = showPersons(id);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Button is clicked!!!");
		label2.setText(label2.getText()+p.getPersonID());
		label3.setText(label3.getText()+p.getLastName());
		label4.setText(label4.getText()+p.getFirstName());
		label5.setText(label5.getText()+p.getAddress());
		label6.setText(label6.getText()+p.getCity());
		btn.setEnabled(false);
		
		
	}
	
	public Person showPersons(long id) throws Exception {
		Person person = new Person();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pij", "root", "root@123");
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("SELECT * FROM Persons WHERE PersonID="+id);
		/*while(set.next()) {
			System.out.println("Id: "+ set.getLong(1) + 
					"\nLast Name: "+ set.getString(2)+ "\nFirst Name: "+ 
					set.getString(3)+ "\nAddress: "+set.getString(4)+ 
					"\nCity: "+ set.getString(5)+"\n");
		} */
		set.next();
		person.setPersonID(set.getLong(1));
		person.setLastName(set.getString(2));
		person.setFirstName(set.getString(3));
		person.setAddress(set.getString(4));
		person.setCity(set.getString(5));
		
		con.close();
		return person;
		
	}
}
