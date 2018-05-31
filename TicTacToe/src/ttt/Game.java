package ttt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game {
    Position position = new Position();
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Java TTT");
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(3,3));
                final Game game = new Game();
                final JButton[] buttons = new JButton[9];
                for (int i = 0; i < 9; i++) {
                    final int idx = i;
                    final JButton button = new JButton();
                    buttons [i] = button;
                    button.setPreferredSize(new Dimension(100,100));
                    button.setBackground(Color.WHITE);
                    button.setOpaque(true);
                    button.setFont(new Font(null, Font.PLAIN, 100));
                    button.addMouseListener(new MouseListener() {


                        public void mouseClicked(MouseEvent e) {
                            button.setText("" + game.position.turn);
                            game.move(idx);
                            if (! game.position.gameEnd()) {
                                int best = game.position.bestMove();
                                buttons[best].setText("" + game.position.turn);
                                game.move(best);
                            }
                            if (game.position.gameEnd()) {
                                String message = "";
                                if (game.position.win('x')){
                                    message = "You won!";
                                } else if (game.position.win('o')) {
                                    message = "Computer won!";
                                } else {
                                    message = "Draw!";
                                }
                                JOptionPane.showMessageDialog(null, message);

                            }
                        }

                        public void mousePressed(MouseEvent e) {}
                        public void mouseReleased(MouseEvent e) {}
                        public void mouseEntered(MouseEvent e) {}
                        public void mouseExited(MouseEvent e) {}

                    });
                    frame.add(button);
                }
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    protected void move (int idx) {
        position = position.move(idx);
    }
}
