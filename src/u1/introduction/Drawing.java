package u1.introduction;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    int gridSize;

    public Drawing(int gridSize) {
        if (gridSize % 2 != 0) gridSize--;
        this.gridSize = gridSize;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        int xMiddle = getWidth() / 2;
        int yMiddle = getHeight() / 2;
        g.setColor(Color.YELLOW);
        g.drawLine(xMiddle, 0, xMiddle, getHeight());
        g.drawLine(0, yMiddle, getWidth(), yMiddle);
        for (int i = 0; i <= gridSize; i++) {
            int y = getHeight() / gridSize * i;
            int xLeft, xRight;
            if (i < gridSize / 2) {
                xLeft = getWidth() / gridSize * (gridSize / 2 - i - 1);
                xRight = getWidth() / gridSize * (gridSize / 2 + i + 1);
            } else if (i > gridSize / 2) {
                xLeft = getWidth() / gridSize * (i - gridSize / 2 - 1);
                xRight = getWidth() / gridSize * (gridSize - (i - gridSize / 2 - 1));
            } else continue;
            g.drawLine(xMiddle, y, xLeft, yMiddle);
            g.drawLine(xMiddle, y, xRight, yMiddle);
        }
    }
}
