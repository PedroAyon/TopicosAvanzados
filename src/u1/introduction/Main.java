package u1.introduction;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int biggestCircleSize = Integer.parseInt(JOptionPane.showInputDialog("Biggest circle size"));
        int numberOfCircles = Integer.parseInt(JOptionPane.showInputDialog("Number of circles"));
        JPanel panel = new Circles(biggestCircleSize, numberOfCircles);
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
    }
}
