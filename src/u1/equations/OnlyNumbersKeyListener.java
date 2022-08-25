package u1.equations;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class OnlyNumbersKeyListener extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if ((c < '0' || c > '9' ) && (c != KeyEvent.VK_BACK_SPACE && c != '.' && c != '-'))
            e.consume();  // if it's not a number, ignore the event
    }
}
