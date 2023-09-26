import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissor{
	public static void main(String[] args){
		String[] options = {"rock" , "paper" , "scissor"};
		Random rnd = new Random();
		int computerOption, playerOption;
		String result;
	
		playerOption = JOptionPane.showOptionDialog(null,"Play","Pick",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
		System.out.println( "You chose " + options[playerOption]);

		computerOption = rnd.nextInt(4);
		System.out.println( "Computer chose " + options[computerOption] );

		if ((playerOption - computerOption) == 1 || (playerOption - computerOption) == -3){
			result = "YOU WIN!!!!!";	
		}
		else if ( playerOption == computerOption){
			result = "TIE";
		}
		else{
			result = "YOU LOSE";
		}
		
		JOptionPane.showMessageDialog(null,result);
	}
}