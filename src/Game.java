import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    RockPaperScissors game=new RockPaperScissors();

    JButton Rock=new JButton("R");
    JButton Paper= new JButton("P");
    JButton Scissors= new JButton("S");
    JButton End=new JButton("End Game");
    JLabel Computer= new JLabel("Computer's move");
    JLabel RoundWinner= new JLabel("Winner");
    JLabel Scores= new JLabel("Score");
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

        cp.add(ComputerPanel);
        ComputerPanel.setLayout(new GridLayout(1,3));
        ComputerPanel.add(new JLabel());
        ComputerPanel.add(Computer);

        cp.add(Ranking);
        Ranking.setLayout(new GridLayout(2,1));
        Ranking.add(RoundWinner);
        Ranking.add(Scores);

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
        Info.add(new JLabel("Choose your move"));
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
                    Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);}
            else if (game.winner==1){
                    RoundWinner.setText("Remis");
                    Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);}
            else{
                    RoundWinner.setText("You Won!");
                    Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);
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
                Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);}
            else if (game.winner==1){
                RoundWinner.setText("Remis");
                Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);}
            else{
                RoundWinner.setText("You Won!");
                Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);
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
                Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);}
            else if (game.winner==1){
                RoundWinner.setText("Remis");
                Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);}
            else{
                RoundWinner.setText("You Won!");
                Scores.setText(" Score:\nYou : Computer \n " + game.won + ":" + game.lost);
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
