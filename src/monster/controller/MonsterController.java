package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster gilmo = new MarshmallowMonster("Gilmo", 7, 4, 2.2, true);
		System.out.println(gilmo);
		System.out.println("I am hungry, I'm going to eat one of Gilmo's arms");
		gilmo.setArmCount(gilmo.getArmCount() - 1);
		System.out.println(gilmo);
		
		interactWithMonster(gilmo);
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " wants to know how many eyes you want to eat, please type in how many.");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster);
		
		System.out.println(currentMonster.getName() + " wants to know how many tentacles you want to eat, please type in how many.");
		double consumed_tentacles = myScanner.nextDouble();
		currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - consumed_tentacles);
		System.out.println(currentMonster);
		
		System.out.println("How many arms are you interested in eating? I have " + currentMonster.getArmCount());
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
		
		myScanner.close();
	}
}













