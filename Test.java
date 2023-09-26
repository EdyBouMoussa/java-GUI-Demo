import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class Test{
	public static void main(String[] args){
	
		ImageIcon image1 = new ImageIcon("Coffee1.jpg");
		ImageIcon image2 = new ImageIcon("Coffee2.jpg");

		Border border1 = BorderFactory.createLineBorder(Color.green,3);
		Border border2 = BorderFactory.createMatteBorder(4,4,4,4,Color.blue);

		JLabel label1 = new JLabel();
		label1.setBounds(0,0,1000,200);
		label1.setText("Header");
		label1.setForeground(Color.blue);
		label1.setBackground(Color.gray);
		label1.setOpaque(true);
		label1.setFont(new Font("New Times Roman" , Font.BOLD , 20));
		label1.setBorder(border2);
		label1.setHorizontalTextPosition(JLabel.RIGHT);
		label1.setVerticalTextPosition(JLabel.TOP);

		JLabel label2 = new JLabel();
		label2.setBounds(0,200,200,500);
		label2.setText("Left");
		label2.setForeground(Color.black);
		label2.setBackground(Color.blue);
		label2.setOpaque(true);
		label2.setBorder(border2);

		JLabel label3 = new JLabel();
		label3.setBounds(800,200,200,500);
		label3.setText("Right");
		label3.setForeground(Color.black);
		label3.setBackground(Color.pink);
		label3.setOpaque(true);
		label3.setBorder(border2);
		
		JLabel label4 = new JLabel();
		label4.setBounds(200,200,600,500);
		label4.setText("BODY");
		label4.setForeground(Color.orange);
		label4.setBackground(Color.yellow);
		label4.setOpaque(true);
		label4.setBorder(border2);
		label4.setIcon(image2);
		label4.setIconTextGap(-30);
		label4.setHorizontalTextPosition(JLabel.CENTER);		

		JFrame frame = new JFrame();

		frame.setSize(1000,700);
		frame.setTitle("This is an example");
		frame.setIconImage(image1.getImage());
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getRootPane().setBorder(border1);
		frame.getContentPane().setBackground(Color.red);
		frame.setVisible(true);		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);		
		
	}
}