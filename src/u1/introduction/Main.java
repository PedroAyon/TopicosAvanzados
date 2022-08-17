package u1.introduction;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JPanel panel = new Lines(10);
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
    }
}
