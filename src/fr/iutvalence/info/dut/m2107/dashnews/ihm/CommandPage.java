/**
 * 
 */
package fr.iutvalence.info.dut.m2107.dashnews.ihm;


import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
		InfoCommand c1 = new InfoCommand(InfoCommand.DEFAULT_LENGTH,InfoCommand.DEFAULT_HEIGHT,"Commandes effectuées par l'entreprise");
		InfoCommand c2 = new InfoCommand(InfoCommand.DEFAULT_LENGTH,InfoCommand.DEFAULT_HEIGHT,"Commandes reçus par l'entreprise");
		SocialNetwork s = new SocialNetwork(SocialNetwork.DEFAULT_LENGTH,SocialNetwork.DEFAULT_HEIGHT,"Réseau social");
		this.items.add(c1);
		this.items.add(c2);
		this.items.add(s);
		layItems();
	}

	// TODO "Commandes payées:", this text must'n be editable
	// TODO Try to add 2 JScrollPane for ind1 and ind2 (1 for paid command and one for command to pay for each JInternalFrame
	
	public void layItems() {
		// JInternalFrame for command done
		JInternalFrame ind1 = new JInternalFrame(items.get(0).getName(),false,true,false,false);
		ind1.setSize(new Dimension(items.get(0).getLength(),items.get(0).getHeight()));
		ind1.setLayout(null);
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel();
		label1.setText("Commandes payées");
		panel1.add(label1);
	    JScrollPane scrollPane1 = new JScrollPane(panel1);
	    scrollPane1.setBounds(0,0, 275, 160);
	    JPanel panel12 = new JPanel();
		JLabel label12 = new JLabel();
		label12.setText("Commandes à payer");
		panel12.add(label12);
		JScrollPane scrollPane12 = new JScrollPane(panel12);
		scrollPane12.setBounds(0,160, 275, 160);
		ind1.getContentPane().add(scrollPane1);
		ind1.getContentPane().add(scrollPane12);
		ind1.setLocation(125,100);
		ind1.setVisible(true);
		this.add(ind1);
		
		// JInternalFrame for command ordered
		
		JInternalFrame ind2 = new JInternalFrame(items.get(1).getName(), false, true,false,false);
		ind2.setSize(new Dimension(items.get(1).getLength(),items.get(1).getHeight()));
		ind2.setLayout(null);
		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel();
		label2.setText("Commandes payées");
		panel2.add(label2);
	    JScrollPane scrollPane2 = new JScrollPane(panel2);
	    scrollPane2.setBounds(0,0, 275, 160);
	    JPanel panel22 = new JPanel();
		JLabel label22 = new JLabel();
		label22.setText("Commandes à payer");
		panel22.add(label22);
		JScrollPane scrollPane22 = new JScrollPane(panel22);
		scrollPane22.setBounds(0,160, 275, 160);
		ind2.getContentPane().add(scrollPane2);
		ind2.getContentPane().add(scrollPane22);
		ind2.setLocation(400,100);
		ind2.setVisible(true);
		
		this.add(ind2);
		
		// JInternalFrame for social network
		
		JInternalFrame ind3 = new JInternalFrame(items.get(2).getName(), false, true,false,false);
		ind3.setSize(new Dimension(items.get(2).getLength(),items.get(2).getHeight()));
		JPanel panel3 = new JPanel(new BorderLayout());
	    JScrollPane scrollPane3 = new JScrollPane(panel3);
		ind3.getContentPane().add(scrollPane3);
		ind3.setLocation(0,220);
		ind3.setVisible(true);
		this.add(ind3);	
		
	}


}
