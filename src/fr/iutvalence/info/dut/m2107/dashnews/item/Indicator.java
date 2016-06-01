package fr.iutvalence.info.dut.m2107.dashnews.item;



public class Indicator extends Information {
 
	private float[] data;

	// TODO ???????
	/**
	 * 
	 * @param length
	 * @param height
	 */
	public Indicator(int length,int height,String name) {
		super(length,height,name);
		this.display();
	}
	
	public Indicator(int length, int height,String name, float[] data)
	{
		super(length,height,name);
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
