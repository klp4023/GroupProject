import java.awt.Color;
import java.awt.Graphics;

/**
 * A particular kind of building where Football is played.
 * 
 * @author Brian Walker
 * 
 */
public class FootballStadium extends Building {

	/**
	 * The constructor saves the upper and lower points of the rectangle.
	 * 
	 * @param x1
	 *            The x-coord of the upper point.
	 * @param y1
	 *            The y-coord of the upper point.
	 * @param x2
	 *            The x-coord of the lower point.
	 * @param y2
	 *            The y-coord of the lower point.
	 */
	public FootballStadium(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2, ControlPanel.footballStadium);
	}

	/**
	 * How to draw an a Football Stadium by using the image of an Football
	 * Stadium.
	 * 
	 * @param g
	 *            The graphics object within which to draw the building.
	 */
	public void draw(Graphics g) {
		g.drawImage(SimU.footballStadium.getImage(), // the image
				upperX, upperY, // the upper left corner
				(lowerX - upperX), (lowerY - upperY), // the width and height
				null, null); // the color of the background, and the
									// listener (none)
	}

}
