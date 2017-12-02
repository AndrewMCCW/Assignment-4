package awelsh4.towson;

public class Spinach implements Ingredients {
	private static double lbs = 40.0;
	private static Spinach instance = new Spinach();
	
	private Spinach()
	{
		
	}
	
	public static Spinach getInstance()
	{
		if (lbs > 0)
		{
			return instance;
		}
		
		return null;
	}

	public void sub(int ounces) {
		switch(ounces)
		{
		case 1: lbs = lbs - .0625;
				break;
		case 2: lbs = lbs - .125;
				break;
		case 3: lbs = lbs - .1875;
				break;
		case 4: lbs = lbs - .25;
				break;
		case 5: lbs = lbs - .3125;
				break;
		case 6: lbs = lbs - .375;
				break;
		case 7: lbs = lbs - .4375;
				break;
		case 8: lbs = lbs - .5;
				break;
		case 9: lbs = lbs - .5625;
				break;
		case 10: lbs = lbs - .625;
				break;
		case 11: lbs = lbs - .6875;
				break;
		case 12: lbs = lbs - .75;
				break;
		case 13: lbs = lbs - .8125;
				break;
		case 14: lbs = lbs - .875;
				break;
		case 15: lbs = lbs - .9375;
				break;
		case 16: lbs = lbs - 1;
				break;
		}
	}
}
