package ProstaAnimacja;

import InterfejsGraficzny.MojPanelRys;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Esiu on 2017-09-22.
 */
public class ProstaAnimacja {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        ProstaAnimacja gui = new ProstaAnimacja();
        gui.doRoboty();
    }

    private void doRoboty() {
        JFrame ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MojPanelRys panel = new MojPanelRys();

        ramka.getContentPane().add(panel);
        ramka.setSize(300, 300);
        ramka.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            panel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
        for (int i = 0; i < 200; i++) {
            x--;
            y--;
            panel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }
    public class MojPanelRys extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,getWidth(),getHeight());
            g.setColor(Color.blue);
            g.fillOval(x,y,50,50);
        }
    }
}
