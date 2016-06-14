/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JInternalFrame;

import fr.iutvalence.info.dut.m2107.dashnews.item.Graphic;
import fr.iutvalence.info.dut.m2107.dashnews.item.Indicator;

/**
 * @author henrionj
 *
 */
public class IndicatorPage extends Page {

	public IndicatorPage(String name) {
		super(name);
		items.add(new Indicator(100,150,"1"));
		items.add(new Indicator(100,150,"2"));
		items.add(new Indicator(100,150,"3"));
		items.add(new Indicator(100,150,"4"));
		items.add(new Indicator(100,150,"5"));
		items.add(new Graphic(500, 400));
		
		layItems();
		
	}

	@Override
	public void layItems() 
	{	

		constraints.gridx = 1;
		constraints.gridy = 1;	
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
	    //constraints.fill = constraints.BOTH;
	    JInternalFrame ind = new JInternalFrame(items.get(2).getName(), false,false, false, false);
	    ind.setPreferredSize(new Dimension(items.get(2).getLength(),items.get(2).getHeight()));
	    ind.setVisible(true);
	    this.add(ind,constraints);
	    //------------------------------------------------------------------------------------
	    constraints.gridx = 2;
		constraints.gridy = 1;	
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
	    //constraints.fill = constraints.BOTH;
	    JInternalFrame ind2 = new JInternalFrame(items.get(3).getName(), false,false, false, false);
	    ind2.setPreferredSize(new Dimension(items.get(3).getLength(),items.get(3).getHeight()));
	    ind2.setVisible(true);
	    this.add(ind2,constraints);
	    //------------------------------------------------------------------------------------
	    constraints.gridx = 3;
		constraints.gridy = 1;	
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
	    //constraints.fill = constraints.BOTH;
	    JInternalFrame ind3 = new JInternalFrame(items.get(4).getName(), false,false, false, false);
	    ind3.setPreferredSize(new Dimension(items.get(4).getLength(),items.get(4).getHeight()));
	    ind3.setVisible(true);
	    this.add(ind3,constraints);
	  //------------------------------------------------------------------------------------
	    constraints.gridx = 4;
		constraints.gridy = 1;	
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
	    //constraints.fill = constraints.BOTH;
	    JInternalFrame ind4 = new JInternalFrame(items.get(5).getName(), false,false, false, false);
	    ind4.setPreferredSize(new Dimension(items.get(5).getLength(),items.get(5).getHeight()));
	    ind4.setVisible(true);
	    this.add(ind4,constraints);
	    //---------------------------------------------------------------------------------
	    constraints.gridx = 5;
		constraints.gridy = 1;	
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
	    //constraints.fill = constraints.BOTH;
	    JInternalFrame ind5 = new JInternalFrame(items.get(6).getName(), false,false, false, false);
	    ind5.setPreferredSize(new Dimension(items.get(6).getLength(),items.get(6).getHeight()));
	    ind5.setVisible(true);
	    this.add(ind5,constraints);
	    constraints.gridwidth = GridBagConstraints.REMAINDER;
	    //-----------------------------------------------------------------------------
	    constraints.gridx = 2;
		constraints.gridy = 2;
		constraints.gridheight = 4;
		constraints.gridwidth = 3;
		constraints.weightx = 4;
		constraints.weighty = 3;	
	    JInternalFrame graph = new JInternalFrame(items.get(7).getName(), false,false, false, false);
		graph.setVisible(true);
	    graph.setPreferredSize(new Dimension(items.get(7).getLength(),items.get(7).getHeight()));
	    this.add(graph,constraints);

		
	}

}
