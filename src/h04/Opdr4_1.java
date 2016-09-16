package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(70, 150, 270, 250);
        g.drawLine(70, 150, 270, 50);
        g.drawLine(270, 250, 270, 50);
    }
}
