package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

/**
 * Abstract class Item.
 * @author  IT Prouds & CO.
 *
 */
public abstract class Item {
 
	private int length;
	private int height;
	private Date addingDate;


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
	public Item(int length, int height) {
		
		this.length = length;
		this.height = height;
		this.addingDate = java.util.Calendar.getInstance().getTime();
		this.actualize();
		this.display();
		
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
