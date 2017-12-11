package awelsh4.towson.ingredients;

public class Cornmeal implements Ingredient{
	private static double cups = 200.0;
	private static Cornmeal instance = new Cornmeal();
	private String name = "Cornmeal";
	
	private Cornmeal()
	{
		
	}
	
	public static Cornmeal getInstance()
	{
		if (cups > 0.0)
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
