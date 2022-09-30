package bca.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public GUI(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 500, 500));
		panel.setLayout(new GridLayout(0, 1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.pack();
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("jain_logo.png");
		//frame.setIconImage(image.getImage());
		//frame.setContentPane().setBackground(Color.green);
		JLabel label = new JLabel("This is my lable");
		label.setIcon(image);
		label.setVisible(true);
		frame.add(label);
	}
	public static void main(String[] args) {
		new GUI();
	}

}


class Demo{
	public static void main(String args[]) {
		int String = 20;
		System.out.println(String);
	}
}
