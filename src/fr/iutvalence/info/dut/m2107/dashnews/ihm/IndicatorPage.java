/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JInternalFrame;

import fr.iutvalence.info.dut.m2107.dashnews.item.Indicator;

/**
 * @author henrionj
 *
 */
public class IndicatorPage extends Page {

	public IndicatorPage(String name) {
		super(name);
		items.add(new Indicator(100,150,""));
		items.add(new Indicator(100,150,""));
		items.add(new Indicator(100,150,""));
		items.add(new Indicator(100,150,""));
		items.add(new Indicator(100,150,""));
		this.setLayout(new GridBagLayout());
	/*	items.add(new SocialNetwork(1, 2,""));
		items.add(new Graphic(5, 2));
		items.add(new SocialNetwork(1, 2,""));*/
		
		layItems();
		
	}

	@Override
	public void layItems() 
	{
	//----------------------------------------------------------------------------------------------
		for(int i = 0; i<5;i++)	
		{
			constraints.gridx = i;
			constraints.gridy = 0;	
		    constraints.gridheight = 1;
		    constraints.gridwidth = 1;
		    JInternalFrame ind1 = new JInternalFrame(items.get(i).getName(), false,true, false, false);
		    ind1.setVisible(true);
		    ind1.setPreferredSize(new Dimension(items.get(i).getLength(),items.get(i).getHeight()));
		    this.add(ind1,constraints);
		    constraints.gridwidth = GridBagConstraints.REMAINDER;
		}
   /*
			constraints.gridx = 1;
			constraints.gridy = 0;	
		    constraints.gridheight = 1;
		    constraints.gridwidth = 1;
		    JInternalFrame ind2 = new JInternalFrame(items.get(1).getName(), false,true, false, false);
		    ind2.setVisible(true);
		    ind2.setPreferredSize(new Dimension(items.get(1).getLength(),items.get(1).getHeight()));
		    this.add(ind2,constraints);
   //------------------------------------------------------------------------------------------------
			constraints.gridx = 1;
			constraints.gridy = 0;	
		    constraints.gridheight = 1;
		    constraints.gridwidth = 1;
		    JInternalFrame ind3 = new JInternalFrame(items.get(2).getName(), false,true, false, false);
		    ind3.setVisible(true);
		    ind3.setPreferredSize(new Dimension(items.get(2).getLength(),items.get(2).getHeight()));
		    this.add(ind3,constraints);*/
		   
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		
	}

}
