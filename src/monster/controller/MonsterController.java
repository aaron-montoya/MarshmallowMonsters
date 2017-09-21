package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
//		System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster gilmo = new MarshmallowMonster("Gilmo", 7, 4, 2.2, true);
//		System.out.println(gilmo);
		popup.displayText(gilmo.toString());
//		System.out.println("I am hungry, I'm going to eat one of Gilmo's arms");
		popup.displayText("I am hungry, I'm going to eat one of Gilmo's arms");
		gilmo.setArmCount(gilmo.getArmCount() - 1);
//		System.out.println(gilmo);
		popup.displayText(gilmo.toString());
		
		interactWithMonster(gilmo);
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = 0;
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		
		if(isValidInteger(response))
		{
			consumed = Integer.parseInt(response);
		}
		
//		int consumed = myScanner.nextInt();
		if(consumed == 0) {
//			System.out.println("Thank you for not eating my eyes :)" );
			popup.displayText("Thank you for not eating my eyes :)");
		}
		else if(consumed < 0) {
//			System.out.println("You can't eat negative eyes ya doof.");
			popup.displayText("You can't eat negative eyes ya doof.");
		}
		else if(currentMonster.getEyeCount() - consumed < 0)
		{
//			System.out.println("You can't eat more eyes than I have.");
			popup.displayText("You can't eat more eyes than I have.");
		}
		else if(currentMonster.getEyeCount() - consumed == 1)
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
//			System.out.println("Now I have 1 eye left.");
			popup.displayText("Now I have 1 eye left.");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
//			System.out.println("Now I have " + currentMonster.getEyeCount() + " eyes left.");
			popup.displayText("Now I have " + currentMonster.getEyeCount() + " eyes left.");
		}
		
//		System.out.println(currentMonster.getName() + " wants to know how many arms are you interested in eating? I have " + currentMonster.getArmCount());
		double tentacle_eat = 0.0;
		String tentacle_response = popup.getResponse(currentMonster.getName() + " wants to know how many tentacles are you interesting in eating? I have " + currentMonster.getTentacleAmount());
		if(isValidDouble(tentacle_response))
		{
			tentacle_eat = Double.parseDouble(tentacle_response);
		}
		
		if(tentacle_eat == 0)
		{
//			System.out.println("Not hungry? So sad...");
			popup.displayText("Not hungry? So sad... :(");
		}
		else if(tentacle_eat < 0) {
//			System.out.println("Reality is hard for you...It is impossible to eat a negative amount.");
			popup.displayText("Reality is hard for you...It is impossible to eat a negative armount.");
		}
		else if(currentMonster.getTentacleAmount() - tentacle_eat < 0)
		{
//			System.out.println("Math is hard for you...You can't eat more arms then I have.");
			popup.displayText("Math is hard for you...You can't eat more tentacles than I have.");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacle_eat);
//			System.out.println("Okay, now I have " + currentMonster.getArmCount() + " arm(s).");
			popup.displayText("Okay, now I have " + currentMonster.getTentacleAmount() + " tentacles(s).");
		}
		
		popup.displayText("Hi there! Ready to play?");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
//		System.out.println(answer);
		popup.displayText(answer);
		
		myScanner.close();
	}
	
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input an int. '" + sample + "' is not valid");
		}
		
		return valid;
	}
	
	private boolean isValidDouble(String sample_double)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sample_double);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input a double. '" + sample_double + "' is not valid");
		}
		
		return valid;
	}
	
	private boolean isValidBoolean(String sample_boolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sample_boolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input a boolean value. '" + sample_boolean + "' does not count.");
		}
		
		return valid;
	}
}















