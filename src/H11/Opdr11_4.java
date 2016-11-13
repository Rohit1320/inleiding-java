package H11;

import java.awt.*;
import java.applet.*;

public class Opdr11_4 extends Applet {


        public void init() {}

        public void paint(Graphics g) {
            int teller;
            int andwoord;
            int y = 0;

            for(teller = 1; teller < 11; teller++) {
                andwoord = teller * 3;
                y += 20;
                g.drawString("" + andwoord, 180, y );
                g.drawString(teller + " x 3 =", 125, y );
            }
        }
    }
