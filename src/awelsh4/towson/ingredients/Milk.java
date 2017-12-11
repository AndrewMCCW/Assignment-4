package awelsh4.towson.ingredients;

public class Milk implements Ingredient{
	private static double cups = 320; 
	private static Milk instance = new Milk();
	private String name = "Milk";
	
	private Milk()
	{
		
	}
	
	public static Milk getInstance()
	{
		if(cups > 0)
			return instance;
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
