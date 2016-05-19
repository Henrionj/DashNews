package fr.iutvalence.info.dut.m2107.dashnews.ihm;
import java.awt.Dimension;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.iutvalence.info.dut.m2107.dashnews.State;
import fr.iutvalence.info.dut.m2107.dashnews.item.Item;

public class Page extends JPanel{
 
	Collection<Item> mesItems;
	private String name;
	
	
	public Page(String name){
		this.name = name;
		this.setPreferredSize(new Dimension(800,600));
		JLabel jj = new JLabel(this.name);
		this.add(jj);
		
		
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
	public void setItem(Item item) {
		this.mesItems.add(item);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
}