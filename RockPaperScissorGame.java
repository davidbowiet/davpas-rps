package games;
import java.util.Scanner;

public class RockPaperScissorGame {

    Player player;

    Fist aifist;

    RockPaperScissorGame(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aifist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissorGame game = new RockPaperScissorGame("", 0);
        game.playGame();
    }
    int score, aiscore;

    void playGame() {
        Scanner scanner = new Scanner(System.in);
        int val = 4;
        while (val > 3) {
            System.out.println("Rock(1), Paper(2) or Scissors(3)?");
            val = scanner.nextInt();
        }
        int fist = aifist.play();


        if (val == fist) {
            System.out.println("You chose the same. Its a tie!");
        }


        if (val == 2 & fist == 1) {
            score += +1;
            System.out.println("You chose Paper. Ai chose Rock. you win!");
        }
        if (val == 3 & fist == 1) {
            aiscore += +1;
            System.out.println("You chose Scissor. Ai chose Rock. You lose!");
        }


        if (val == 1 & fist == 2) {
            aiscore += +1;
            System.out.println("You chose Rock. Ai chose Paper. You lose!");
        }
        if (val == 3 & fist == 2) {
            score += +1;
            System.out.println("You chose Scissor. Ai chose Paper. You win!");
        }


        if (val == 1 & fist == 3) {
            score += +1;
            System.out.println("You chose Rock. Ai chose Scissor. You win!");
        }
        if (val == 2 & fist == 3) {
            aiscore += +1;
            System.out.println("You chose Paper. Ai chose Scissor. You lose!");
        }
        System.out.println("Du fick " + score + " poäng. Datorn fick " + aiscore + " poäng!");



    }
}


