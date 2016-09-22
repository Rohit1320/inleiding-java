package H06;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdrH06 extends Applet {

    private double cijfer1;
    private double cijfer2;
    private double cijfer3;


    double gemiddelde;
    int afgekapt;
    double uitkomst;

    public void init () {
        super.init();
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;

        gemiddelde = (cijfer1 +cijfer2  +cijfer3 ) /3;
        afgekapt = (int) (gemiddelde * 10);
        uitkomst =(double) afgekapt / 10;
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("De uitkomst is:"+ uitkomst, 50, 50);

    }

}
