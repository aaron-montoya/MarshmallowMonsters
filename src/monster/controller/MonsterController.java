package monster.controller;
import monster.model.MarshmallowMonster;

public class MonsterController
{
	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster gilmo = new MarshmallowMonster("Gilmo", 7, 4, 2.2, true);
		System.out.println(gilmo);
		System.out.println("I am hungry, I'm going to eat Gilmo's bloop");
	}
}
