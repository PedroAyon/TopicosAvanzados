package u1.introduction;

import javax.swing.*;
import java.awt.*;

public class Circles extends JPanel {
    int biggestCircleSize;
    int numberOfCircles;

    public Circles(int biggestCircleSize, int numberOfCircles) {
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
        for (int circleCount = 0; circleCount < numberOfCircles; circleCount++, size -= sizeDecrement) {
            if (circleCount % 2 == 0) g.setColor(Color.BLACK);
            else g.setColor(Color.WHITE);
            g.fillOval(x - size / 2, y - size / 2, size, size);
        }
    }
}
