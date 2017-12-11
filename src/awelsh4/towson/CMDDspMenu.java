package awelsh4.towson;

public class CMDDspMenu implements CMD {
	private Menu menu = new Menu();
	

	@Override
	public void execute() {
		menu.populateMenu();
		
		System.out.println(menu.getMenu());
	}

}
