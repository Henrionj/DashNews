/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;



import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import fr.iutvalence.info.dut.m2107.dashnews.item.InfoCommand;

/**
 * @author IT Prouds & CO.
 */
public class CommandPage extends Page{

	/**
	 * CommandPage's constructor 
	 * @param name CommandPage's name
	 */
	Font titleFont;
	public CommandPage(String name) {
		super(name);
		titleFont = new Font("Arial",Font.BOLD,16);
		InfoCommand c1 = new InfoCommand(InfoCommand.DEFAULT_LENGTH,InfoCommand.DEFAULT_HEIGHT,"Commandes effectuées par l'entreprise");
		InfoCommand c2 = new InfoCommand(InfoCommand.DEFAULT_LENGTH,InfoCommand.DEFAULT_HEIGHT,"Commandes reçus par l'entreprise");
		this.items.add(c1);
		this.items.add(c2);
		//this.setLayout(new GridBagLayout());
		layItems();
	}

	
	public void layItems() {
		
			constraints.gridx = 2;
			constraints.gridy = 1;	
			constraints.gridheight = 1;
			constraints.gridwidth = 2;
		    JLabel cost = new JLabel("COUT DU STOCK : XXX XXX XXX");
		    cost.setFont(titleFont);
		    cost.setPreferredSize(new Dimension(300,100));
		    cost.setVisible(true);
		    this.add(cost,constraints);
			//------------------------------------------------------------------------------------
			constraints.gridx = 2;
			constraints.gridy = 2;	
			constraints.gridheight = 1;
			constraints.gridwidth = 1;
		    JInternalFrame tab1 = new JInternalFrame(items.get(2).getName(), false,true, false, false);
		    tab1.setVisible(true);
		    tab1.setPreferredSize(new Dimension(items.get(2).getLength(),items.get(2).getHeight()));
		    this.add(tab1,constraints);
		    //-------------------------------------------------------------------------------------
		    constraints.gridx = 3;
			constraints.gridy = 2;	
			constraints.gridheight = 1;
			constraints.gridwidth = 1;
		    JInternalFrame tab2 = new JInternalFrame(items.get(3).getName(), false,true, false, false);
		    tab2.setVisible(true);
		    tab2.setPreferredSize(new Dimension(items.get(3).getLength(),items.get(3).getHeight()));
		    this.add(tab2,constraints);
		}
		
		
	}



