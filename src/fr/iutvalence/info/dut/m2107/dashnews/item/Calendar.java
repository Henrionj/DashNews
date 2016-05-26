package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.*;
 
/**
 * @author IT Prouds & CO.
 *
 */
public class Calendar extends Item {
	
	/**
	 * Default Calendar's size 
	 */
	private final static int CALENDAR_LENGHT = 0;

	/**
	 * Default Calendar's size 
	 */
	private final static int CALENDAR_HEIGHT = 0;
	
	/**
	 * Calendar's list of notifications
	 */
	Collection<Notification> myNotifications;
	
	/**
	 * Calendar's name 
	 */
	private String nameCalendrier;
	
	/**
	 * Creates a calendar with default length and height, a name and without notifications. 
	 * @param name The name of the calendar.
	 */
	public Calendar(String name) {
		super(CALENDAR_LENGHT,CALENDAR_HEIGHT);
		this.nameCalendrier=name;
		this.myNotifications=null;
	}
	
	/**
	 * Add a notification to the Calendar
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

}