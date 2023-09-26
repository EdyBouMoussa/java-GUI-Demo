import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JLabel;


public class MyFrame2 extends JFrame{
	JButton button;
	JLabel label;

	public MyFrame2(){
		ImageIcon icon = new ImageIcon("VSAUCE2.jpg");
		
		label = new JLabel();
		label.setText("HEY VSAUCE, MICHAEL HERE!!!!");
		label.setIcon(icon);
		label.setVisible(false);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setFont(new Font("Times New Roman" , Font.BOLD , 30));
		label.setIconTextGap(100);
		
		

		button = new JButton();
		button.setBounds(200,100,400,50);
		button.addActionListener(e -> {label.setVisible(true);button.setVisible(false);});
		button.setText("Click to get VSauce");
		button.setFocusable(false); 
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Comic Sans" , Font.BOLD , 25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createEtchedBorder());
		button.setEnabled(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLayout(null);
		this.setSize(700,700);
		this.setVisible(true);
		this.add(button);
		this.add(label);

	}	
	
}