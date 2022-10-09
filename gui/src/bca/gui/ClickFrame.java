package bca.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickFrame extends JFrame implements ActionListener{
	JFrame frame;
	JButton button;
	
	ClickFrame(){
		frame = new JFrame();
		frame.setTitle("This is Click Frame");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		button = new JButton("Click me");
		button.setSize(100, 30);
		button.setLocation(10,  10);
		button.addActionListener(this);
		frame.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button is clicked!!!");
		JFrame frame1 = new JFrame("Add Data");
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame1.setSize(300, 300);
		//frame1.setLocation(20,  20);
		frame1.setVisible(true);
		
		JButton btn = new JButton("Add");
		btn.setSize(100, 30);
		btn.setLocation(10,  10);
		frame1.add(btn);
		
		
	}
}
