package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Ihm extends JFrame
{
	
public Ihm()
{
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setTitle("DashNews");
	this.setSize(800, 600);
	this.setLocationRelativeTo(null);  
//	this.setUndecorated(true);
	JPanel board = new JPanel();
	JPanel header = new JPanel();
	board.setPreferredSize(board.getMaximumSize());
	//board.setLayout(new GridBagLayout());
	GridBagConstraints constraint = new GridBagConstraints();
	
	JTabbedPane tabs = new JTabbedPane(SwingConstants.TOP);
	tabs.setUI(new TabStyle());
	JLabel title = new JLabel("DASHNEWS");
	
	Page stocks = new Page("Stocks");
	Page numbers = new Page("Chiffres");
	Page indicator = new Page("Indicateurs");
	Page command = new Page("Commandes");
	
	tabs.addTab(numbers.getName(), numbers);
	tabs.addTab(stocks.getName(), stocks);
	tabs.addTab(indicator.getName(), indicator);
	tabs.addTab(command.getName(), command);
	tabs.setOpaque(true);
	
	header.add(title);
	
	board.add(header);
	board.add(tabs);
	
	this.setResizable(false);
	this.setContentPane(board);
	
	/*JButton nom = new JButton("Nom de l'entreprise");
	JButton calendrier = new JButton("Calendrier");
	JButton authentification = new JButton("Authentification");
	nom.setLocation(-50, 0);*/
	
	//nom.setPreferredSize(new Dimension(300, 100));
	
	/*constraint.gridx = 0;
    constraint.gridy = 0;
    constraint.gridheight = 4;
    constraint.gridwidth = 4;
    constraint.gridwidth = GridBagConstraints.REMAINDER;
    board.add(nom, constraint);
    
    
    constraint.gridx = 5;
    constraint.gridy = 0;
    constraint.gridheight = 1;
    constraint.gridwidth = 1;
    board.add(calendrier, constraint);
    
    constraint.gridx = 7;
    constraint.gridy = 0;
    constraint.gridheight =4;
    constraint.gridwidth = 4;
    board.add(authentification, constraint);
    constraint.gridwidth = GridBagConstraints.REMAINDER;*/
    
	this.setVisible(true);	

}

}
