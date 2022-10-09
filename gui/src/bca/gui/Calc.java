package bca.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calc extends JFrame implements ActionListener{

	JTextField input1;
	JTextField input2;
	JLabel label3;
	Calc(){
		JFrame calcFrame = new JFrame();
		//calcFrame.setTitle();
		calcFrame.setSize(300, 300);
		calcFrame.setTitle("My Simple Calculator");
		calcFrame.setVisible(true);
		calcFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);	//System.out.println("hello");
		calcFrame.setLayout(null);
		
		JLabel label1 = new JLabel();
		label1.setText("Frist Number: ");
		label1.setLocation(10, 10);
		label1.setSize(100, 30);
		
		JLabel label2 = new JLabel();
		label2.setText("Second Number: ");
		label2.setLocation(10, 50);
		label2.setSize(100, 30);
		
		 label3 = new JLabel();
		label3.setText("Result: ");
		label3.setLocation(10, 80);
		label3.setSize(100, 30);
		
		input1 = new JTextField();
		input1.setSize(100, 30);
		input1.setLocation(150, 10);
		
		 input2 = new JTextField();
		input2.setSize(100, 30);
		input2.setLocation(150, 50);
		
		JButton btn = new JButton("Sum");
		btn.setSize(100, 30);
		btn.setLocation(10, 150);
		btn.addActionListener(this);
		calcFrame.add(label1);
		calcFrame.add(label2);
		calcFrame.add(label3);
		calcFrame.add(input1);
		calcFrame.add(input2);
		calcFrame.add(btn);
	}
	public static void main(String[] args) {
		Calc c = new Calc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(input1.getText().equals("") || input1.getText()==null)
			System.out.println("First Number is not provided!!!");
		String str1 = input1.getText();
		int num1 = Integer.parseInt(str1);
		
		if(input2.getText().equals("") || input2.getText()==null)
			System.out.println("First Number is not provided!!!");
		String str2 = input2.getText();
		int num2 = Integer.parseInt(str2);
		
		int sum = num1 + num2;
		if(str1.equals("") || str1==null || str2.equals("") || str2==null)
			label3.setText("0");
		else
			label3.setText(label3.getText()+ sum);
		
		
	}

}
