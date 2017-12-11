package awelsh4.towson;

public class Rice implements Ingredient {
	private static double lbs = 40.0;
	private double oz;
	private static Rice instance = new Rice();
	private String name = "Rice";
	
	private Rice()
	{
		
	}
	
	
	public static Rice getInstance()
	{
		if (lbs > 0)
		{
			return instance;
		}
		
		return null;
	}

	@Override
	public void sub(int ounces) {
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public String getAmount()
	{
		oz = lbs * 16.0;
		return "You have " + lbs + " lbs" + "(" + oz + " ounces) left of " + name;
	}
}
