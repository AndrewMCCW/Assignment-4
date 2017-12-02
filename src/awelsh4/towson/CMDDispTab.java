package awelsh4.towson;

public class CMDDispTab implements CMD{
	private Tab tab;
	
	public CMDDispTab (Tab tab)
	{
		this.tab = tab;
	}
	
	@Override
	public void execute()
	{
		System.out.println(tab.getTab());
	}
}
