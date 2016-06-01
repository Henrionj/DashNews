package fr.iutvalence.info.dut.m2107.dashnews.item;

import java.util.List;

public class InfoCommand extends Information {

	/**
	 * InfoCommand's default length
	 */
	private static final int DEFAULT_LENGTH = 200;
	
	/**
	 * InfoCommand's default height
	 */
	private static final int DEFAULT_HEIGHT = 250;
	
	/**
	 * List of commands paid
	 */
	private List<Command> paid;
	
	/**
	 * List of commands paid
	 */
	private List<Command> topay;

	public InfoCommand(int length, int height,String name) {
		super(length, height,name);
		this.paid=null;
		this.topay=null;
	}

	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualize() {
		// TODO Auto-generated method stub
		
	}

	public static int getDefaultLength() {
		return DEFAULT_LENGTH;
	}

	public static int getDefaultHeight() {
		return DEFAULT_HEIGHT;
	}

}
