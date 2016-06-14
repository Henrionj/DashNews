package fr.iutvalence.info.dut.m2107.dashnews.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class TabStyle extends BasicTabbedPaneUI 
{

	 private FontMetrics boldFontMetrics;
     private Font tabFont ;
    

     protected void paintTabBackground(Graphics g, int tabPlacement,
     int tabIndex, int x, int y, int w, int h, boolean isSelected) {
       g.setColor(new Color(170,180,179));
       g.fillRect(x, y, w, h);
       if(isSelected) 
       {

       	   g.setColor(new Color(200,191,231));
           g.fillRect(x, y, w, h);
       }
        }

     protected void paintTabBorder(Graphics g, int tabPlacement,
     int tabIndex, int x, int y, int w, int h, boolean isSelected) {

       g.drawRect(x, y, w, h);
       if(isSelected)
         g.setColor(new Color(121,134,133));
     }

     protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] 
     rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
     }

     protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
       int vHeight = fontHeight;
       return vHeight+25;
     }
     

     protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics 
     metrics){
       return super.calculateTabWidth(tabPlacement, tabIndex, metrics) + 
       metrics.getHeight()+124;
     }

     protected int getTabLabelShiftY(int tabPlacement,int tabIndex,boolean isSelected) {
         return 0;
     }

     protected Insets getContentBorderInsets(int tabPlacement) {
             return new Insets(0,0,0,0);
     }
      

     protected void installDefaults() {
             super.installDefaults();
             tabAreaInsets.left = 0;
             selectedTabPadInsets = new Insets(0, 0, 0, 0);
             tabInsets = selectedTabPadInsets;
             tabFont = new Font(" TimesRoman ",Font.BOLD,20);
             boldFontMetrics = tabPane.getFontMetrics(tabFont);
     }
     

     protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics 
     metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
       if (isSelected) {   
    	
         super.paintText(g, tabPlacement, tabFont, metrics, tabIndex, 
         title, textRect, isSelected);
       }
       else
         super.paintText(g, tabPlacement, tabFont, metrics, tabIndex, title, textRect, 
         isSelected);
     }


   
}
