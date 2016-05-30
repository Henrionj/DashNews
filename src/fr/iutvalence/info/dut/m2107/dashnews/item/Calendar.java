package fr.iutvalence.info.dut.m2107.dashnews.item;
<<<<<<< HEAD
import java.util.Collection;
=======

>>>>>>> branch 'master' of https://github.com/Henrionj/DashNews.git
 
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
	 * Calendar's name 
	 */
	private String nameCalendrier;
	
	/**
	 * Table which stores Years
	 */
	private Year[] myYears;
	
	/**
	 * Creates a calendar with default length and height, a name and without notifications. 
	 * @param name The name of the calendar.
	 */
	public Calendar(String name,int length,int height)
	{
		super(length,height);
		
		this.nameCalendrier=name;
		
		this.myYears=new Year[NUMBER_OF_YEAR];
		
		for (int i = 2015; i < 2018; i++)
		{
			this.myYears[i-2015] = new Year(i);
		}
	}

<<<<<<< HEAD
}
=======
	/**
	 * Name getter
	 * @return Calendar's name
	 */
	public String getNameCalendrier() {
		return nameCalendrier;
	}

	/**
	 * Years getter
	 * @return Calendar's Years
	 */
	public Year[] getMyYears() {
		return myYears;
	}
}
>>>>>>> branch 'master' of https://github.com/Henrionj/DashNews.git
