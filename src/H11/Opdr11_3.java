package H11;

import java.awt.*;
import java.applet.*;

public class Opdr11_3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int y = 0;
        int fibonacci = 1, fibonacci2 = 0;
        int a;
        for (int i = 0; i < 10; i++) {
            y += 20;
            g.drawString("" + (fibonacci + fibonacci2), 15, y);
            a = fibonacci;
            fibonacci = fibonacci2;
            fibonacci2 = a + fibonacci2;
        }
    }
}