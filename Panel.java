import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.BorderLayout;

public class Panel{
	public static void main(String[] args){

		ImageIcon im1 = new ImageIcon("thumbs_up.jpg");


		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(im1);
		label.setBounds(0,0,75,75);		

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(500,0,250,250);
		greenPanel.setLayout(null);
		greenPanel.add(label);	

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.setTitle("Label test");
		frame.add(redPanel);			
		frame.add(bluePanel);
		frame.add(greenPanel);
	
	}
}