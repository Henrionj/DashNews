package fr.iutvalence.info.dut.m2107.dashnews.item;




/**
 * Class Graphic.
 * @author  IT Prouds & CO.
 *
 */
public class Graphic extends Item {
	
	/**
	 * The graphic's data
	 */
	int[] data;
		
	/**
	 * Enable to insert new data on the graphic
	 */
	public void insertData(int[] data)
	{
		for (int i = 0; i < data.length; i++)
		{
			this.data[i]=data[i];
		}
	}
	
	/**
	 * Graphic's constructor
	 */
	public Graphic(int length,int height)
	{
		super(length,height);
		this.data=new int[20];
	}
	
	
	/**
	 * Max value getter
	 * @return data's max value
	 */
	private int getMaxValue() 
	{
        int max = -Integer.MAX_VALUE;
        for(int i = 0; i < data.length; i++) 
        {
            if(data[i] > max)
                max = data[i];
        }
        return max;
    }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
