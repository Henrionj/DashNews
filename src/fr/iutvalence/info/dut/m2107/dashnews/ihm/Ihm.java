package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

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
	JTabbedPane tabs = new JTabbedPane(SwingConstants.TOP);
	tabs.setUI(new TabStyle());
	
	Page stocks = new Page("Stocks");
	Page numbers = new Page("Chiffres");
	Page indicator = new Page("Indicateurs");
	Page command = new Page("Commandes");
	
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
	
	
	constraints.gridx = 0;
	constraints.gridy = 0;	
    constraints.gridheight = 1;
    constraints.gridwidth = 1;
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
