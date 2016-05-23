package fr.iutvalence.info.dut.m2107.dashnews;
import java.util.*;

import fr.iutvalence.info.dut.m2107.dashnews.ihm.Page;
import fr.iutvalence.info.dut.m2107.dashnews.item.Item;
/**
 * Class Application.
 * @author  IT Prouds & CO.
 *
 */
public class Application {

	/**
	 * Collection of pages.
	 */
	Collection<Page> digitIndicator;
	/**
	 * A calendar.
	 */
	Item calendar;
	/**
	 * Actual session.
	 */
	Session mySession;
	/**
	 * Company's name.
	 */
	private String companyName;
	
	public Application(String login, String password, String companyName)
	{
		this.mySession = new Session(login, password);
		this.companyName = companyName;
	}
	
	/**
	 * 
	 */
	public void create() {
	
	}
	
	
	/**
	 * Checks if user has enough privileges.
	 */
	public void checkPrivileges() {
		Privileges privileges = this.mySession.getPrivileges();
	}
	
	/**
	 * Asks confirmation of user.
	 */
	public void askModification() {
		
	
	}

	/**
	 * Deletes an item.
	 * @param item
	 */
	public void delete(Item item) {
	
	
	}

}
