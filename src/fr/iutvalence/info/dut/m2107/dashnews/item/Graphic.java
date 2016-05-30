package fr.iutvalence.info.dut.m2107.dashnews.item;

<<<<<<< HEAD
=======
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

>>>>>>> branch 'master' of https://github.com/Henrionj/DashNews.git

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
}
