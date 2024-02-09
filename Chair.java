import java.awt.Color;
import java.awt.Graphics;

import org.hy.HPanel;

/**
 * Chair
 */
public class Chair extends HPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int radius = getWidth()>getHeight()?getHeight()/2:getWidth()/2; // You can adjust the radius as needed

        // Use drawOval for just the circle outline
        g.setColor(Color.BLACK); // Set the desired color
        g.drawRect(0,0, 2 * radius, 2 * radius);

        // Use fillOval to fill the circle with color
        g.setColor(Color.ORANGE.darker()); // Set the desired color
        g.fillRect(0,0, 2 * radius, 2 * radius);
    }
}