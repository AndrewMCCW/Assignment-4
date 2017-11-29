package awelsh4.towson;

import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> menu;
	
	public Menu ()
	{
		menu = new ArrayList<MenuItem>();
	}
	
	public void addMenuItem(MenuItem item)
	{
		menu.add(item);
	}
}
