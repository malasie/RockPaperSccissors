import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    RockPaperScissors game=new RockPaperScissors();

    JButton Rock=new JButton();
    JButton Paper= new JButton();
    JButton Scissors= new JButton();
    JButton End=new JButton("End Game");
    JLabel Computer= new JLabel();
    JLabel Scores= new JLabel();
    JPanel ComputerPanel= new JPanel();
    JPanel PlayerPanel = new JPanel();
    JPanel Options=new JPanel();

    public Game(){
        Container cp= getContentPane();


    }
}
