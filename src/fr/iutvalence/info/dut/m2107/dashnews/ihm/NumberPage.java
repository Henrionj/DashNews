/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Dimension;

import javax.swing.JInternalFrame;

import fr.iutvalence.info.dut.m2107.dashnews.item.Indicator;

/**
 * @author henrionj
 *
 */
public class NumberPage extends Page {

	/**
	 * @param name
	 */
	public NumberPage(String name) 
	{
		super(name);
		this.items.add(new Indicator(150,100));
		layItems();
		
	}

	@Override
	public void layItems()
	{
		JInternalFrame ind1 = new JInternalFrame("Ind1", false, true,false,false);
		ind1.setSize(new Dimension(items.get(0).getHeight(),items.get(0).getLength()));
		ind1.setVisible(true);
		this.add(ind1);
		
	}

}
