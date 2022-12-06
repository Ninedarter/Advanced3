package snakeGame;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame represends a windom.(Framed) top level window of the game
 */

public class GameFrame extends JFrame {

    public GameFrame() throws HeadlessException {
        GamePanel panel = new GamePanel();
        this.add(panel); // i zaidimo "rema" pridedu savo panel
        this.setTitle("Snake game"); // UZDEDU TITLE
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // NUSTATAU,KAD PASPAUDUS X PROGRAMA SUSTOTU
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); // iscentruoja musu aplikacijos lenga




    }
}
