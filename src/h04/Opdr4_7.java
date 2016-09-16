package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_7 extends Applet {

    public void init() {
        setBackground(Color.gray);
    }

    public void paint (Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(50, 50, 150, 150, 10, 10);
        g.setColor(Color.black);
        g.fillOval(60, 60, 40, 40);
        g.setColor(Color.black);
        g.fillOval(150, 60, 40, 40);
        g.setColor(Color.black);
        g.fillOval(60, 150, 40, 40);
        g.setColor(Color.black);
        g.fillOval(150, 150, 40, 40);
    }




}
