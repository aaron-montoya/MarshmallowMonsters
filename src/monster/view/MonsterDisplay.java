package monster.view;

import javax.swing.JOptionPane;

//Create the class
public class MonsterDisplay
{
	//Create the displayText method
	public void displayText(String text_to_display)
	{
		//Create message gui
		JOptionPane.showMessageDialog(null, text_to_display);
	}
	
	//Create the getResponse method
	public String getResponse(String question_to_display)
	{
		//Create answer variable and initialize to nothing
		String answer = "";
		//Set the answer variable to the input from the gui
		answer += JOptionPane.showInputDialog(null, question_to_display);
		return answer;
	}
}
