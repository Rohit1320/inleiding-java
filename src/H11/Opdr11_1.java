package H11;


import java.applet.Applet;
import java.awt.Graphics;

public class Opdr11_1 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller < 11; teller++) {
            y += 20;
            g.drawLine(y , 50, y, 300 );
            g.drawString("" + teller, y, 315 );
        }
    }
}