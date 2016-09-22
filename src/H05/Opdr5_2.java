package H05;

import java.awt.*;
import java.applet.*;

    public class Opdr5_2 extends Applet {

        //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {

            //initialisatie.
            breedte = 60;

        }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawLine(40, 40, 40, 240);
        g.setColor(Color.black);
        g.fillRect(50, 160, breedte, 80);
        g.setColor(Color.red);
        g.fillRect(120, 80, breedte, 160);
        g.setColor(Color.green);
        g.fillRect(190, 40, breedte, 200);

        //namen
        g.setColor(Color.black);
        g.drawString("Valerie", breedte, 260 );
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