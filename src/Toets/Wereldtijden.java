package Toets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wereldtijden extends Applet {

    TextField tekstveld;
    Label labeltijd;
    int tijd;
    String s, tijdstring, London, Tokyo, NewYork, Sydney;

    public void init() {

        tekstveld = new TextField("", 5);
        tekstveld.addActionListener(new Tekstveldlistener());
        add(tekstveld);
        labeltijd = new Label("Type een tijd in tot 24 uur!");
        tijdstring = " ";

    }

    public void paint(Graphics g) {
        g.drawString(tijdstring, 50, 60);
        g.drawString(London, 50, 80);
        g.drawString(Tokyo, 50, 100);
        g.drawString(NewYork, 50, 120);
        g.drawString(Sydney, 50, 140);
    }

    class Tekstveldlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstveld.getText();
            tijd = Integer.parseInt(s);
            switch (tijd) {
                case 0:
                tijdstring ="Amsterdam: 00:00 uur";
                London ="London: 23:00 uur";
                Tokyo ="Tokyo: 07:00 uur";
                NewYork ="New York 18:00 uur";
                Sydney ="Sydney 09:00 uur";
                break;

                case 1:
                    tijdstring = "Amsterdam: 01:00 uur";
                    London = "London: 00:00 uur";
                    Tokyo = "Tokyo: 08:00 uur";
                    NewYork = "New York 19:00 uur";
                    Sydney = "Sydney 10:00 uur";
                    break;

                case 2:
                    tijdstring = "Amsterdam: 02:00 uur";
                    London = "London: 01:00 uur";
                    Tokyo = "Tokyo: 09:00 uur";
                    NewYork = "New York 20:00 uur";
                    Sydney = "Sydney 11:00 uur";
                    break;

                case 3:
                    tijdstring = "Amsterdam: 03:00 uur";
                    London = "London: 03:00 uur";
                    Tokyo = "Tokyo: 10:00 uur";
                    NewYork = "New York 21:00 uur";
                    Sydney = "Sydney 12:00 uur";
                    break;

                case 4:
                    tijdstring = "Amsterdam: 04:00 uur";
                    London = "London: 03:00 uur";
                    Tokyo = "Tokyo: 11:00 uur";
                    NewYork = "New York 22:00 uur";
                    Sydney = "Sydney 13:00 uur";
                    break;

                case 5:
                    tijdstring = "Amsterdam: 05:00 uur";
                    London = "London: 04:00 uur";
                    Tokyo = "Tokyo: 12:00 uur";
                    NewYork = "New York 23:00 uur";
                    Sydney = "Sydney 14:00 uur";
                    break;
                case 6:
                    tijdstring = "Amsterdam: 06:00 uur";
                    London = "London: 05:00 uur";
                    Tokyo = "Tokyo: 13:00 uur";
                    NewYork = "New York 00:00 uur";
                    Sydney = "Sydney 15:00 uur";
                    break;
                case 7:
                    tijdstring = "Amsterdam: 07:00 uur";
                    London = "London: 06:00 uur";
                    Tokyo = "Tokyo: 14:00 uur";
                    NewYork = "New York 01:00 uur";
                    Sydney = "Sydney 16:00 uur";
                    break;

                case 8:
                    tijdstring = "Amsterdam: 08:00 uur";
                    London = "London: 07:00 uur";
                    Tokyo = "Tokyo: 15:00 uur";
                    NewYork = "New York 02:00 uur";
                    Sydney = "Sydney 17:00 uur";
                    break;

                case 9:
                    tijdstring = "Amsterdam: 09:00 uur";
                    London = "London: 08:00 uur";
                    Tokyo = "Tokyo: 16:00 uur";
                    NewYork = "New York 03:00 uur";
                    Sydney = "Sydney 18:00 uur";
                    break;

                case 10:
                    tijdstring = "Amsterdam: 10:00 uur";
                    London = "London: 09:00 uur";
                    Tokyo = "Tokyo: 17:00 uur";
                    NewYork = "New York 04:00 uur";
                    Sydney = "Sydney 19:00 uur";
                    break;

                case 11:
                    tijdstring = "Amsterdam: 11:00 uur";
                    London = "London: 10:00 uur";
                    Tokyo = "Tokyo: 19:00 uur";
                    NewYork = "New York 05:00 uur";
                    Sydney = "Sydney 20:00 uur";
                    break;

                case 12:
                    tijdstring = "Amsterdam: 12:00 uur";
                    London = "London: 11:00 uur";
                    Tokyo = "Tokyo: 19:00 uur";
                    NewYork = "New York 06:00 uur";
                    Sydney = "Sydney 21:00 uur";
                    break;

                case 13:
                    tijdstring = "Amsterdam: 13:00 uur";
                    London = "London: 12:00 uur";
                    Tokyo = "Tokyo: 20:00 uur";
                    NewYork = "New York 07:00 uur";
                    Sydney = "Sydney 22:00 uur";
                    break;

                case 14:
                    tijdstring = "Amsterdam: 14:00 uur";
                    London = "London: 13:00 uur";
                    Tokyo = "Tokyo: 21:00 uur";
                    NewYork = "New York 08:00 uur";
                    Sydney = "Sydney 23:00 uur";
                    break;

                case 15:
                    tijdstring = "Amsterdam: 15:00 uur";
                    London = "London: 14:00 uur";
                    Tokyo = "Tokyo: 22:00 uur";
                    NewYork = "New York 09:00 uur";
                    Sydney = "Sydney 00:00 uur";
                    break;

                case 16:
                    tijdstring = "Amsterdam: 16:00 uur";
                    London = "London: 15:00 uur";
                    Tokyo = "Tokyo: 23:00 uur";
                    NewYork = "New York 10:00 uur";
                    Sydney = "Sydney 01:00 uur";
                    break;

                case 17:
                    tijdstring = "Amsterdam: 17:00 uur";
                    London = "London: 16:00 uur";
                    Tokyo = "Tokyo: 00:00 uur";
                    NewYork = "New York 11:00 uur";
                    Sydney = "Sydney 02:00 uur";
                    break;

                case 18:
                    tijdstring = "Amsterdam: 18:00 uur";
                    London = "London: 17:00 uur";
                    Tokyo = "Tokyo: 01:00 uur";
                    NewYork = "New York 12:00 uur";
                    Sydney = "Sydney 03:00 uur";
                    break;

                case 19:
                    tijdstring = "Amsterdam: 19:00 uur";
                    London = "London: 18:00 uur";
                    Tokyo = "Tokyo: 02:00 uur";
                    NewYork = "New York 13:00 uur";
                    Sydney = "Sydney 04:00 uur";
                    break;

                case 20:
                    tijdstring = "Amsterdam: 20:00 uur";
                    London = "London: 19:00 uur";
                    Tokyo = "Tokyo: 03:00 uur";
                    NewYork = "New York 14:00 uur";
                    Sydney = "Sydney 05:00 uur";
                    break;

                case 21:
                    tijdstring = "Amsterdam: 21:00 uur";
                    London = "London: 20:00 uur";
                    Tokyo = "Tokyo: 04:00 uur";
                    NewYork = "New York 15:00 uur";
                    Sydney = "Sydney 06:00 uur";
                    break;

                case 22:
                    tijdstring = "Amsterdam: 22:00 uur";
                    London = "London: 21:00 uur";
                    Tokyo = "Tokyo: 05:00 uur";
                    NewYork = "New York 16:00 uur";
                    Sydney = "Sydney 07:00 uur";
                    break;

                case 23:
                    tijdstring = "Amsterdam: 23:00 uur";
                    London = "London: 22:00 uur";
                    Tokyo = "Tokyo: 06:00 uur";
                    NewYork = "New York 17:00 uur";
                    Sydney = "Sydney 08:00 uur";
                    break;

                case 24:
                    tijdstring = "Amsterdam: 00:00 uur";
                    London = "London: 23:00 uur";
                    Tokyo = "Tokyo: 07:00 uur";
                    NewYork = "New York 18:00 uur";
                    Sydney = "Sydney 09:00 uur";
                    break;

                default: tijdstring="Vul ALLEEN UREN in !!!";
            }
            repaint();
        }

    }
}