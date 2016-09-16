package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        g.drawRect(20, 50, 150, 150);
        g.drawRect(30, 70, 50, 50);
        g.drawRect(80, 150, 30, 50);

    }
}