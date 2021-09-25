import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
    int player;
    int lost=0;
    int won=0;
    Random rand= new Random();
    // 0 - rock; 1-paper; 2-scissors
    void game(int player){
        int computer= rand.nextInt(3);
        if (computer==player){
            System.out.println("REMIS");
            System.out.println(" Score:\nYou : Computer \n "+won+":"+lost);
        }
        else if (player-computer==1 || player-computer==-2){
            System.out.println("YOU WON!");
            won++;
            System.out.println(" Score:\nYou : Computer \n "+won+":"+lost);
        }
        else {
            System.out.println("YOU LOST");
            lost++;
            System.out.println(" Score:\nYou : Computer \n "+won+":"+lost);
        }

    }

    public static void main(String[] a){
        RockPaperScissors r=new RockPaperScissors();
        r.game(2);
        r.game(1);
        r.game(2);
        r.game(0);
    }
}
