package fr.iutvalence.info.dut.m2107.dashnews.ihm;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDesktopPane;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.dashnews.State;
import fr.iutvalence.info.dut.m2107.dashnews.item.Item;

public abstract class Page extends JDesktopPane{
 
	protected List<Item> items;
	private String name;
	protected GridBagConstraints constraints;
	
	
	public Page(String name){
		this.name = name;
		this.setPreferredSize(new Dimension(800,600));
		this.constraints = new GridBagConstraints();
		this.items = new ArrayList<Item>();
		
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
	public void setItem(Item item) 
	{
		items.add(item);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	/**
	 * lay all the items of items on the page.
	 */
	public abstract void layItems();
	
			
	
}