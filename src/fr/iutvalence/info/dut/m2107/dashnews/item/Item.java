package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

import javax.swing.JComponent;

/**
 * Abstract class Item.
 * @author  IT Prouds & CO.
 *
 */
public abstract class Item{
 
	private Date addingDate;
	protected String name;

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
	 * @param length 
	 * @param height 
	 * 
	 * @param length The length of an item.
	 * @param height The height of an item.
	 */
	public Item(int length,int height) {

		this.addingDate = java.util.Calendar.getInstance().getTime();
		this.actualize();
		this.display();
		this.length=length;
		this.height=height;
		this.name = "default";

	}
	
	public Item(int length,int height,String name) {

		this.addingDate = java.util.Calendar.getInstance().getTime();
		this.actualize();
		this.display();
		this.length=length;
		this.height=height;
		this.name = name;

	}

	/**
	 * Displays an item.
	 */
	public abstract void display();


	/**
	 * Actualizes an item.
	 */
	public abstract void actualize();
	/**
	 * Get the adding date of an item.
	 * @return addingDate The creation date of an item. 
	 */
	public Date getDateAjout() {
		return this.addingDate;

	}

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
	 * name getter
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * name setter
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	
}

