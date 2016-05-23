package fr.iutvalence.info.dut.m2107.dashnews.ihm;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.util.List;

import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.dashnews.State;
import fr.iutvalence.info.dut.m2107.dashnews.item.Item;

public class Page extends JPanel{
 
	private List<Item> numbersItems;
	private List<Item> stocksItems;
	private List<Item> commandItems;
	private List<Item> indicatorItems;
	private String name;
	
	
	public Page(String name){
		this.name = name;
		this.setPreferredSize(new Dimension(800,600));
		
	}

	/**
	 * 
	 * @param state
	 */
	public void actualize(State state) {
	
	}
	
	/**
	 * Add an item to the page
	 * @param item The item to add
	 */
	public void setItem(Item item, String name) {
		switch(this.getName())
		{
			case "Chiffres":
				numbersItems.add(item);
				break;
			case "Indicateurs":
				indicatorItems.add(item);
				break;
			case "Stocks":
				stocksItems.add(item);
				break;
			case "Commandes":
				commandItems.add(item);
				break;
			
			
		}
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	/**
	 * lay all the items of items on the page.
	 */
	public void layItems()
	{
		GridBagConstraints constraints = new GridBagConstraints();
		switch(this.getName())
		{
			case "Chiffres":
				break;
			case "Indicateurs":
				break;
			case "Stocks":
				break;
			case "Commandes":
				break;
			
			
		}
		
	}

	
}