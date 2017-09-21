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
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = myScanner.nextInt();
		if(consumed == 0) {
			System.out.println("Thank you for not eating my eyes :)" );
		}
		else if(consumed < 0) {
			System.out.println("You can't eat negative eyes ya doof.");
		}
		else if(currentMonster.getEyeCount() - consumed < 0)
		{
			System.out.println("You can't eat more eyes than I have.");
		}
		else if(currentMonster.getEyeCount() - consumed == 1)
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			System.out.println("Now I have 1 eye left.");
		}
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			System.out.println("Now I have " + currentMonster.getEyeCount() + " eyes left.");
		}
		
		
		
		System.out.println(currentMonster.getName() + " wants to know how many arms are you interested in eating? I have " + currentMonster.getArmCount());
		int arm_eat = myScanner.nextInt();
		
		if(arm_eat == 0)
		{
			System.out.println("Not hungry? So sad...");
		}
		else if(arm_eat < 0) {
			System.out.println("Reality is hard for you...It is impossible to eat a negative amount.");
		}
		else if(currentMonster.getArmCount() - arm_eat < 0)
		{
			System.out.println("Math is hard for you...You can't eat more arms then I have.");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - arm_eat);
			System.out.println("Okay, now I have " + currentMonster.getArmCount() + " arm(s).");
		}
		
		popup.displayText("Hi there! Ready to play?");
		String answer = popup.getResponse("What is the air speed of a coconut laden swallow?");
		System.out.println(answer);
		
		myScanner.close();
	}
}













