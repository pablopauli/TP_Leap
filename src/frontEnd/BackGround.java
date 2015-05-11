package frontEnd;

import entities.Directories;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class BackGround extends JPanel {

    /**
         * Construct a BackGround
         */
        public BackGround(){
                setOpaque(false);
                setLayout(null);
        }

    /**
         * Draws the BackGround Image, taken from the resources folder
         */
        public void paint(Graphics g){
                Image imagen = Toolkit.getDefaultToolkit().getImage(Directories.resources + "dungeonDoor.png");
                g.drawImage(imagen, 0, 0, getSize().width, getSize().height, this);
                super.paint(g );
        }

}