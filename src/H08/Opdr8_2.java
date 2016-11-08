package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdr8_2 extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    String schermtekst;
    Label label;
    String M;
    String V;
    String PV;
    String ML;
    int a;
    int b;
    int c;
    int d;
    String Totaal;
    int totaal;


    public void init() {
        schermtekst = " ";
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
        knop2 = new Button("Ok2");
        add(knop2);
        knop3 = new Button("Ok3");
        kl = new KnopListener();
        add(knop3);
        knop4 = new Button ("Ok4");
        kl = new KnopListener();
        add(knop4);
        label = new Label("");
        add(label);
        a = 22;
        b = 10;
        c = 8;
        d = 9;
        totaal = (a + b + c +d);

    }

    public void paint(Graphics g) {
        g.drawString(M, 70, 70);
        g.drawString(V, 70, 90);
        g.drawString(PV,70, 110);
        g.drawString(ML,70, 130);
        g.drawString(Totaal, 70, 150);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            M = "Mannen : " + a;
            V = "Vrouwen : " + b;
            PV = "Potentiële vrouwen : " + c;
            ML = "Mannelijke leerlingen : " + d;
            Totaal = "totaal : " + totaal;
            repaint();
        }
    }

}