package fr.iutvalence.info.dut.m2107.dashnews.item;



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
	
	public Indicator(int length, int height, float[] data)
	{
		super(length,height);
		this.data = data;
	}

	@Override
	public void display() 
	{
		
	}

	@Override
	public void actualize() 
	{
		
		
	}
	
	
}
