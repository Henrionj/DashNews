package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
 
public class Calendar extends Item {

	DateFormat date = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	Date currentdate = new Date();
	Collection<Notification> maNotification;
	private String nameCalendrier;
	
	/**
	 * @param size
	 */
	public Calendar(int size, String name) {
		super(size);
		this.nameCalendrier=name;
	}
	
	/**
	 * Add a notification to the Calendar
	 * @param notif The notification to add
	 */
	public void addNotification(Notification notif)
	{
		this.maNotification.add(notif);
	}
	
	// TODO
	private void notifyVerification() 
	{
		for(Notification notification : maNotification)
		{ 
			if (notification.getDate()==java.util.Calendar.getInstance().getTime())
			{
				//display notif
			}
		}
	}

}