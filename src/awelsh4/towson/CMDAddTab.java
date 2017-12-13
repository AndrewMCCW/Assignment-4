package awelsh4.towson;

public class CMDAddTab implements CMD {
	private Aggregator agg;
	private Tabs tabs;
	private String name;
	
	public CMDAddTab(Aggregator agg, String name)
	{
		this.agg = agg;
		tabs = agg.getTabs();
		this.name = name;
	}
	
	@Override
	public void execute() {
		tabs.addTab(name);
	}

}
