package H08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

public class PraktijkOpdrH08 extends Applet {
    TextField imput1;
    TextField imput2;
    Button KeerKnop;
    Button DeelKnop;
    Button PlusKnop;
    Button MinKnop;

    Double Getal1;
    Double Getal2;


    @Override
    public void init() {
        super.init();

        imput1 = new TextField("", 20);
        add(imput1);

        imput2 = new TextField("", 20);
        add(imput2);

        KeerKnop = new Button("X");
        KeerKnopListener keerKnopListener = new KeerKnopListener();
        KeerKnop.addActionListener(keerKnopListener);
        add(KeerKnop);

        DeelKnop = new Button("/");
        Deelknoplistener deelknoplistener = new Deelknoplistener();
        DeelKnop.addActionListener(deelknoplistener);
        add(DeelKnop);

        PlusKnop = new Button("+");
        Plusknoplistener plusknoplistener = new Plusknoplistener();
        PlusKnop.addActionListener(plusknoplistener);
        add(PlusKnop);

        MinKnop = new Button("-");
        Minknoplistener minknoplistener = new Minknoplistener();
        MinKnop.addActionListener(minknoplistener);
        add(MinKnop);
    }


    class KeerKnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstKeer = Getal1 * Getal2;
            imput1.setText("" + uitkomstKeer);
            imput2.setText(" ");
        }
    }

    class Deelknoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstDeel = Getal1 / Getal2;
            imput1.setText("" + uitkomstDeel);
            imput2.setText(" ");
        }


    }
    class Plusknoplistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String arg1 = imput1.getText();
            Getal1 = Double.parseDouble(arg1);

            String arg2 = imput2.getText();
            Getal2 = Double.parseDouble(arg2);

            Double uitkomstPlus = Getal1 + Getal2;
            imput1.setText("" + uitkomstPlus);
            imput2.setText(" ");
        }


    }

    class Minknoplistener implements ActionListener{

       public void actionPerformed(ActionEvent e) {
           String arg1 = imput1.getText();
           Getal1= Double.parseDouble(arg1);

           String arg2 = imput2.getText();
           Getal2 = Double.parseDouble(arg2);

           Double uitkomstMin = Getal1 - Getal2;
           imput1.setText("" + uitkomstMin);
           imput2.setText(" ");

       }
    }

}
