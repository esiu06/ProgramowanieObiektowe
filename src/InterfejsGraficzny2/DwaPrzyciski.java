package InterfejsGraficzny2;

import InterfejsGraficzny.MojPanelRys;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Esiu on 2017-09-22.
 */
public class DwaPrzyciski {
    JFrame ramka;
    JLabel etykieta;

    public static void main(String[] args) {
        DwaPrzyciski gui = new DwaPrzyciski();
        gui.doRoboty();
    }

    private void doRoboty() {
        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton przyciskKoloru = new JButton("Zmień kolor");
        przyciskKoloru.addActionListener(new KolorListener());

        JButton przyciskEtyk = new JButton("Zmień etykietę");
        przyciskEtyk.addActionListener(new EtykietaListener());

        etykieta = new JLabel("Oto Etykieta");
        MojPanelRys panelRys = new MojPanelRys();

        ramka.getContentPane().add(BorderLayout.SOUTH,przyciskKoloru);
        ramka.getContentPane().add(BorderLayout.CENTER,panelRys);
        ramka.getContentPane().add(BorderLayout.EAST,przyciskEtyk);
        ramka.getContentPane().add(BorderLayout.WEST,etykieta);

        ramka.setSize(600,400);
        ramka.setVisible(true);

    }
    public class KolorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent zdarzenie) {
            ramka.repaint();
        }
    }
    public class EtykietaListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            etykieta.setText("Auuuuuuua!!!");
        }
    }
}
