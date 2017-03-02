package H10RE;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10_5RE extends Applet {

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


            if (invoer >= 5.5) {
                bepaler = "Voldoende :)";
            } else
                bepaler = "Onvoldoende :(";

            tekstveld.setText("");
            repaint();

        }
    }
}