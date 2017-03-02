package H10RE;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10_4RE extends Applet {

    TextField tekstveldmaand, tekstveldjaar;
    Label labelmaand, labeljaar;
    int maand, jaar;
    String s, s2, maandString, dagenString, jaarString;

    public void init() {

        tekstveldmaand = new TextField("", 5);
        tekstveldmaand.addActionListener(new Tekstveldlistener());
        tekstveldjaar = new TextField("", 5);
        tekstveldjaar.addActionListener(new Tekstveldlistener2());
        labelmaand = new Label("Type een maand in om erachter te komen hoeveel dagen erin zitten.");
        labeljaar = new Label("Type een jaar in om erachter te komen of het een schrikkeljaar is.");
        maandString = "";
        dagenString = "";
        jaarString = "";
        add(tekstveldmaand);
        add(tekstveldjaar);

    }

    public void paint(Graphics g) {
        g.drawString(maandString, 50, 100);
        g.drawString(dagenString, 50, 120);
        g.drawString(jaarString, 50, 160);

    }




    class Tekstveldlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstveldmaand.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    maandString = "Januari";
                    dagenString = "31 dagen";
                    break;
                case 2:
                    maandString = "Februari";
                    dagenString = "28 dagen";
                    break;
                case 3:
                    maandString = "Maart";
                    dagenString = "31 dagen";
                    break;
                case 4:
                    maandString = "April";
                    dagenString = "30 dagen";
                    break;
                case 5:
                    maandString = "Mei";
                    dagenString = "31 dagen";
                    break;
                case 6:
                    maandString = "Juni";
                    dagenString = "30 dagen";
                    break;
                case 7:
                    maandString = "Juli";
                    dagenString = "31 dagen";
                    break;
                case 8:
                    maandString = "Augustus";
                    dagenString = "31 dagen";
                    break;
                case 9:
                    maandString = "September";
                    dagenString = "30 dagen";
                    break;
                case 10:
                    maandString = "Oktober";
                    dagenString = "31 dagen";
                    break;
                case 11:
                    maandString = "November";
                    dagenString = "30 dagen";
                    break;
                case 12:
                    maandString = "December";
                    dagenString = "31 dagen";
                    break;
                default:
                    maandString = "ERROR nummer niet beschikbaar";
            }
            repaint();
        }
    }

    class Tekstveldlistener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = tekstveldjaar.getText();
            jaar = Integer.parseInt(s2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0) {

                jaarString = "" + jaar + " is een schrikkeljaar";
            } else {

                jaarString = "" + jaar + " is geen schrikkeljaar";
            }
            repaint();

        }
    }


}
