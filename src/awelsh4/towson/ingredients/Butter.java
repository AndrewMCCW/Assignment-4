package awelsh4.towson.ingredients;

public class Butter implements Ingredient{
	private static double lbs = 10.0; 
	private double oz;
	private static Butter instance = new Butter();
	private String name = "Butter";
	
	private Butter()
	{
		
	}
	
	public static Butter getInstance()
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
