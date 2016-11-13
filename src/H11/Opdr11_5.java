package H11;


import java.awt.*;
import java.applet.*;

public class Opdr11_5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 1; teller < 6; teller++) {
            y += 40;
            g.drawRect(y, y, 40, 40);
        }
    }
}