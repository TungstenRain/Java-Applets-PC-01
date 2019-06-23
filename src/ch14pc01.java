/**
 * Author: Frank Olson
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Applet with the word "Hello" that follows the mouse movement
 */
public class ch14pc01 extends Applet implements MouseListener, MouseMotionListener  {
    private int x;
    private int y;
    private final String text = "Hello";

    /**
     * Initialize the applet
     */
    public void init() {
        // Add mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // set the x/y values
        x = 100;
        y = 100;
    }

    /**
     * Paint the text
     * @param g Graphics The Graphics class
     */
    public void paint(Graphics g) {
        // Draw the String and then allow it to move about
        g.drawString(text, x, y);
    }

    // Applicable mouse motion listener

    /**
     * Method that captures the mouse movement and repositions the text
     * to where the mouse pointer is located
     * @param e
     */
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    // Non-applicable mouse motion listeners
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
