package awelsh4.towson;

public class CMDDispTabs implements CMD {
	private Aggregator agg;
	private Tabs tabs;
	
	public CMDDispTabs(Aggregator agg)
	{
		this.agg = agg;
		tabs = agg.getTabs();
	}
	@Override
	public void execute() {
		System.out.println(tabs.getTabs());
	}

}
