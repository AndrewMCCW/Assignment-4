package awelsh4.towson;

public interface Ingredient {
	
	public static Ingredient getInstance()
	{
		return null;
	}
	public void sub(int amount);
	public String getName();
	public String getAmount();
}


