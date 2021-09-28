import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
    int player;
    String computer_move;
    int lost=0;
    int won=0;
    int winner; //you lost= 0; remis=1; you won=2;
    Random rand= new Random();
    // 0 - rock; 1-paper; 2-scissors
    void game(){
        int computer= rand.nextInt(3);
        switch (computer) {
            case 0:
                computer_move = "Rock";
            case 1:
                computer_move = "Paper";
            case 2:
                computer_move = "Scissors";
        }
        if (computer==player){
            winner=1;
        }
        else if (player-computer==1 || player-computer==-2){
            won++;
            winner=2;
        }
        else {
            lost++;
            winner=0;
        }

    }
}
