/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.GridBagConstraints;

import fr.iutvalence.info.dut.m2107.dashnews.item.Graphic;
import fr.iutvalence.info.dut.m2107.dashnews.item.Indicator;
import fr.iutvalence.info.dut.m2107.dashnews.item.SocialNetwork;

/**
 * @author henrionj
 *
 */
public class IndicatorPage extends Page {

	public IndicatorPage(String name) {
		super(name);
		items.add(new Indicator(1,1,""));
		items.add(new Indicator(1,1,""));
		items.add(new Indicator(1,1,""));
		items.add(new Indicator(1,1,""));
		items.add(new Indicator(1,1,""));
		items.add(new SocialNetwork(1, 2,""));
		items.add(new Graphic(5, 2));
		items.add(new SocialNetwork(1, 2,""));
		
		layItems();
		
	}

	@Override
	public void layItems() 
	{
		for( int i = 0; i<=5;i++)
		{
			constraints.gridx = items.get(i).getLength();
			constraints.gridy = items.get(i).getHeight();	
		    constraints.gridheight = 1;
		    constraints.gridwidth = 1;
		}
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		
	}

}
