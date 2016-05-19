package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

/**
 * 
 * @author IT Prouds & CO.
 *
 */
public class Notification {

	private Date dateNotif;
	private String textNotif; 
	
	/**
	 * Notification Builder
	 * @param date Notification's date
	 * @param text Notification's comment
	 */
	public Notification(Date date, String text)
	{
		this.dateNotif=date;
		this.textNotif=text;
	}
	
	/**
	 * @return Notification's date
	 */
	public Date getDate()
	{
		return this.dateNotif;
	}

	public String toString()
	{
		return "Notification:\n date: " + this.dateNotif +  "\n" + this.textNotif;
	}
}