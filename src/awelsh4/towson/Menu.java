package awelsh4.towson;

import java.util.ArrayList;


public class Menu
{
	private ArrayList<MenuItem> menu;
	private ItemBuilder builder;
	
	public Menu()
	{
		menu = new ArrayList<MenuItem>();
		builder = new ItemBuilder();
		
	}
	
	public void populateMenu()
	{
		
		menu.add(builder.preparePancakes());
		menu.add(builder.prepareBrioche());
		menu.add(builder.prepareWaffles());
		
		menu.add(builder.prepareFestival());
		menu.add(builder.prepareTurnover());
		
		menu.add(builder.prepareDuck());
		menu.add(builder.prepareLamb());
		menu.add(builder.prepareGoat());
	}
	
	public String getMenu()
	{
		String m = "";
		for (MenuItem item : menu)
		{
			m += item.getDesc() + "\n";
		}
		return m;
	}
	
	public MenuItem getItem(String desc)
	{
		for (MenuItem item : menu)
		{
			if (item.getDesc().equals(desc))
				return item;
		}
		return null;
	}
}
