package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

/**
 * Abstract class Item.
 * @author  IT Prouds & CO.
 *
 */
public abstract class Item {
 
	private int size;
	private Date addingDate;


	/**
	 * Creates an item.
	 * @param size
	 */
	public Item(int size) {
		
		this.size = size;
		addingDate = new Date();
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
		return addingDate;
	}

	/**
	 * Get the size of an item.
	 * @return size The size of an item.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Modifies the size of an item.
	 * @param size The new size of the item.
	 */
	protected void setSize(int size) {
		this.size = size;
	}
}