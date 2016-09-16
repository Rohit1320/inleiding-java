package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(110, 80, 140, 35);
        g.setColor(Color.white);
        g.fillRect(110, 115, 140, 35);
        g.setColor(Color.blue);
        g.fillRect(110, 150, 140, 35);
        g.setColor(Color.lightGray);
        g.fillRect(100, 80, 10, 180);
    }
}
