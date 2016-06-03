/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;



import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JInternalFrame;

import fr.iutvalence.info.dut.m2107.dashnews.item.InfoCommand;
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
		InfoCommand c1 = new InfoCommand(InfoCommand.DEFAULT_LENGTH,InfoCommand.DEFAULT_HEIGHT,"Commandes effectuées par l'entreprise");
		InfoCommand c2 = new InfoCommand(InfoCommand.DEFAULT_LENGTH,InfoCommand.DEFAULT_HEIGHT,"Commandes reçus par l'entreprise");
		SocialNetwork s = new SocialNetwork(SocialNetwork.DEFAULT_LENGTH,SocialNetwork.DEFAULT_HEIGHT,"Réseau social");
		this.items.add(s);
		this.items.add(c1);
		this.items.add(c2);
		this.items.add(myMemo);
		this.setLayout(new GridBagLayout());
		layItems();
	}

	
	public void layItems() {
		
		for(int i = 0; i<4;i++)	
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
		
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		
	}


}
