package snakeGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            //norime leisti gyvatei judeti tik 90 laipsniu posukiais, kad nebutu 180
            //Jeigu kai spaudziam i kaire, gyvates judejimo kryptis nera desine, leidziam judet
            if (GamePanel.direction != 'R') {
                GamePanel.direction = 'L';
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (GamePanel.direction != 'L') {
                GamePanel.direction = 'R';
            }
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (GamePanel.direction != 'D') {
                GamePanel.direction = 'U';
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (GamePanel.direction != 'U') {
                GamePanel.direction = 'D';
            }
        }
    }
}
