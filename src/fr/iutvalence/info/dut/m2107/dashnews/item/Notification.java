package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

public class Notification {

	private Date dateNotif;
	private String textNotif; 
	
	public Date getDate()
	{
		return this.dateNotif;
	}

	public String toString()
	{
		return "Notification:\n date: " + this.dateNotif +  "\n" + this.textNotif;
	}
}