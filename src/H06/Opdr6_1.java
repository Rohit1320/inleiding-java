package H06;

import java.awt.*;
import java.applet.*;


public class Opdr6_1 extends Applet {
    double a;
    double b;
    double uitkomst;

    public void init() {
      super.init();
        a = 113;
        b = 4;

        uitkomst = (a/b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}