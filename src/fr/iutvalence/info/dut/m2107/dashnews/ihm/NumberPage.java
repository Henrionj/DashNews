/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.beans.PropertyVetoException;

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
		this.items.add(new Indicator(120,170,"1"));
		this.items.add(new Indicator(120,170,"2"));
		this.items.add(new Indicator(120,170,"3"));
		this.items.add(new Indicator(120,170,"4"));
		this.items.add(new Indicator(120,170,"5"));
		layItems();
		
	}

	@Override
	public void layItems()
	{           
		int x = 40;
		for( int i = 0; i<5;i++)
		{

		    JInternalFrame ind1 = new JInternalFrame(items.get(i).getName(), false, true,false,false);
			ind1.setSize(new Dimension(items.get(0).getLength(),items.get(0).getHeight()));
			ind1.setLocation(x, 10);
			ind1.setVisible(true);
			this.add(ind1);
			x += 150;
		}
		
	}

}
