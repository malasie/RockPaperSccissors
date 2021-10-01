import java.util.Random;

public class RockPaperScissors {
    int player;
    String computer_move;
    int lost=0;
    int won=0;
    int winner; //you lost= 0; remis=1; you won=2;

    // 0 - rock; 1-paper; 2-scissors
    void game(){
        Random rand= new Random();
        int computer= rand.nextInt(3);
        if (computer==0) {
            computer_move = "Rock";
        }
        else if (computer==1) {
            computer_move = "Paper";
        }
        else
            computer_move= "Scissors";

        if (computer==player){
            winner=1;
        }
        else if (player-computer==1 || player-computer==-2){
            winner=2;
            won++;
        }
        else {
            winner=0;
            lost++;
        }

    }
}
