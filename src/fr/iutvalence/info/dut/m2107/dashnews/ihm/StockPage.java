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
		// this.layItems();
	}

	@Override
	public void layItems() {
		/*
		 * // JInternalFrame for command done JInternalFrame ind1 = new
		 * JInternalFrame(this.items.get(0).getName(), false, true, false,
		 * false); ind1.setSize(new Dimension(this.items.get(0).getLength(),
		 * this.items .get(0).getHeight())); ind1.setLayout(null); JPanel panel1
		 * = new JPanel(); JLabel label1 = new JLabel();
		 * label1.setText("Tableau des stock de produit"); panel1.add(label1);
		 * JScrollPane scrollPane1 = new JScrollPane(panel1);
		 * scrollPane1.setBounds(0, 0, 275, 160); JPanel panel12 = new JPanel();
		 * JLabel label12 = new JLabel(); label12.setText("Info liste produit");
		 * panel12.add(label12); JScrollPane scrollPane12 = new
		 * JScrollPane(panel12); scrollPane12.setBounds(0, 160, 275, 160);
		 * ind1.getContentPane().add(scrollPane1);
		 * ind1.getContentPane().add(scrollPane12); ind1.setLocation(125, 100);
		 * ind1.setVisible(true); this.add(ind1);
		 * 
		 * // JInternalFrame for command ordered
		 * 
		 * JInternalFrame ind2 = new JInternalFrame(this.items.get(1).getName(),
		 * false, true, false, false); ind2.setSize(new
		 * Dimension(this.items.get(1).getLength(), this.items
		 * .get(1).getHeight())); ind2.setLayout(null); JPanel panel2 = new
		 * JPanel(); JLabel label2 = new JLabel();
		 * label2.setText("Tableau des stock de produit"); panel2.add(label2);
		 * JScrollPane scrollPane2 = new JScrollPane(panel2);
		 * scrollPane2.setBounds(0, 0, 275, 160); JPanel panel22 = new JPanel();
		 * JLabel label22 = new JLabel(); label22.setText("Info liste produit");
		 * panel22.add(label22); JScrollPane scrollPane22 = new
		 * JScrollPane(panel22); scrollPane22.setBounds(0, 160, 275, 160);
		 * ind2.getContentPane().add(scrollPane2);
		 * ind2.getContentPane().add(scrollPane22); ind2.setLocation(400, 100);
		 * ind2.setVisible(true);
		 * 
		 * this.add(ind2);
		 * 
		 * // JInternalFrame for social network
		 * 
		 * JInternalFrame ind3 = new JInternalFrame(this.items.get(2).getName(),
		 * false, true, false, false); ind3.setSize(new
		 * Dimension(this.items.get(2).getLength(), this.items
		 * .get(2).getHeight())); JPanel panel3 = new JPanel(new
		 * BorderLayout()); JScrollPane scrollPane3 = new JScrollPane(panel3);
		 * ind3.getContentPane().add(scrollPane3); ind3.setLocation(0, 220);
		 * ind3.setVisible(true); this.add(ind3);
		 */

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
