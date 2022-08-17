package u1.introduction;

import javax.swing.JPanel;
import java.awt.*;

public class Lines extends JPanel {
    int gridSize;

    public Lines(int gridSize) {
        this.gridSize = gridSize;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.black);
        g.setColor(Color.RED);
        drawVerticalLines(g);
        g.setColor(Color.BLUE);
        drawHorizontalLines(g);
        g.setColor(Color.CYAN);
        drawLeftToRightDiagonals(g);
        g.setColor(Color.YELLOW);
        drawRightToLeftDiagonals(g);
    }

    private void drawVerticalLines(Graphics g) {
        for (int i = 1; i < gridSize; i++) {
            int x = getWidth() / gridSize * i;
            g.drawLine(x, 0, x, getHeight());
        }
    }

    private void drawHorizontalLines(Graphics g) {
        for (int i = 1; i < gridSize; i++) {
            int y = getHeight() / gridSize * i;
            g.drawLine(0, y, getWidth(), y);
        }
    }

    private void drawLeftToRightDiagonals(Graphics g) {
        for (int i = 1; i <= gridSize; i++) {
            int x = getWidth() / gridSize * i;
            int y = getHeight() / gridSize * i;
            g.drawLine(x, 0, 0, y);
            g.drawLine(getWidth(), y, x, getHeight());
        }
    }

    private void drawRightToLeftDiagonals(Graphics g) {
        for (int i = 0, j = gridSize; i < gridSize && j > 0; i++, j--) {
            int x = getWidth() / gridSize * i;
            int y = getHeight() / gridSize * j;
            g.drawLine(x, 0, getWidth(), y);
            g.drawLine(0, y, x, getHeight());
        }
    }
}
