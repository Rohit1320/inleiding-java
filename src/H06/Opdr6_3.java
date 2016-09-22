package H06;

import java.applet.Applet;
import java.awt.*;



public class Opdr6_3 extends Applet {

    int Positiefgetal1;
    int Positiefgetal2;
    int uitkomst;
    public void init() {
        super.init();
        Positiefgetal1 =  2147483647;
        Positiefgetal2 = 1;

        uitkomst = (Positiefgetal1 + Positiefgetal2);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}