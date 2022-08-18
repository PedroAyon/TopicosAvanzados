package u1.introduction;

import javax.swing.*;
import java.awt.*;

public class Circles extends JPanel {
    int biggestCircleSize;
    int sizeDecrement;

    public Circles(int biggestCircleSize, int sizeDecrement) {
        this.biggestCircleSize = biggestCircleSize;
        this.sizeDecrement = sizeDecrement;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.LIGHT_GRAY);
        int xMiddle = getWidth() / 2;
        int yMiddle = getHeight() / 2;
        g.setColor(Color.WHITE);
        for (int size = biggestCircleSize, i = 0; i < biggestCircleSize / sizeDecrement; size -= sizeDecrement, i++) {
            if (i % 2 == 0) g.setColor(Color.BLACK);
            else g.setColor(Color.WHITE);
            g.fillOval(xMiddle - size / 2, yMiddle - size / 2, size, size);
        }
    }
}
