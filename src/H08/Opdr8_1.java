package H08;

import java.awt.*;
import java.applet.*;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;

public class Opdr8_1 extends Applet {
    Button knop;
    Button knopReset;
    String schermtekst;
    TextField tekstvak;
    Label label;

    public void init() {
        schermtekst = " ";
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
        knopReset = new Button("Reset");
        KnopListener kp = new KnopListener2();
        knopReset.addActionListener( kp );
        add(knopReset);
        tekstvak = new TextField ("Klik op mij", 20);
        label = new Label("Type iets in het  tekstvakje");
        add(label);
        add(tekstvak);

    }

    public void paint (Graphics g) {
        g.drawString(schermtekst,50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e ) {
            schermtekst = "" + tekstvak.getText();
            repaint ();
        }
    }

    private class KnopListener2 extends KnopListener {
        public void actionPerformed( ActionEvent e ) {
            schermtekst = "";
            tekstvak.setText("");
            repaint();
        }
    }
}

