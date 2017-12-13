package awelsh4.towson;

public class CMDSubmitOrder implements CMD {
	private Aggregator agg;
	private String name;
	private String order;
	private Person person;
	private MenuItem item;
	
	public CMDSubmitOrder(Aggregator agg, String name, String order)
	{
		this.agg = agg;
		this.name = name;
		this.order = order;
	}
	
	@Override
	public void execute() {
		person = agg.getPeople().findPerson(name);
		
		item = agg.getMenu().getItem(order);
		item.takeAway();
		
		person.addOrder(item);
	}

}
