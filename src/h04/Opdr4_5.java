package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.fillArc(20, 20, 100, 150, 250, 370);
    }
}
