import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        
                        //Draw a borders
                        g.setColor(Color.MAGENTA);
                        g.drawRect(x1, y1, width, height);
                        
                        
                        g.setColor(Color.GREEN);
                        g.drawRect(x1+8, y1+8, width-16, height-16);
                        
                        
                        g.setColor(Color.MAGENTA);
                        g.drawRect(x1+16, y1+16, width-32, height-32);
            }
}
