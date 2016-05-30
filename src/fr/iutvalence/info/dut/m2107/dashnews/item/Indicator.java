package fr.iutvalence.info.dut.m2107.dashnews.item;

import java.awt.Color;
import java.awt.Dimension;


public class Indicator extends Information {
 
	private float[] data;

	// TODO ???????
	/**
	 * 
	 * @param length
	 * @param height
	 */
	public Indicator(int length,int height) {
		super(length,height);
		this.display();
	}

	@Override
	public void display() {
		this.setSize(new Dimension(100,100));
		this.setBackground(Color.BLACK);
		
	}
	
	
}
