package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	private String name;
	private int eye_count;
	private int arm_count;
	private double tentacle_amount;
	private boolean has_bloop;
	
	public MarshmallowMonster()
	{
		//Initializes everything to 0, false, or null
	}
	
	public MarshmallowMonster(String name, int eye_count, int arm_count, double tentacle_amount, boolean has_bloop)
	{
		this.name = name;
		this.eye_count = eye_count;
		this.arm_count = arm_count;
		this.tentacle_amount = tentacle_amount;
		this.has_bloop = has_bloop;
	}
}
