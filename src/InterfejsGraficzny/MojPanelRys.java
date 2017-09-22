package InterfejsGraficzny;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Esiu on 2017-09-21.
 *
 */
import javax.swing.*;
public class MojPanelRys extends JPanel{

        public void paintComponent (Graphics zdarzenie){

            int czerwony = (int) (Math.random() * 256);
            int zielony = (int) (Math.random() * 256);
            int nienieski = (int) (Math.random() * 256);
            Color kolorLosowy = new Color(czerwony,zielony,nienieski);
            zdarzenie.setColor(kolorLosowy);
            zdarzenie.fillOval(140, 120, 150, 150);
        }
    }

