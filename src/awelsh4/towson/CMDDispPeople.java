package awelsh4.towson;

public class CMDDispPeople implements CMD {
	private Aggregator agg;
	private People people;
	
	public CMDDispPeople(Aggregator agg)
	{
		this.agg = agg;
		people = agg.getPeople();
	}

	@Override
	public void execute() {
		System.out.println(people.getPeople());
	}

}
