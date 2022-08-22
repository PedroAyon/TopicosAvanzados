package u1.introduction;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class Suma {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(JOptionPane.showInputDialog("Introduzca el primer numero"));
        Integer num2 = Integer.valueOf(JOptionPane.showInputDialog("Introduzca el segundo numero"));
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, num1 + num2);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}
