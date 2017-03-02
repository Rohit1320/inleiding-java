package H10RE;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrH10RE extends Applet {

    TextField tekstveld;
    int aantal;
    String s, bepaler;
    double gemiddelde, totaal, invoer;


    public void init() {
        tekstveld = new TextField("", 5);
        tekstveld.addActionListener(new VeldListener());
        add(tekstveld);

        aantal = 0;
        gemiddelde = 0.0;
        totaal = 0.0;
        bepaler = "";
    }


    public void paint(Graphics g) {

        g.drawString("" + bepaler, 50, 100);
        g.drawString("Het gemiddelde cijfer is: " + gemiddelde, 50, 120);
        g.drawString("Aantal cijfers " + aantal, 50, 140);

    }

    class VeldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            aantal++;
            totaal = invoer + totaal;
            gemiddelde = totaal / aantal;


            switch (aantal) {
                case 1:
                    bepaler = "Onvoldoende :(";
                    break;
                case 2:
                    bepaler = "Onvoldoende :(";
                    break;
                case 3:
                    bepaler = "Onvoldoende :(";
                    break;
                case 4:
                    bepaler = "Onvoldoende :(";
                    break;
                case 5:
                    bepaler = "Matig :|";
                    break;
                case 6:
                    bepaler = "Voldoende :)";
                    break;
                case 7:
                    bepaler = "Voldoende :)";
                    break;
                case 8:
                    bepaler = "Goed :P";
                    break;
                case 9:
                    bepaler = "Goed :P";
                    break;
                case 10:
                    bepaler = "Goed :P";
                    break;

                default:
                    bepaler = "ERROR cijfers niet beschikbaar";
            }
            repaint();
        }
    }

}
