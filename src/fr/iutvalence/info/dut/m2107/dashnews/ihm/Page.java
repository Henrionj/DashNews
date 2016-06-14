package fr.iutvalence.info.dut.m2107.dashnews.ihm;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import fr.iutvalence.info.dut.m2107.dashnews.State;
import fr.iutvalence.info.dut.m2107.dashnews.item.Item;
import fr.iutvalence.info.dut.m2107.dashnews.item.Memo;
import fr.iutvalence.info.dut.m2107.dashnews.item.SocialNetwork;

public abstract class Page extends JDesktopPane{
 
	protected List<Item> items;
	private String name;
	protected GridBagConstraints constraints;
	protected Memo myMemo;
	protected SocialNetwork social;
	
	
	public Page(String name){
		//default attribute for page.
		this.name = name;
		this.setPreferredSize(new Dimension(800,570));
		this.constraints = new GridBagConstraints();
		this.items = new ArrayList<Item>();
		this.social = new SocialNetwork(SocialNetwork.DEFAULT_LENGTH,SocialNetwork.DEFAULT_HEIGHT,"Réseau social");
		this.myMemo = new Memo(Memo.DEFAULT_LENGTH,Memo.DEFAULT_HEIGHT);
		this.items.add(myMemo);
		this.items.add(social);
		this.setLayout(new GridBagLayout());
		
		// JInternalFrame for Memo---------------------------------------------
		constraints.gridx = 5;
		constraints.gridy = 2;	
		constraints.weightx = 1;
	    constraints.weighty = 1;
	   JInternalFrame memoFrame = new JInternalFrame(this.items.get(0).getName(),
	   		false, false, false, false);
	   memoFrame.setPreferredSize(new Dimension(this.items.get(0).getLength(), this.items
	   		.get(0).getHeight()));
	   memoFrame.setVisible(true);
	   this.add(memoFrame,constraints);
	// JInternalFrame for social network-------------------------------------------
	constraints.gridx = 1;
    constraints.gridy = 2;	
    constraints.weightx = 1;
	constraints.weighty = 2;
    JInternalFrame socialFrame = new JInternalFrame(this.items.get(1).getName(),
    		false,false, false, false);
    socialFrame.setPreferredSize(new Dimension(this.items.get(1).getLength(), this.items
    		.get(1).getHeight()));
    socialFrame.setVisible(true);
    this.add(socialFrame,constraints);
    
		
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