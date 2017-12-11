package awelsh4.towson.ingredients;

public class Beef implements Ingredient {
	private static double oz = 200.0;
	private static Beef instance = new Beef();
	private String name = "Beef";
	
	private Beef()
	{
	}
	
	public static Beef getInstance()
	{
		if (oz > 0.0)
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
