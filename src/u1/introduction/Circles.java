package u1.introduction;

import javax.swing.*;
import java.awt.*;

public class Circles extends JPanel {
    int smallestCircleSize;
    int numberOfCircles;

    public Circles(int smallestCircleSize, int numberOfCircles) {
        this.smallestCircleSize = smallestCircleSize;
        this.numberOfCircles = numberOfCircles;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        int xMiddle = getWidth() / 2;
        int yMiddle = getHeight() / 2;
        g.setColor(Color.WHITE);
        g.drawLine(xMiddle, 0, xMiddle, getHeight());
        g.drawLine(0, yMiddle, getWidth(), yMiddle);
        for (int size = smallestCircleSize, i = 0; i < numberOfCircles; size += 50, i++) {
            g.drawOval(xMiddle - size / 2, yMiddle - size / 2, size, size);
        }
    }
}
