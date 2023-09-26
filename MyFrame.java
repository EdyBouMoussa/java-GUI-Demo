import javax.swing.*;
import java.awt.*;	

public class MyFrame extends JFrame{

	MyFrame(){
		this.setTitle("HEY VSAUCE"); //gives a title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of app
						//HIDE_ON_CLOSE --> hides the exit button
						//DO_NOTHING_ON_CLOSE --> exit button doesn't do anything
		this.setResizable(false); //prevents frame from being resised
		this.setSize(420,420); //sets the x-dim and y-dim
		this.setVisible(true); //makes frame visible

		ImageIcon image = new ImageIcon("VSAUCE.jfif"); //creates an image icon
		this.setIconImage(image.getImage()); //changes icon frame
		this.getContentPane().setBackground(new Color(100,50,250)); //changes color
	}
}