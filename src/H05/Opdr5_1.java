package h05;

import java.awt.*;
import java.applet.*;

public class Opdr5_1 extends Applet {

    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        setBackground(Color.white);

        //initialisatie.
        opvulkleur = Color.magenta;
        lijnkleur = Color.BLACK;
        breedte = 50;
        hoogte = 100;
    }

    public void paint (Graphics g) {

    //lijn
    g.drawLine(50, 50, 150, 50 );
    g.drawString("lijn", 90, 70);

    //rechthoek
    g.drawRect(50, 80, hoogte, breedte);
    g.drawString("Rechthoek", 65, 150);

    //Afgeronde Rechthoek
    g.drawRoundRect(50, 160, hoogte, 60, 30, 30);
    g.drawString("Afgeronde Rechthoek", 35, 240);

    //gevulde Ovaal
    g.setColor(opvulkleur);
    g.fillOval(200, 170, 90, breedte);
    g.drawString("Gevulde ovaal", 180, 240);

    //Gevulde rechthoek met ovaal
    g.fillRect(200, 80, hoogte, breedte);
    g.setColor(Color.black);
    g.drawOval(200, 80, hoogte, breedte);
    g.drawString("Gevulde Rechthoek met ovaal", 160, 150);


    //cirkel
    g.drawOval(400, 170, 50, breedte);
    g.drawString("Cirkel", 405, 240);

    //Taartpunt met ovaal eroverheen
    g.drawOval(380, 80, hoogte, breedte);
    g.setColor(opvulkleur);
    g.fillArc(375, 85, 110, 35, -30, 65);

    }
}