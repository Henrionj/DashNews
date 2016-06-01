package fr.iutvalence.info.dut.m2107.dashnews.item;

 
/**
 * @author IT Prouds & CO.
 *
 */
public class Calendar extends Item {
	
	/**
	 * Default Calendar's number of Years
	 */
	private static final int NUMBER_OF_YEAR = 3;
	
	/**
	 * Table which stores Years
	 */
	private Year[] myYears;
	
	/**
	 * Creates a calendar with default length and height, a name and without notifications. 
	 * @param name The name of the calendar.
	 */
	public Calendar(int length,int height)
	{
		super(length,height);
		
		
		this.myYears=new Year[NUMBER_OF_YEAR];
		
		for (int i = 2015; i < 2018; i++)
		{
			this.myYears[i-2015] = new Year(i);
		}

	}

	/**
	 * Years getter
	 * @return Calendar's Years
	 */
	public Year[] getMyYears() {
		return myYears;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void actualize() {
		// TODO Auto-generated method stub
		
	}
}
