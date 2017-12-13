package awelsh4.towson;

public class CMDConnectTab implements CMD {
	private Aggregator agg;
	private Tabs tabs;
	private People people;
	private Tab tab;
	private Person person;
	private String person_name;
	private String tab_name;
	
	public CMDConnectTab(Aggregator agg, String person_name, String tab_name)
	{
		this.agg = agg;
		tabs = agg.getTabs();
		people = agg.getPeople();
		this.person_name = person_name;
		this.tab_name = tab_name;
	}
	
	@Override
	public void execute() {
		tab = tabs.findTab(tab_name);
		person = people.findPerson(person_name);
		
		person.addTab(tab);
		tab.addPerson(person);
	}

}
