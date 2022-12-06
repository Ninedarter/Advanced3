package snakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {


    int EKRANO_PLOTIS = 600;
    int EKRANO_AUKSTIS = 600;
    int KVADRATELIO_DYDIS = 25; // kuo sis skaicius didesnis, tuo maziau langliu gausis
    int ZAIDIMU_KVADRATELIAI = (EKRANO_PLOTIS * EKRANO_AUKSTIS) / KVADRATELIO_DYDIS;
    int DELAY = 75; // kuo didesnis skaicius, tuo letesnis zaidimas

    int x[] = new int[ZAIDIMU_KVADRATELIAI]; //x koorditanes
    int y[] = new int[ZAIDIMU_KVADRATELIAI]; // y koordinates
    int bodyParts = 6;
    int applesEaten;
    int appleCoordinateX;
    int appleCoordinateY;
    public static char direction = 'R'; // dar turesime U L D
    boolean running = false;
    Timer timer;
    Random random;

    public GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(EKRANO_PLOTIS, EKRANO_AUKSTIS));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void createApple() {

        appleCoordinateX = random.nextInt(EKRANO_PLOTIS / KVADRATELIO_DYDIS) * KVADRATELIO_DYDIS;
        appleCoordinateX = random.nextInt(EKRANO_AUKSTIS / KVADRATELIO_DYDIS) * KVADRATELIO_DYDIS;

    }

    public void startGame() {
        createApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g) {

        for (int i = 0; i < EKRANO_AUKSTIS / KVADRATELIO_DYDIS; i++) {
            g.setColor(Color.green);
            g.drawLine(i * KVADRATELIO_DYDIS, 0, i * KVADRATELIO_DYDIS, EKRANO_AUKSTIS);
            g.drawLine(0, i * KVADRATELIO_DYDIS, EKRANO_PLOTIS, i * KVADRATELIO_DYDIS);
        }

        g.setColor(Color.red);
        g.fillOval(appleCoordinateX, appleCoordinateY, KVADRATELIO_DYDIS, KVADRATELIO_DYDIS);

        for (int i = 0; i < bodyParts; i++) {
            //gyvates galva
            if (i == 0) {
                g.setColor(Color.blue);
                g.fillRect(x[i], y[i], KVADRATELIO_DYDIS, KVADRATELIO_DYDIS);
            } else {
                //ne galva , o kunas
                g.setColor(new Color(57, 40, 255));
                g.fillRect(x[i], y[i], KVADRATELIO_DYDIS, KVADRATELIO_DYDIS);
            }
        }
    }

    public void move() {
        //shift body parts of snake
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        if (direction == 'U') {
            //gyvates galvos koordinate
            y[0] = y[0] - KVADRATELIO_DYDIS;
        } else if (direction == 'D') {
            y[0] = y[0] + KVADRATELIO_DYDIS;
        } else if (direction == 'L') {
            x[0] = x[0] - KVADRATELIO_DYDIS;
        } else if (direction == 'R') {
            x[0] = x[0] + KVADRATELIO_DYDIS;
        }


    }

    public void checkCollision() {

    }

    public void checkApple() {
        if((x[0] == appleCoordinateX) && (y[0]) == appleCoordinateY ){
            bodyParts++;
            applesEaten++;
            createApple();
            checkApple();
        }
    }

    public void gameOver(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
        }
        repaint();
    }
}
