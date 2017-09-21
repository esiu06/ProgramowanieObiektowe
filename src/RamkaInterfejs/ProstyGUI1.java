package RamkaInterfejs;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ProstyGUI1 implements ActionListener {
        JButton przycisk;

        public static void main(String[] args) {
           ProstyGUI1 apGUI = new ProstyGUI1();
            apGUI.doDziela();
        }
        private void doDziela() {
            JFrame ramka = new JFrame();
            przycisk = new JButton("KLIKNIJ");

            przycisk.addActionListener(this);

            ramka.getContentPane().add(przycisk);
            ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ramka.setSize(600,200);
            ramka.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent zdarzenie) {
            przycisk.setText("ZOSTAŁEM KLIKNIĘTY");

        }

    }

