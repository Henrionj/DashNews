/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.util.ArrayList;
import java.util.List;

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
		this.items.add(new Memo(10, 10));
		this.items.add(new SocialNetwork(10, 10, ""));
		this.stock = (ArrayList<Product>) stock;
	}

	@Override
	public void layItems() {
		// TODO Auto-generated method stub

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
