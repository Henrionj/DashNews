package fr.iutvalence.info.dut.m2107.dashnews.item;

import java.util.Collection;


/**
 * @author IT Prouds & CO.
 */
public class Day {
	
	/**
	 * Default days's names
	 */
	private static final String[] DAY_NAMES = {"Dimanche","Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi"};
	
	/**
	 * Day's list of notifications
	 */
	Collection<Notification> myNotifications;
	
	/**
	 * Day's number
	 */
	private int number;
	
	/**
	 * Day's name
	 */
	private String name;
	
	/**
	 * Day's number of year
	 */
	private int myYear;
	
	/**
	 * Day's number of month
	 */
	private int myMonth;
	/**
	 * Day's constructor
	 * help:
	 * https://fr.wikibooks.org/wiki/Curiosit%C3%A9s_math%C3%A9matiques/Trouver_le_jour_de_la_semaine_avec_une_date_donn%C3%A9e
	 */
	// if m >= 3 D = { [(23m)/9] + d + 4 + y + [y/4] - [y/100] + [y/400] - 2 } mod 7
	// if m < 3  D = { [(23m)/9] + d + 4 + y + [z/4] - [z/100] + [z/400] } mod 7
	public Day(int monthnumber, int number, int year)
	{
		this.number = number;
		
		this.myYear = year;
		
		this.myMonth = monthnumber;
		
		if(this.myMonth<=3)
			this.name = DAY_NAMES[(((23*this.myMonth)/9) + this.number + 4 + this.myYear + (this.myYear/4) - (this.myYear/100) + (this.myYear/400) - 2) % 7];
		else 
			this.name = DAY_NAMES[(((23*this.myMonth)/9) + this.number + 4 + this.myYear + ((this.myYear-1)/4) - ((this.myYear-1)/100) + ((this.myYear-1)/400)) % 7];
		
		this.myNotifications = null;
	}
	
	/**
	 * Add a notification to the Day
	 * @param notif The notification to add
	 */
	public void addNotification(Notification notif)
	{
		this.myNotifications.add(notif);
	}
	
	/**
	 * Check if a notification is available
	 */
	private void notifyVerification() 
	{
		for(Notification notification : this.myNotifications)
		{ 
			if (notification.getDate()==java.util.Calendar.getInstance().getTime())
			{
				javax.swing.JOptionPane.showMessageDialog(null,notification.toString()); 
			}
		}
	}

	/**
	 * Number getter
	 * @return Day's number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Name getter
	 * @return Day's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Number of year getter
	 * @return Day's number of year
	 */
	public int getMyYear() {
		return myYear;
	}

	/**
	 * Number of month getter
	 * @return Day's number of month
	 */
	public int getMyMonth() {
		return myMonth;
	}
	
	
}
