package draw;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

class DrawComponent extends JComponent {
	
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 400;
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		
		// Rysowanie prostok�ta.
		
		Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
		g2.draw(rect);
		
		
		// Rysowanie elipsy.
		
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
		
		// Rysowanie przek�tnej.
		
		g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		
		
		// Rysowanie ko�a z takim samym �rodkiem.
		
		double centerX = rect.getCenterX();
		double centerY = rect.getCenterY();
		double radius = 150;
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
		g2.draw(circle);
		
		g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
		
		
	}
	
	public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }
	
}