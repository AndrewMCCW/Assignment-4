package awelsh4.towson;

import java.util.ArrayList;

public class Tabs {
	private ArrayList<Tab> allTabs = new ArrayList<Tab>(); //tabs in restaurant
	
	private static Tabs instance = new Tabs();
	
	private Tabs()
	{
		
	}
	
	public static Tabs getInstance()
	{
		return instance;
	}
	
	public void addTab(String name)
	{
		allTabs.add(new Tab(name));
	}
	
	public Tab findTab (String name)
	{
		for (Tab tab : allTabs)
		{
			if(tab.getName().toLowerCase().equals(name.toLowerCase()));
				return tab;
		}
		return null;
	}
	
	public String getTabs()
	{
		String s = "";
		for (Tab tab : allTabs)
		{
			s += tab.getName();
		}
		return s;
	}
}
