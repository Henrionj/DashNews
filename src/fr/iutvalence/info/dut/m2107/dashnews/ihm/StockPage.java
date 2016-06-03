/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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

	/**
	 * StockPage constructor.
	 * 
	 * @param name
	 * @param stock
	 *            Product list.
	 */
	public StockPage(String name, List<Product> stock) {
		super(name);
		this.items.add(new Memo(Memo.DEFAULT_LENGTH, Memo.DEFAULT_HEIGHT));
		this.items.add(new SocialNetwork(SocialNetwork.DEFAULT_LENGTH,
				SocialNetwork.DEFAULT_HEIGHT, "Réseau social"));
		this.stock = (ArrayList<Product>) stock;
		this.layItems();
	}

	@Override
	public void layItems() {
		// JInternalFrame for Memo

		JInternalFrame ind = new JInternalFrame(this.items.get(0).getName(),
				false, true, false, false);
		ind.setSize(new Dimension(this.items.get(0).getLength(), this.items
				.get(0).getHeight()));
		JPanel panel = new JPanel(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane(panel);
		ind.getContentPane().add(scrollPane);
		ind.setLocation(672, 220);
		ind.setVisible(true);
		this.add(ind);

		// JInternalFrame for social network

		JInternalFrame ind2 = new JInternalFrame(this.items.get(1).getName(),
				false, true, false, false);
		ind2.setSize(new Dimension(this.items.get(1).getLength(), this.items
				.get(1).getHeight()));
		JPanel panel2 = new JPanel(new BorderLayout());
		JScrollPane scrollPane2 = new JScrollPane(panel2);
		ind2.getContentPane().add(scrollPane2);
		ind2.setLocation(0, 220);
		ind2.setVisible(true);
		this.add(ind2);

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
