/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import fr.iutvalence.info.dut.m2107.dashnews.item.*;

/**
 * @author henrionj
 *
 */
public class StockPage extends Page {

	/**
	 * @param name
	 */
	public StockPage(String name) {
		super(name);
		this.items.add(new Memo(10,10));
		this.items.add(new SocialNetwork(10,10,""));
	}

	@Override
	public void layItems() {
		// TODO Auto-generated method stub
		
	}

}
