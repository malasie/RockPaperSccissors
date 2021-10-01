import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Function for Ranking that will set text and it's color
// Icons for bottons and for computer's move
//End Game button!!!

public class Game extends JFrame {
    RockPaperScissors game=new RockPaperScissors();

    JButton Rock=new JButton("R");
    JButton Paper= new JButton("P");
    JButton Scissors= new JButton("S");
    JButton End=new JButton("End Game");
    JLabel Computer= new JLabel("Computer's move");
    JLabel RW= new JLabel("  Winner:");
    JLabel RoundWinner= new JLabel();
    JLabel S= new JLabel("  Score: ");
    JLabel Scores= new JLabel();
    JLabel Title= new JLabel("Rock Paper Scissors");
    JLabel Choice= new JLabel();
    JPanel Ranking = new JPanel();
    JPanel ComputerPanel= new JPanel();
    JPanel Info = new JPanel();
    JPanel PlayerPanel = new JPanel();
    JPanel Options=new JPanel();

    public Game(){
        Container cp= getContentPane();
        cp.setLayout(new GridLayout(5,1));
        cp.add(Title);
        Title.setHorizontalAlignment(JTextField.CENTER);
        Title.setFont(new Font("Bauhaus 93", Font.BOLD, 50));

        cp.add(ComputerPanel);
        ComputerPanel.setLayout(new GridLayout(1,3));
        ComputerPanel.add(new JLabel());
        ComputerPanel.add(Computer);
        Computer.setHorizontalAlignment(JTextField.CENTER);
        ComputerPanel.add(new JLabel());

        cp.add(Ranking);
        Ranking.setLayout(new GridLayout(2,2));
        Ranking.add(RW);
        RW.setHorizontalAlignment(JTextField.CENTER);
        RW.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 26));
        Ranking.add(RoundWinner);
        RoundWinner.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 27));
        Ranking.add(S);
        S.setHorizontalAlignment(JTextField.CENTER);
        S.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 23));
        Ranking.add(Scores);
        Scores.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));

        cp.add(PlayerPanel);
        PlayerPanel.setLayout(new GridLayout(1,3));
        PlayerPanel.add(Rock);
        Rock.addActionListener(new Rock_Move());
        PlayerPanel.add(Paper);
        Paper.addActionListener(new Paper_Move());
        PlayerPanel.add(Scissors);
        Scissors.addActionListener(new Scissors_Move());

        cp.add(Info);
        Info.setLayout(new GridLayout(4,1));
        Info.add(Choice);
        Choice.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
        Choice.setForeground(Color.BLUE);
        //Info.add(new JLabel(" Choose your move")).setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
        Info.add(new JLabel());
        Info.add(Options);
        Options.setLayout(new GridLayout(1,3));
        Options.add(new JLabel());
        Options.add(new JLabel());
        Options.add(End);

    }
    class Rock_Move implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            game.player=0;
            Choice.setText("Your choice: Rock");
            game.game();
            Computer.setText(game.computer_move);
            if (game.winner==0){
                    RoundWinner.setText("You Lost");
                    Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);}
            else if (game.winner==1){
                    RoundWinner.setText("Remis");
                    Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);}
            else{
                    RoundWinner.setText("You Won!");
                    Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);
            }
        }
    }
    class Paper_Move implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            game.player = 1;
            Choice.setText("Your choice: Paper");
            game.game();
            Computer.setText(game.computer_move);
            if (game.winner==0){
                RoundWinner.setText("You Lost");
                Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);}
            else if (game.winner==1){
                RoundWinner.setText("Remis");
                Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);}
            else{
                RoundWinner.setText("You Won!");
                Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);
            }
        }
    }
    class Scissors_Move implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            game.player = 2;
            Choice.setText("Your choice: Scissors");
            game.game();
            Computer.setText(game.computer_move);
            if (game.winner==0){
                RoundWinner.setText("You Lost");
                Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);}
            else if (game.winner==1){
                RoundWinner.setText("Remis");
                Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);}
            else{
                RoundWinner.setText("You Won!");
                Scores.setText("You : " + game.won + ", Computer :  "  + game.lost);
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new Game();
        f.setSize(600, 800);
        f.setLocation(100, 50);
        f.setVisible(true);
    }

}
