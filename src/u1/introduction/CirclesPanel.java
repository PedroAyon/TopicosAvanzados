package u1.introduction;

import javax.swing.*;
import java.awt.*;

public class CirclesPanel extends JPanel {
    int biggestCircleSize;
    int numberOfCircles;

    public CirclesPanel(int biggestCircleSize, int numberOfCircles) {
        this.biggestCircleSize = biggestCircleSize;
        this.numberOfCircles = numberOfCircles;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.LIGHT_GRAY);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int sizeDecrement = biggestCircleSize / numberOfCircles;
        int size = biggestCircleSize;
        for (int circleCount = 0;
             circleCount < numberOfCircles;
             circleCount++, size -= sizeDecrement) {
            if (circleCount % 2 == 0) g.setColor(Color.WHITE);
            else g.setColor(Color.BLACK);
            g.fillOval(x - size / 2, y - size / 2, size, size);
        }
    }
}
