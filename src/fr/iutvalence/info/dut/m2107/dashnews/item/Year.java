package fr.iutvalence.info.dut.m2107.dashnews.item;

/**
 * @author IT Prouds & CO.
 */
public class Year {

	/**
	 * Year's default number of days
	 */
	private static final int NUMBER_OF_MONTH = 12;
	
	/**
	 * Year's number
	 */
	private int number;
	
	/**
	 * Is it a leap Year?
	 */
	private boolean isLeap;
	
	/**
	 * Table which stores Months
	 */
	private Month[] myMonths;
	
	/**
	 * Year's constructor
	 * @param number Year's number
	 */
	public Year(int number)
	{
		this.number=number;
		
		if ((number % 4 == 0 && number % 100 != 0)||number % 400 == 0)
			this.isLeap=true;
		
		else this.isLeap=false;
		
		this.myMonths=new Month[NUMBER_OF_MONTH];
		
		for (int i = 1; i <= NUMBER_OF_MONTH; i++)
		{
			this.myMonths[i]=new Month(i,this.number,this.isLeap);
		}
	}

	/**
	 * Number getter
	 * @return Year's number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * Boolean getter
	 * @return Boolean which says if this year is a leap year
	 */
	public boolean isLeap() {
		return isLeap;
	}

	/**
	 * Months getter
	 * @return Year's Months
	 */
	public Month[] getMyMonths() {
		return myMonths;
	}
}
