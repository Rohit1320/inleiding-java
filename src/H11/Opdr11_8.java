package H11;


import java.awt.*;
import java.applet.*;

public class Opdr11_8 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int vergroting = 10;
        int x = 270;
        int y = 270;

        for(teller = 1; teller < 101; teller++) {
            vergroting += 10;
            x -= 5;
            y -= 5;
            g.drawOval(x, y, vergroting, vergroting);;
        }
    }
}
