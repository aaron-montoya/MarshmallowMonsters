package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	private String name;
	private int eye_count;
	private int arm_count;
	private double tentacle_amount;
	private boolean has_bloop;
	
	//Create a blank constructor
	public MarshmallowMonster()
	{
		//Initializes everything to 0, false, or null
	}
	
	//Create a constructor
	public MarshmallowMonster(String name, int eye_count, int arm_count, double tentacle_amount, boolean has_bloop)
	{
		//Set the variables to the entered parameters
		this.name = name;
		this.eye_count = eye_count;
		this.arm_count = arm_count;
		this.tentacle_amount = tentacle_amount;
		this.has_bloop = has_bloop;
	}
	
	//Create toString method
	public String toString()
	{
		//Initilize the description
		String desc = "I am a weird monster, others call me " + name + ". I have " + eye_count + " eyes, " + tentacle_amount + " tentacles, and I have " + arm_count + " arms. " + has_bloop + " tells you if I have a bloop";
		//Return the description
		return desc;
	}
	
	//Create getName method
	public String getName()
	{
		return name;
	}
	
	//Create getEyeCount method
	public int getEyeCount()
	{
		return eye_count;
	}
	
	//Create getArmCount method
	public int getArmCount()
	{
		return arm_count;
	}
	
	//Create getTentacleAmount method
	public double getTentacleAmount()
	{
		return tentacle_amount;
	}
	
	//Create hasBloop method
	public boolean hasBloop()
	{
		return has_bloop;
	}
	
	//Create setName method
	public void setName(String name)
	{
		//Set the name to the parameter
		this.name = name;	
	}
	
	//Create setEyeCount method
	public void setEyeCount(int eye_count)
	{
		//Set the eye_count to the parameter
		this.eye_count = eye_count;
	}
	
	//Create setArmCount method
	public void setArmCount(int arm_count)
	{
		//Set the arm_count to the parameter
		this.arm_count = arm_count;
	}
	
	//Create setTentacleAmount method
	public void setTentacleAmount(double tentacle_amount)
	{
		//Set the tentacle_amount to the parameter
		this.tentacle_amount = tentacle_amount;
	}
	
	//Create setBloop method
	public void setBloop(boolean has_bloop)
	{
		//Set has_bloop to the parameter
		this.has_bloop = has_bloop;	
	}
}













