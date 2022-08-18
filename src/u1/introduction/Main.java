package u1.introduction;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JPanel panel = new Lines(20);
        JPanel panel = new Circles(900, 20);
        // JPanel panel = new Drawing(20);

        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
    }
}
