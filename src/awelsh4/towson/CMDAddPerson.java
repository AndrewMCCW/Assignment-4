package awelsh4.towson;

public class CMDAddPerson implements CMD {
	private People people;
	private Aggregator agg;
	private String name;
	
	public CMDAddPerson(Aggregator agg, String name)
	{
		this.agg = agg;
		people = agg.getPeople();
		this.name = name;
	}

	@Override
	public void execute() {
		people.addPerson(name);
		
	}

}
