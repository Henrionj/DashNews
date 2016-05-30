package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

import javax.swing.JPanel;

/**
 * Abstract class Item.
 * @author  IT Prouds & CO.
 *
 */
public abstract class Item {
 
	private Date addingDate;

	/**
	 * Item's length
	 */
	private int length;
	
	/**
	 * Item's height
	 */
	private int height;
	
	/**
	 * Creates an item.
<<<<<<< HEAD
	 * @param length 
	 * @param height 
	 * 
=======
	 * @param length The length of an item.
	 * @param height The height of an item.
>>>>>>> branch 'master' of https://github.com/Henrionj/DashNews.git
	 */
	public Item(int length,int height) {
		this.addingDate = java.util.Calendar.getInstance().getTime();
<<<<<<< HEAD
		this.actualize();
		this.display();
		
=======
		this.length=length;
		this.height=height;
>>>>>>> branch 'master' of https://github.com/Henrionj/DashNews.git
	}

	/**
	 * Displays an item.
	 */
	public void display() 
	{

	}

	/**
	 * Actualizes an item.
	 */
	public void actualize() {

	}
	
	/**
	 * Get the adding date of an item.
	 * @return addingDate The creation date of an item. 
	 */
	public Date getDateAjout() {
		return this.addingDate;
	}

<<<<<<< HEAD
	/**
	 * Get the length of an item.
	 * @return The length of an item.
	 */
	public int getLength() {
		return this.length;
	}
	
	/**
	 * Get the height of an item.
	 * @return The height of an item.
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Modifies the size of an item.
	 * @param length 
	 * @param height 
	 */
	protected void setSize(int length, int height) {
		this.length = length;
		this.height = height;
	}
	
}
=======
}
>>>>>>> branch 'master' of https://github.com/Henrionj/DashNews.git
