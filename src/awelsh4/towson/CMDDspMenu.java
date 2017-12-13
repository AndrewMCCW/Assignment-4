package awelsh4.towson;

public class CMDDspMenu implements CMD {
	private Menu menu;
	private Aggregator agg;
	
	CMDDspMenu (Aggregator agg)
	{
		this.agg = agg;
		menu = agg.getMenu();
	}

	@Override
	public void execute() {
		menu.populateMenu();
		
		System.out.println(menu.getMenu());
	}

}
