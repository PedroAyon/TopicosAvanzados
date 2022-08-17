package u1.introduction;

import javax.swing.JPanel;
import java.awt.*;

public class Lines extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        for (int i = 1; i < 10; i++) {
            int x = getWidth() / 10 * i;
            g.drawLine(x, 0, x, getHeight());
        }
        g.setColor(Color.BLUE);
        for (int i = 1; i < 10; i++) {
            int y = getHeight() / 10 * i;
            g.drawLine(0, y, getWidth(), y);
        }
        g.setColor(Color.BLACK);
        for (int i = 0, j = 10; i <= 10 && j >= 0; i++, j--) {
            int x = getWidth() / 10 * i;
            int y = getHeight() / 10 * j;
            g.drawLine(x, getHeight(), 0, y);
        }
        g.drawOval(getWidth() / 2 - 50, getHeight() / 2 - 50, 100, 100);
    }
}
