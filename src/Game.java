import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    RockPaperScissors game=new RockPaperScissors();

    JButton Rock=new JButton("R");
    JButton Paper= new JButton("P");
    JButton Scissors= new JButton("S");
    JButton End=new JButton("End Game");
    JLabel Computer= new JLabel();
    JLabel Scores= new JLabel();
    JPanel Ranking = new JPanel();
    JPanel ComputerPanel= new JPanel();
    JPanel Info = new JPanel();
    JPanel PlayerPanel = new JPanel();
    JPanel Options=new JPanel();

    public Game(){
        Container cp= getContentPane();
        cp.setLayout(new GridLayout(5,1));

        cp.add(ComputerPanel);
        ComputerPanel.setLayout(new GridLayout(1,3));
        ComputerPanel.add(new JLabel());
        ComputerPanel.add(Computer);

        cp.add(Ranking);
        Ranking.setLayout(new GridLayout(2,1));
        Ranking.add(Scores);

        cp.add(PlayerPanel);
        PlayerPanel.setLayout(new GridLayout(1,3));
        PlayerPanel.add(Rock);
        PlayerPanel.add(Paper);
        PlayerPanel.add(Scissors);

        cp.add(Info);
        Info.setLayout(new GridLayout(4,1));
        Info.add(new JLabel("Your choice:"));
        Info.add(new JLabel("Choose your move"));
        Info.add(new JLabel());
        Info.add(Options);
        Options.setLayout(new GridLayout(1,3));
        Options.add(new JLabel());
        Options.add(new JLabel());
        Options.add(End);



    }
}
