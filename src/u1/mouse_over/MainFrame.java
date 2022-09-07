package u1.mouse_over;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {
    private JPanel jPanelColor;
    private JLabel jLabelMessage;

    public MainFrame() {
        super("Rastreador de raton");
        initComponents();
        paintView();
    }

    private void initComponents() {
        jPanelColor = new JPanel();
        MouseManager mouseManager = new MouseManager();
        jPanelColor.addMouseListener(mouseManager);
        jPanelColor.addMouseMotionListener(mouseManager);
        jLabelMessage = new JLabel();
    }

    private void paintView() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        jPanelColor.setBackground(Color.GREEN);
        add(jPanelColor);
        add(jLabelMessage);
    }


    private class MouseManager extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            jLabelMessage.setText(String.format("Se oprimio en [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            jLabelMessage.setText(String.format("Se solto en [%d, %d]",
                    e.getX(), e.getY()));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            jLabelMessage.setText("Raton fuera de JPanel");
            jPanelColor.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            jLabelMessage.setText(String.format("Se arrastro en [%d, %d]",
                    e.getX(), e.getY()));
        }
    }
}
