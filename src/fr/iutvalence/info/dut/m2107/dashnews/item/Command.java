package fr.iutvalence.info.dut.m2107.dashnews.item;

import java.util.Date;

public class Command {
	
	/**
	 * Command's description
	 */
	private String description;
	
	/**
	 * Command's date
	 */
	private Date date;
	
	/**
	 * Command's provider
	 */
	private String provider;
	
	/**
	 * Command's price
	 */
	private double price;

	/**
	 * Command's constructor
	 * @param description Command's description
	 * @param date Command's date
	 * @param provider Command's provider
	 * @param price Command's price
	 */
	public Command(String description, Date date, String provider, double price) {
		super();
		this.description = description;
		this.date = date;
		this.provider = provider;
		this.price = price;
	}

	/**
	 * Description getter
	 * @return Command's description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Date getter
	 * @return Command's date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Provider getter
	 * @return Command's provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * Price getter
	 * @return Command's price
	 */
	public double getPrice() {
		return price;
	}
	
	

}
