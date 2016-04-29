package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

public abstract class Information extends Item {

	/**
	 * @param size
	 */
	public Information(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	private String name;

	/**
	 *  
	 * @param temps
	 */
	public void actualize(Date temps) {
		// TODO - implement Information.actualize
		throw new UnsupportedOperationException();
	}

}