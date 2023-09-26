import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class Label{
	public static void main(String[] args){
			
		ImageIcon image = new ImageIcon("VSAUCE.jfif");

		Border border = BorderFactory.createLineBorder(Color.green,3);

		JLabel label = new JLabel();	
		label.setText("HEY VSAUCE, MICHAEL HERE!!!!");
		label.setIcon(image);	
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(new Color(120,50,250));
		label.setFont(new Font("Comic Sans" ,Font.ITALIC,22));
		label.setIconTextGap(100);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);	
		//label.setBounds(30,30, 700, 700);

		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		//frame.setSize(1000,1000);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		

	}
}	