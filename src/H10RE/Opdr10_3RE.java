package H10RE;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr10_3RE  extends Applet{

    TextField tekstveld;
    Label labelmaand;
    int maand;
    String s, maandString, dagenString;

    public void init() {

        tekstveld = new TextField("", 5);
        tekstveld.addActionListener(new Tekstveldlistener());
        labelmaand = new Label("Type een maand in om erachter te komen hoeveel dagen erin zitten.");
        maandString = "";
        dagenString = "";
        add(tekstveld);
    }

    public void paint(Graphics g) {
        g.drawString(maandString, 50, 100);
        g.drawString(dagenString, 50, 120);

    }

    class Tekstveldlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstveld.getText();
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
}