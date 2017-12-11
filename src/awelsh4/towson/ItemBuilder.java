package awelsh4.towson;

public class ItemBuilder {
	
	private MenuItem buttermilkPancakes;
	private MenuItem chickenWaffles;
	private MenuItem bananaBrioche;
	
	private MenuItem festival;
	private MenuItem beefTurnover;
	
	private MenuItem curryGoat;
	private MenuItem roastedDuck;
	private MenuItem curryLamb;

	
	
	public MenuItem preparePancakes()
	{
		buttermilkPancakes = new MenuItem();
		buttermilkPancakes.addIngredient(Eggs.getInstance());
		buttermilkPancakes.addIngredient(Milk.getInstance());
		buttermilkPancakes.addIngredient(Flour.getInstance());
		buttermilkPancakes.addIngredient(Sugar.getInstance());
		
		buttermilkPancakes.setInfo("Butter Milk Pancakes", 14.99, "Non-Vegan");
		return buttermilkPancakes;
	}
	
	public MenuItem prepareWaffles()
	{
		chickenWaffles = new MenuItem();
		chickenWaffles.addIngredient(Chicken.getInstance());
		chickenWaffles.addIngredient(Eggs.getInstance());
		chickenWaffles.addIngredient(Flour.getInstance());
		chickenWaffles.addIngredient(Sugar.getInstance());
		chickenWaffles.addIngredient(Milk.getInstance());
		
		chickenWaffles.setInfo("Chicken and Waffles", 17.99, "Non-Vegan");
		return chickenWaffles;
	}
	
	public MenuItem prepareBrioche()
	{
		bananaBrioche = new MenuItem();
		bananaBrioche.addIngredient(Banana.getInstance());
		bananaBrioche.addIngredient(Milk.getInstance());
		bananaBrioche.addIngredient(Sugar.getInstance());
		bananaBrioche.addIngredient(Bread.getInstance());
		bananaBrioche.addIngredient(Eggs.getInstance());
		
		bananaBrioche.setInfo("Banana Brioche", 17.99, "Non-Vegan");
		
		return bananaBrioche;
	}
	
	public MenuItem prepareFestival()
	{
		festival = new MenuItem();
		festival.addIngredient(Flour.getInstance());
		festival.addIngredient(Cornmeal.getInstance());
		festival.addIngredient(Sugar.getInstance());
		festival.addIngredient(Chicken.getInstance());
		festival.addIngredient(Rice.getInstance());
		
		festival.setInfo("Festival with Rice and Peas", 20.99, "Non-Vegan");
		return festival;
	}
	
	public MenuItem prepareTurnover()
	{
		beefTurnover = new MenuItem();
		beefTurnover.addIngredient(Beef.getInstance());
		beefTurnover.addIngredient(Flour.getInstance());
		beefTurnover.addIngredient(Sugar.getInstance());
		beefTurnover.addIngredient(Rice.getInstance());
		
		beefTurnover.setInfo("Beef Patty", 17.80, "Non-Vegan");
		return beefTurnover;
	}
	
	public MenuItem prepareGoat()
	{
		curryGoat = new MenuItem();
		curryGoat.addIngredient(Rice.getInstance());
		curryGoat.addIngredient(Goat.getInstance());
		curryGoat.addIngredient(Spinach.getInstance());
		
		curryGoat.setInfo("Curry Goat", 19.85, "Non-Vegan");
		return curryGoat;
	}
	
	public MenuItem prepareDuck()
	{
		roastedDuck = new MenuItem();
		roastedDuck.addIngredient(Rice.getInstance());
		roastedDuck.addIngredient(Duck.getInstance());
		roastedDuck.addIngredient(Spinach.getInstance());

		roastedDuck.setInfo("Roasted Duck with Risotto", 27.99, "Non-Vegan");
		return roastedDuck;
	}
	
	public MenuItem prepareLamb()
	{
		curryLamb = new MenuItem();
		curryLamb.addIngredient(Rice.getInstance());
		curryLamb.addIngredient(Lamb.getInstance());
		curryLamb.addIngredient(Spinach.getInstance());
	
		curryLamb.setInfo("Curry Lamb with Rice and Spinach", 22.00, "Non-Vegan");
		return curryLamb;
	}
	

}
