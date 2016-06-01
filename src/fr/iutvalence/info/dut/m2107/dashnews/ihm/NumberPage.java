/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import fr.iutvalence.info.dut.m2107.dashnews.item.Indicator;

/**
 * @author henrionj
 *
 */
public class NumberPage extends Page {

	/**
	 * @param name
	 */
	public NumberPage(String name) {
		super(name);
		this.items.add(new Indicator(200,150));
		
	}

	@Override
	public void layItems()
	{
		
		
	}

}
