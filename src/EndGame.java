import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EndGame extends JFrame {
    RockPaperScissors game = Game.game;
    static boolean end=true;
    JPanel Winner=new JPanel();
    JPanel menu= new JPanel();
    JPanel Score= new JPanel();
    JLabel You = new JLabel("You:  "+ game.won+ " wins");
    JLabel Comp = new JLabel("Computer:  "+ game.lost +" wins");
    JLabel winner= new JLabel();
    JButton close=new JButton("Close");
    JButton restart=new JButton("New Game");

    public EndGame() {
        Container cp=getContentPane();
        cp.setLayout(new GridLayout(3,1));
        menu.setBackground(new Color(138, 186, 238));
        Score.setBackground(new Color(138, 186, 238));
        Winner.setBackground(new Color(138, 186, 238));
        cp.add(Winner);
        cp.add(Score);
        cp.add(menu);

        Winner.add(winner);
        Winner.setLayout(new GridLayout(1,1));
        winner.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 25));
        winner.setHorizontalAlignment(JTextField.CENTER);
        if(game.lost> game.won) {
            winner.setText(" YOU LOOSE !!");
        }
        else if(game.lost< game.won){
            winner.setText(" YOU WIN !!");
        }
        else winner.setText(" Remis !!");

        Score.setLayout(new GridLayout(1,2));
        Score.add(You);
        Score.add(Comp);

        Comp.setHorizontalAlignment(JTextField.CENTER);
        You.setHorizontalAlignment(JTextField.CENTER);
        Comp.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));
        You.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 16));

        menu.setLayout(new GridLayout(2,2));
        menu.add(new JLabel());
        menu.add(new JLabel());
        menu.add(restart);
        restart.addActionListener(new Restart());
        menu.add(close);
        close.addActionListener(new Close());

    }

    class Restart implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            game.won=0;
            game.lost=0;
            Game.Scores.setText("");
            Game.RoundWinner.setText("");
            Game.Choice.setText("");
            setVisible(false);
            dispose();
        }
    }

    class Close implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Game.close();
            setVisible(false);
            dispose();
        }
    }

    public static void main(String[] args) {
        JFrame f = new EndGame();
        f.setSize(300, 230);
        f.setLocation(100, 100);
        f.setVisible(true);
    }
}
