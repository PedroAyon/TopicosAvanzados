package u1.shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ShapeFactory {
    public static Shape create(String opt, int x, int y, int w, int h) {
        return switch (opt) {
            case "rectangle" -> new Rectangle2D.Float(x, y, w, h);
            case "oval" -> new Ellipse2D.Float(x, y, w, h);
            default -> null;
        };
    }
}
