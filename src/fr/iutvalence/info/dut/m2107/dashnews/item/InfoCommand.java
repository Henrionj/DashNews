package fr.iutvalence.info.dut.m2107.dashnews.item;

import java.util.List;

public class InfoCommand extends Information {

	/**
	 * InfoCommand's default length
	 */
	public static final int DEFAULT_LENGTH = 275;
	
	/**
	 * InfoCommand's default height
	 */
	public static final int DEFAULT_HEIGHT = 350;
	
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

}
