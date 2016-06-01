/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;


import java.awt.Dimension;

import javax.swing.JInternalFrame;

import fr.iutvalence.info.dut.m2107.dashnews.item.InfoCommand;
import fr.iutvalence.info.dut.m2107.dashnews.item.Item;
import fr.iutvalence.info.dut.m2107.dashnews.item.Notification;
import fr.iutvalence.info.dut.m2107.dashnews.item.SocialNetwork;

/**
 * @author IT Prouds & CO.
 */
public class CommandPage extends Page{

	/**
	 * CommandPage's constructor 
	 * @param name CommandPage's name
	 */
	public CommandPage(String name) {
		super(name);
		InfoCommand c1 = new InfoCommand(InfoCommand.getDefaultLength(),InfoCommand.getDefaultHeight());
		InfoCommand c2 = new InfoCommand(InfoCommand.getDefaultLength(),InfoCommand.getDefaultHeight());
		c1.setName("Commandes effectuées par l'enstreprise");
		c2.setName("Commandes reçus par l'enstreprise");
		SocialNetwork s = new SocialNetwork(SocialNetwork.DEFAULT_LENGTH,SocialNetwork.DEFAULT_HEIGHT);
		this.items.add(c1);
		this.items.add(c2);
		this.items.add(s);
		layItems();
	}

	
	public void layItems() {
		JInternalFrame ind1 = new JInternalFrame(items.get(0).getName(), false, true,false,false);
		JInternalFrame ind2 = new JInternalFrame(items.get(1).getName(), false, true,false,false);
		JInternalFrame ind3 = new JInternalFrame(items.get(2).getName(), false, true,false,false);
		ind1.setSize(new Dimension(items.get(0).getLength(),items.get(0).getHeight()));
		ind1.setLocation(125,100);
		ind1.setVisible(true);
		ind2.setSize(new Dimension(items.get(1).getLength(),items.get(1).getHeight()));
		ind2.setVisible(true);
		ind2.setLocation(400,100);
		ind3.setSize(new Dimension(items.get(2).getLength(),items.get(2).getHeight()));
		ind3.setVisible(true);
		ind3.setLocation(0,220);
		this.add(ind1);
		this.add(ind2);
		this.add(ind3);
		
	}


}
