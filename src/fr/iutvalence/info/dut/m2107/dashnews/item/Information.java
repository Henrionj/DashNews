package fr.iutvalence.info.dut.m2107.dashnews.item;
import java.util.Date;

/**
 * 
 * @author IT Prouds & CO.
 *
 */
public abstract class Information extends Item {
	

	// TODO Pourquoi la taille en parametre de l'item
	/**
	 * 
	 * @param length
	 * @param height
	 */
	public Information(int length,int height,String name) {
		super(length,height,name);
		// TODO Auto-generated constructor stub
	}

	/**
	 *  Actualizes informations at the date in parameters.
	 * @param temps
	 */
	public void actualize(Date temps) {

	}

}