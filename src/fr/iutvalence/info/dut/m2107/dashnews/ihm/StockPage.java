/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.iutvalence.info.dut.m2107.dashnews.item.InfoCommand;
import fr.iutvalence.info.dut.m2107.dashnews.item.Memo;
import fr.iutvalence.info.dut.m2107.dashnews.item.Product;
import fr.iutvalence.info.dut.m2107.dashnews.item.SocialNetwork;

/**
 * @author IT Prouds & CO.
 *
 */
public class StockPage extends Page {

	/**
	 * Product list.
	 */
	public ArrayList<Product> stock;
	Font titleFont;

	/**
	 * StockPage constructor.
	 * 
	 * @param name
	 * @param stock
	 *            Product list.
	 */
	public StockPage(String name, List<Product> stock) {
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
		    JLabel cost = new JLabel("ETATS DES COMMANDES AU : JJ/MM/AAAA");
		    cost.setFont(titleFont);
		    cost.setPreferredSize(new Dimension(400,100));
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

	/**
	 * Sorts stock's display on the name.
	 * 
	 * @param name
	 *            Product name.
	 */
	private void sortsName(String name) {

	}

	/**
	 * Sorts stock's display on the amount.
	 * 
	 * @param amount
	 */
	private void sortsAmount(int amount) {

	}

	/**
	 * Sorts stock's display on the price.
	 * 
	 * @param price
	 *            Product price.
	 */
	private void sortsPrice(int price) {

	}

}
