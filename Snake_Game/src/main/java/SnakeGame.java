import javax.swing.*;

/*
 * @Amresh Tripathy
 */

public class SnakeGame extends JFrame {
    Board board;

    SnakeGame() {
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setTitle("Snake Game");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // intialize Snake Game

        new SnakeGame();
    }
}
