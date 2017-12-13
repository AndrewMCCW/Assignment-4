package awelsh4.towson;

public class CMDShowIngredients implements CMD {
	private Aggregator agg;
	private Observer observer;
	
	public CMDShowIngredients(Aggregator agg)
	{
		this.agg = agg;
		observer = agg.getObserver();
	}
	
	@Override
	public void execute() {
		System.out.println(observer.showIngredientAmount());
	}
	

}
