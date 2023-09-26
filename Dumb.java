import javax.swing.*;

public class Dumb{
	static boolean isDumb = true;

	static void layout(){
		int input;

		input = JOptionPane.showConfirmDialog(null,"Are You Dumb","Are You Dumb?", JOptionPane.YES_NO_OPTION);
		
		isDumb = (input==0) ? false : true;

	}	

	public static void main(String[] args){
		while(isDumb){
			layout();
			}
		if (!isDumb){
			JOptionPane.showMessageDialog(null,"I Knew It!!!");
		}
	}
}