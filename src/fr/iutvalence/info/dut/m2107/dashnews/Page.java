package fr.iutvalence.info.dut.m2107.dashnews;
import java.util.*;

import fr.iutvalence.info.dut.m2107.dashnews.item.Item;

/**
 * Class Page
 * @author  IT Prouds & CO.
 *
 */
public class Page {
 
	/**
	 * Collection of items.
	 */
	Collection<Item> mesItems;
	/**
	 * Name of a page.
	 */
	private String name;

	/**
	 * Actualizes a page.
	 * @param state
	 */
	public void actualize(State state) {
	
	}
	
	/**
	 * Adds an item to the page.
	 * @param item The item to add
	 */
	public void setItem(Item item) {
		this.mesItems.add(item);
	}

	
}