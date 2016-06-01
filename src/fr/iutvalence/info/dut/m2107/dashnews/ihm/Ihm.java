package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Ihm extends JFrame
{
	
public Ihm()
{
	
	/*
	 * Caracteristics of the Ihm
	 */
	
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setTitle("DashNews");
	this.setSize(800, 600);
	this.setLocationRelativeTo(null);  
//	this.setUndecorated(true);
	JPanel board = new JPanel();
	board.setPreferredSize(board.getMaximumSize());
	
	Font titleFont = new Font("TimesRoman",Font.BOLD,30);
	/*
	 * tabs of the Ihm
	 */
	
	JTabbedPane tabs = new JTabbedPane(SwingConstants.TOP);// menu
	
	
	
	
	tabs.setUI(new TabStyle());
	
	Page stocks = new StockPage("Stocks");
	Page numbers = new NumberPage("Chiffres");
	/*
	 * INDICATEURS	rse
	 *     Ils permettent de connaître l’efficacité de la production
    Ils éclairent sur la qualité de la relation commerciale, du service client
    Ils mesurent l’image de marque et la perception de l’entreprise
    Ils fournissent des informations sur la qualité de services
    Ils permettent de mettre en lumière le temps passé à corriger les erreurs, les mauvaises anticipations
	 */
	Page indicator = new IndicatorPage("Indicateurs");
	Page command = new CommandPage("Commandes"); 
	
	tabs.addTab(numbers.getName(), numbers);
	tabs.addTab(stocks.getName(), stocks);
	tabs.addTab(indicator.getName(), indicator);
	tabs.addTab(command.getName(), command);
	
	tabs.setOpaque(true);
	
	
	JPanel header = new JPanel();
	header.setLayout(new GridBagLayout());
	header.setPreferredSize(new Dimension(800,50));
	GridBagConstraints constraints = new GridBagConstraints();
	
	
	JLabel title = new JLabel("DASHNEWS");
	title.setFont(titleFont);
	JLabel calendar = new JLabel("Calendar");
	JLabel authentification = new JLabel("Authentification");
	
	//--------------------------------------------
	title.setPreferredSize(new Dimension(300,50));
	calendar.setPreferredSize(new Dimension(200,50));
	authentification.setPreferredSize(new Dimension(200,50));

	
	
	//-----------------------------------------------
	
	constraints.gridx = 0;
	constraints.gridy = 0;	
    constraints.gridheight = 1;
    constraints.gridwidth = 1;
    
    //---------------------------------------------
    
	header.add(title, constraints);

	//---------------------------------------------

	constraints.gridx = 1;
	header.add(calendar, constraints);

	//---------------------------------------------

	constraints.gridx = 2;      
	header.add(authentification, constraints);        

	//---------------------------------------------
	constraints.gridwidth = GridBagConstraints.REMAINDER;
	
	
	board.add(header);
	board.add(tabs);
	
	this.setResizable(false);
	this.setContentPane(board);
	this.setVisible(true);	

}

}
