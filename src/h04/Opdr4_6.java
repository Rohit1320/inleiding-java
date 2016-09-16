package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_6 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.drawOval(20, 50, 140, 240);
        g.fillOval(30, 60, 120, 220);
        g.setColor(Color.red);
        g.fillOval(65, 90, 50, 50);
        g.setColor(Color.orange);
        g.fillOval(65, 150, 50, 50);
        g.setColor(Color.green);
        g.fillOval(65, 210, 50, 50);


    }

}