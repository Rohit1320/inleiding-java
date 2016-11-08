package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PraktijkOpdrH10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een cijfer");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                    tekst = "Deze is zeer slecht";
                    break;
                case 2:
                    tekst = "Deze is ook slecht";
                    break;
                case 3:
                    tekst = "Deze is net zo slecht";
                    break;
                case 4:
                    tekst = "Dit is iets beter maar wel een onvoldoende";
                    break;
                case 5:
                    tekst = "Matig dus het kan veel beter";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "is wel netjes dus een dikke voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Je ging voor de tien maar je was niet goed genoeg maar je hebt een GOED";
                    break;
                case 10:
                    tekst = "Je hebt zeker afgekeken maar ik geef je wel die GOED!";
                    break;
                default:
                    tekst = "U hebt een verkeerd cijfer ingetikt!";
                    break;
            }
            repaint();
        }
    }
}
