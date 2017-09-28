package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;
import java.util.List;
import java.util.ArrayList;

//Create the class
public class MonsterController
{
	//Create a MonsterDisplay object instance called popup
	private MonsterDisplay popup;
	
	private List<MarshmallowMonster> monsterList;
	
	
	//Create the constructor
	public MonsterController()
	{
		//Initialize popup
		popup = new MonsterDisplay();
		monsterList = new ArrayList <MarshmallowMonster>();
	}
	
	//Create the start method
	public void start()
	{
//		int count = 0;
//		while(count < 10)
//		{
//			popup.displayText("Am I not the coolest?");
//			count++;
//		}
		
//		for(int loop = 0; loop < 10; loop++)
//		{
//			popup.displayText("This is loop #" + (loop + 1) + " of ten");
//		}
		
		//Create MarshmallowMonster object instance called basic and initialize
		MarshmallowMonster basic = new MarshmallowMonster();		
		//Display the toString description as gui
		popup.displayText(basic.toString());
		//Create MarshmallowMonster object instance called gilmo and initialize
		MarshmallowMonster gilmo = new MarshmallowMonster("Gilmo", 7, 4, 2.2, true);
		popup.displayText(gilmo.toString());
		popup.displayText("I am hungry, I'm going to eat one of Gilmo's arms");
		gilmo.setArmCount(gilmo.getArmCount() - 1);
		popup.displayText(gilmo.toString());
	
		monsterList.add(basic);
		monsterList.add(gilmo);
		useList();
		
		//Call the interactWithMonster method and pass in the gilmo instance
		interactWithMonster(gilmo);
	}
	
	private void useList()
	{
		for(int index = 0; index < monsterList.size(); index++)
		{
			MarshmallowMonster currentMonster = monsterList.get(index);
			popup.displayText(currentMonster.getName());
			String updateName = popup.getResponse("What should my new name be?");
			currentMonster.setName(updateName);
			popup.displayText("You named me " + currentMonster.getName());
		}
		
		for(MarshmallowMonster current : monsterList)
		{
			popup.displayText("My name is " + current.getName());
		}
	}
	
	
	
	
	
	
	
	//Create the interactWithMonster method
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		
//		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		//Create and initialize the consumed variable
		int consumed = 0;
		//Create and initialize the response variable as gui
		String response = popup.getResponse(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		
		while(!isValidInteger(response))
		{
			popup.displayText("grrr type a better answer next time.");
			response = popup.getResponse("Type in an integer value!");
		}
		
		consumed = Integer.parseInt(response);

		if(consumed == 0)
		{
			popup.displayText("Thank you for not eating my eyes :)");
		}
		else if(consumed < 0)
		{
			popup.displayText("You can't eat negative eyes ya doof.");
		}
		else if(currentMonster.getEyeCount() - consumed < 0)
		{
			popup.displayText("You can't eat more eyes than I have.");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			popup.displayText("Now I have " + currentMonster.getEyeCount() + " eye(s) left.");
		}
				
		
//		System.out.println(currentMonster.getName() + " wants to know how many arms are you interested in eating? I have " + currentMonster.getArmCount());
		double tentacle_eat = 0.0;
		String tentacle_response = popup.getResponse(currentMonster.getName() + " wants to know how many tentacles are you interesting in eating? I have " + currentMonster.getTentacleAmount());
		
		if(!isValidDouble(tentacle_response))
		{
			popup.displayText("No, a double value.");
			tentacle_response = popup.getResponse("Type in a double value!");
		}
		tentacle_eat = Double.parseDouble(tentacle_response);
		
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
		
//		myScanner.close();
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















