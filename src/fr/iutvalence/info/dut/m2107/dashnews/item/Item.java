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
	 * @param length The length of an item.
	 * @param height The height of an item.
	 */
	public Item(int length,int height) {
		this.addingDate = java.util.Calendar.getInstance().getTime();
		this.length=length;
		this.height=height;
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

}