package fr.iutvalence.info.dut.m2107.dashnews;
import java.util.*;

import fr.iutvalence.info.dut.m2107.dashnews.item.Item;

public class Page {
 
	Collection<Item> mesItems;
	private String name;

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

	
}