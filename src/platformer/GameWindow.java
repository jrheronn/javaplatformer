package platformer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame implements ActionListener {

    private Timer timer;
    private int playerX, playerY; // Player's position

    public GameWindow() {
        setTitle("Game Title");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        timer = new Timer(10, this);
        timer.start();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Update game logic here
        repaint(); // Repaint the game window
    }

    public void paint(Graphics g) {
        // Draw game objects and graphics here
        g.setColor(Color.blue);
        g.fillRect(playerX, playerY, 50, 50);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
