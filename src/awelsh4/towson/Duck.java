package awelsh4.towson;

public class Duck implements Ingredient{
	private static int pieces = 200;
	private static Duck instance = new Duck();
	private String name = "Duck";
	
	private Duck()
	{
		
	}
	
	public static Duck getInstance()
	{
		if (pieces > 0)
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
