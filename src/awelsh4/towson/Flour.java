package awelsh4.towson;

public class Flour implements Ingredient {
	private static double lbs = 20.0;
	private double oz;
	private static Flour instance = new Flour();
	private String name = "Flour";
	
	private Flour()
	{
		
	}
	
	public static Flour getInstance()
	{
		if (lbs > 0)
		{	
			return instance; 
		}
		return null;
	}
	@Override
	public void sub(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAmount() {
		// TODO Auto-generated method stub
		return null;
	}

}
