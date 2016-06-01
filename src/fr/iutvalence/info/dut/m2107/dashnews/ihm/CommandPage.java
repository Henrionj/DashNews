/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;


import fr.iutvalence.info.dut.m2107.dashnews.item.InfoCommand;
import fr.iutvalence.info.dut.m2107.dashnews.item.SocialNetwork;

/**
 * @author IT Prouds & CO.
 */
public class CommandPage extends Page{

	/**
	 * CommandPage's constructor 
	 * @param name CommandPage's name
	 */
	public CommandPage(String name) {
		super(name);
		InfoCommand c1 = new InfoCommand(InfoCommand.getDefaultLength(),InfoCommand.getDefaultHeight(),"name");
		InfoCommand c2 = new InfoCommand(InfoCommand.getDefaultLength(),InfoCommand.getDefaultHeight(),"name");
		c1.setName("Commandes effectuées par l'enstreprise");
		c2.setName("Commandes reçus par l'enstreprise");
		SocialNetwork s = new SocialNetwork(SocialNetwork.getDefaultLength(),SocialNetwork.getDefaultHeight(),"name");
		this.items.add(c1);
		this.items.add(c2);
		this.items.add(s);
	}

	@Override
	public void layItems() {
		// TODO Auto-generated method stub
		
	}


}
