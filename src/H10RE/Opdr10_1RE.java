package H10RE;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr10_1RE extends Applet {

    int getal1;
    int getal2;
    TextField veld1;
    TextField veld2;
    Label label;
    String tekst;

    public void init() {

        veld1 = new TextField(" ", 5);
        veld1.addActionListener(new VeldListener());
        add(veld1);
        tekst = " " ;
        veld2 = new TextField(" ", 5);
        veld2.addActionListener(new VeldListener());
        add(veld2);
        label = new Label("Type 2 getallen in###");

    }

        public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
        }


    class VeldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;
            String l;
            s = veld1.getText();
            l = veld2.getText();
            getal1 = Integer.parseInt(s);
            getal2 = Integer.parseInt(l);
            if (getal1 > getal2) {
                tekst = "Grootste getal." + getal1;
            }
            else {
                tekst = "Grootste getal." + getal2;
            }
            repaint();


        }
    }
}