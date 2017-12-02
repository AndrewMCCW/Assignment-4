package awelsh4.towson;

public class SystemInterface {

	private static Invoker invoker;
	
	public static void initSystem()
	{
		invoker = new Invoker (new Aggregator());
	}
	
	public String getMenu()
	{
		return "";
	}
	public static void main (String [] args)
	{
		
	}
}
