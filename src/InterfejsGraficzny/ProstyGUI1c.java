package InterfejsGraficzny;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Esiu on 2017-09-21.
 */
public class ProstyGUI1c implements ActionListener{
    JFrame ramka;

    public static void main(String[] args) {
        ProstyGUI1c apGUI = new ProstyGUI1c();
        apGUI.doDziela();
    }

    public void doDziela() {
        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton przycisk = new JButton("ZMIANA KOLORU");
        przycisk.addActionListener(this);

        MojPanelRys panelRys = new MojPanelRys();
        ramka.getContentPane().add(BorderLayout.SOUTH,przycisk);
        ramka.getContentPane().add(BorderLayout.CENTER,panelRys);
        ramka.setSize(600,600);
        ramka.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        ramka.repaint();
    }

}
