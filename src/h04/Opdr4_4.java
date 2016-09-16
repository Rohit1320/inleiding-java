package h04;

import java.awt.*;
import java.applet.*;

public class Opdr4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawLine(40, 40, 40, 240);
        g.setColor(Color.black);
        g.fillRect(50, 160, 60, 80);
        g.setColor(Color.red);
        g.fillRect(120, 80, 60, 160);
        g.setColor(Color.green);
        g.fillRect(190, 40, 60, 200);

        //namen
        g.setColor(Color.black);
        g.drawString("Valerie", 60, 260 );
        g.setColor(Color.RED);
        g.drawString("Jeroen", 130, 260 );
        g.setColor(Color.GREEN);
        g.drawString("Hans", 200, 260 );



        //nummers
        g.setColor(Color.gray);
        g.drawString("20", 20, 210 );
        g.setColor(Color.black);
        g.drawString("40", 20, 170 );
        g.setColor(Color.gray);
        g.drawString("60", 20, 130 );
        g.setColor(Color.red);
        g.drawString("80", 20, 90 );
        g.setColor(Color.green);
        g.drawString("100", 10, 50 );


    }
}