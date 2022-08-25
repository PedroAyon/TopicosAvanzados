package u1.textfields;

import u1.label_frame.LabelFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new TextFieldFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
