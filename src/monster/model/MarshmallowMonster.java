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
	
	public String toString()
	{
		String desc = "I am a weird monster, others call me " + name + ". I have " + eye_count + " eyes, " + tentacle_amount + " tentacles, and I have " + arm_count + " arms. " + has_bloop + " tells you if I have a bloop";
		return desc;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEyeCount()
	{
		return eye_count;
	}
	
	public int getArmCount()
	{
		return arm_count;
	}
	
	public double getTentacleAmount()
	{
		return tentacle_amount;
	}
	
	public boolean hasBloop()
	{
		return has_bloop;
	}
	
	public void setName(String name)
	{
		this.name = name;	
	}
	
	public void setEyeCount(int eye_count)
	{
		this.eye_count = eye_count;
	}
	
	public void setArmCount(int arm_count)
	{
		this.arm_count = arm_count;
	}
	
	public void setTentacleAmount(double tentacle_amount)
	{
		this.tentacle_amount = tentacle_amount;
	}
	
	public void setBloop(boolean has_bloop)
	{
		this.has_bloop = has_bloop;	
	}
}













