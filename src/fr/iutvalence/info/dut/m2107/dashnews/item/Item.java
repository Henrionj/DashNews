package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

public abstract class Item {
 
	private int size;
	private Date dateAjout;


	/**
	 * @param size
	 */
	public Item(int size) {
		
		this.size = size;
		dateAjout = new Date();
		this.actualize();
		this.display();
	}

	public void display() 
	{

	}

	public void actualize() {

	}
	
	public Date getDateAjout() {
		return dateAjout;
	}

	public int getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}
	
	


}