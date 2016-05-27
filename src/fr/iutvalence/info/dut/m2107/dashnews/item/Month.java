package fr.iutvalence.info.dut.m2107.dashnews.item;

/**
 * @author IT Prouds & CO.
 *
 */

public class Month {

	/**
	 * return 31 days
	 */
	private final static int LENGTH_DAY_31 = 31;
	
	/**
	 * return 30 days
	 */
	private final static int LENGTH_DAY_30 = 30;
	
	/**
	 * return 29 days
	 */
	private final static int LENGTH_DAY_29 = 29;
	
	/**
	 * return 28 days
	 */
	private final static int LENGTH_DAY_28 = 28;
	
	/**
	 * Number of Months with 31 days
	 */
	private final static int[] MONTH_WITH_31_DAYS = {1,3,5,7,8,10,12};
	
	/**
	 * Number of Months with 30 days
	 */
	private final static int[] MONTH_WITH_30_DAYS = {4,6,9,11};
	
	/**
	 * Months's names
	 */
	private final static String[] MONTH_NAME = {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
	
	/**
	 * Month's number
	 */
	private int number;
	
	/**
	 * Month's name
	 */
	private String name;
	
	/**
	 * Month's number of year
	 */
	private int myYear;
	
	/**
	 * Table which stores Days
	 */
	private Day[] myDays;
	
	/**
	 * Month's constructor
	 * @param number Month's number
	 * @param numberYear Month's number of year
	 * @param leapYear Is it a leap Month?
	 */
	public Month(int number,int numberYear, boolean leapYear)
	{
		this.name = MONTH_NAME[number-1];
		
		this.myYear=numberYear;
		
		this.number=number;
		
		for (int i = 0; i < MONTH_WITH_31_DAYS.length; i ++)
		{
			if (this.number == MONTH_WITH_31_DAYS[i])
			{
				this.myDays = new Day[LENGTH_DAY_31];
				
				for (int j = 0; j < LENGTH_DAY_31; j++)
				{
					this.myDays[j] = new Day(this.number,j+1,this.myYear);
				}
			}
		}
		
		for (int i = 0; i < MONTH_WITH_30_DAYS.length; i ++)
		{
			if (this.number == MONTH_WITH_30_DAYS[i])
			{
				this.myDays = new Day[LENGTH_DAY_30];
				
				for (int j = 0; j < LENGTH_DAY_30; j++)
				{
					this.myDays[j] = new Day(this.number,j+1,this.myYear);
				}
			}
		}
		
		if (leapYear && this.number == 2)
		{
			this.myDays = new Day[LENGTH_DAY_29];
			
			for (int j = 0; j < LENGTH_DAY_29; j++)
			{
				this.myDays[j] = new Day(this.number,j+1,this.myYear);
			}
		}
		
		else if (!leapYear && this.number == 2)
		{
			this.myDays = new Day[LENGTH_DAY_28];
			
			for (int j = 0; j < LENGTH_DAY_28; j++)
			{
				this.myDays[j] = new Day(this.number,j+1,this.myYear);
			}
		}
	}

	/**
	 * Number getter
	 * @return Month's number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Name getter
	 * @return Month's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Number of year getter
	 * @return Month's number of year
	 */
	public int getMyYear() {
		return myYear;
	}

	/**
	 * Days getter
	 * @return table of Month's Days
	 */
	public Day[] getMyDays() {
		return myDays;
	}	
}
