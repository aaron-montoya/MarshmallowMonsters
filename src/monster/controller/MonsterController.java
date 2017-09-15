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
		
		myScanner.close();
	}
}
