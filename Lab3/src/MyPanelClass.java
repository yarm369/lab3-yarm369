import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.PINK);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw a borders
//                        g.setColor(Color.MAGENTA);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1+8, y1+8, width-16, height-16);
//                        
//                        
//                        g.setColor(Color.MAGENTA);
//                        g.drawRect(x1+16, y1+16, width-32, height-32);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.YELLOW);
//                        g.drawLine(x1, y2, x2, y1);
//                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((x2/2)-(55/2), (y2/2)-(55/2), 55, 55);
//                       
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1,(y2/5));                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1,(y2/5), width + 1,2*(y2/5));                        
                        g.setColor(Color.RED);
                        g.fillRect(x1,2*(y2/5), width + 1,3*(y2/5));                       
                        g.setColor(Color.WHITE);
                        g.fillRect(x1,3*(y2/5), width + 1,4*(y2/5));                        
                        g.setColor(Color.RED);
                        g.fillRect(x1,4*(y2/5), width + 1,5*(y2/5));
                        
                        //Triangle
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1, y1);
                        triangle.addPoint((x2/2),(y2/2));
                        triangle.addPoint(x1, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        //Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25 + (x2/6), y1 + 73 +(y2/5)*2);
                        p2.addPoint(x1 + 41 + (x2/6), y1 + 73 +(y2/5)*2);
                        p2.addPoint(x1 + 47 + (x2/6), y1 + 58 +(y2/5)*2);
                        p2.addPoint(x1 + 53 + (x2/6), y1 + 73 +(y2/5)*2);
                        p2.addPoint(x1 + 69 + (x2/6), y1 + 73 +(y2/5)*2);
                        p2.addPoint(x1 + 56 + (x2/6), y1 + 83 +(y2/5)*2);
                        p2.addPoint(x1 + 61 + (x2/6), y1 + 98 +(y2/5)*2);
                        p2.addPoint(x1 + 47 + (x2/6), y1 + 88 +(y2/5)*2);
                        p2.addPoint(x1 + 34 + (x2/6), y1 + 98 +(y2/5)*2);
                        p2.addPoint(x1 + 38 + (x2/6), y1 + 83 +(y2/5)*2);
                    	g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                                 
            }
}
