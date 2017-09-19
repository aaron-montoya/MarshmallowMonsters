package monster.view;

import javax.swing.JOptionPane;

public class MonsterDisplay
{
	public void displayText(String text_to_display)
	{
		JOptionPane.showMessageDialog(null, text_to_display);
	}
	
	public String getResponse(String question_to_display)
	{
		String answer = "";
		answer += JOptionPane.showInputDialog(null, question_to_display);
		return answer;
	}
}
