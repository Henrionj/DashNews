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
    
     
     /**
      * La m�thode paintTabBackground permet de changer la couleur de
      * fond des onglets, et notamment l'arri�re plan.
      */
     protected void paintTabBackground(Graphics g, int tabPlacement,
     int tabIndex, int x, int y, int w, int h, boolean isSelected) {
       g.setColor(new Color(170,180,179));
       g.fillRect(x, y, w, h);
       if(isSelected) {
         g.setColor(new Color(216,37,37));
         g.fillRect(x, y, w, h);
       }
     }
     
     /**
      * La m�thode paintTabBorder permet de changer l'apparence des
      * bordures des onglets, elle prend les m�mes param�tres que la
      * m�thode paintTabBackground
      */
     protected void paintTabBorder(Graphics g, int tabPlacement,
     int tabIndex, int x, int y, int w, int h, boolean isSelected) {

       g.drawRect(x, y, w, h);
       if(isSelected)
         g.setColor(new Color(121,134,133));
     }
     
     /**
      * Permet de red�finir le focus, quand on a le focus sur un onglet
      * un petit rectangle en pointill� appara�t en red�finissant la m�thode
      * on peut supprimer ce comportement.
      */
     protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] 
     rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
     }

     /**
      * Calcul de la hauteur des onglets
      */
     protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
       int vHeight = fontHeight;
       return vHeight+25;
     }
     
     /**
      * Calcul de la largeur des onglets
      */
     protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics 
     metrics){
       return super.calculateTabWidth(tabPlacement, tabIndex, metrics) + 
       metrics.getHeight()+124;
     }
     
     /**
      * D�finit l'emplacement ou se trouvera le texte, on peut ainsi le d�caler, ici 
      * on le laisse a 0. Le titre sera donc au centre de l'onglet.
      */
     protected int getTabLabelShiftY(int tabPlacement,int tabIndex,boolean isSelected) {
         return 0;
     }
 
     /**
      * Permet d'affecter une marge (en haut, a gauche, en bas, a droite) entre les 
      * onglets et l'affichage du contenu. 
      */
     protected Insets getContentBorderInsets(int tabPlacement) {
             return new Insets(0,0,0,0);
     }
      
     /**
      * Permet de d�finir des points pr�cis comme par exemple :
      * tabAreaInsest.left => on d�cale les onglets de l'espace que l'on souhaite ici 
      * on le laisse a 0, donc les onglets commenceront exactement au bord gauche du 
      * JtabbedPane.
      */
     protected void installDefaults() {
             super.installDefaults();
             tabAreaInsets.left = 0;
             selectedTabPadInsets = new Insets(0, 0, 0, 0);
             tabInsets = selectedTabPadInsets;
             tabFont = new Font(" TimesRoman ",Font.BOLD,20);
             boldFontMetrics = tabPane.getFontMetrics(tabFont);
     }
     
     /**
     * On peut choisir la couleur du texte, et son font.
     */
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
     
     /**
      * Permettent de red�finir la bordure du haut des onglets.
      */
     protected void paintContentBorderTopEdge(Graphics g, int tabPlacement, int
     selectedIndex, int x, int y, int w, int h) {          
     }
      
     /**
      * Permettent de red�finir la bordure de droite des onglets.
      */
     protected void paintContentBorderRightEdge(Graphics g, int tabPlacement,int
     selectedIndex, int x, int y, int w, int h) {
     }
      
     /**
      * Permettent de red�finir la bordure de gauche des onglets.
      */
     protected void paintContentBorderLeftEdge(Graphics g, int tabPlacement,int
     selectedIndex, int x, int y, int w, int h) {
     }
      
     /**
      * Permettent de red�finir la bordure du bas des onglets.
      */
     protected void paintContentBorderBottomEdge(Graphics g, int tabPlacement,int
     selectedIndex, int x, int y, int w, int h) {
     }
   
}
