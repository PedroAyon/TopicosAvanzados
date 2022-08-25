package u1.label_frame;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame() {
        super("JLabel test");
        setLayout(new FlowLayout());

        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(getClass().getResource("java.png")));
        Image image = imageIcon.getImage();
        image = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(image);

        // Constructor de JLabel con un argumento String
        label1 = new JLabel("Some text");
        label1.setToolTipText("This is label 1");
        add(label1);



        // Constructor de JLabel con argumentos de cadena, Icono y alineación
        label2 = new JLabel("Label with text and icon", imageIcon,
        SwingConstants.LEFT);
        label1.setToolTipText("This is label 2");
        add(label2);


        label3 = new JLabel(); // Constructor sin argumentos
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(imageIcon);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label 3");
        add(label3);
    }

}
