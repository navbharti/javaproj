package bca.jain.jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	JFrame frame;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JTextField input1;
	JTextField input2;
	JButton btnSum;
	
	Calculator(){
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Simple Calculator");
		frame.setLayout(null);
		
		label1 = new JLabel();
		label1.setText("First Number: ");
		label1.setLocation(10, 10);
		label1.setSize(100, 10);
		
		label2 = new JLabel();
		label2.setText("Second Number: ");
		label2.setLocation(10, 50);
		label2.setSize(100, 10);
		
		label3 = new JLabel();
		label3.setText("Result: ");
		label3.setLocation(10, 150);
		label3.setSize(100, 10);
		
		input1 = new JTextField(50);
		input1.setSize(100, 30);
		input1.setLocation(150,  10);
		
		input2 = new JTextField();
		input2.setSize(100, 30);
		input2.setLocation(150,  50);
		
		btnSum = new JButton("Sum");
		btnSum.setLocation(10, 180);
		btnSum.setSize(100, 30);
		btnSum.addActionListener(this);
		input1.addActionListener(this);
		input2.addActionListener(this);

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		
		frame.add(input1);
		frame.add(input2);
		
		frame.add(btnSum);
		//frame.pack();
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = e.getActionCommand();
		if(btnName.equals("Sum")) {
			int num1 = Integer.parseInt(input1.getText());
			int num2 = Integer.parseInt(input2.getText());
			label3.setText(label3.getText()+(num1+num2));
			btnSum.setEnabled(false);
		}
	}

}
