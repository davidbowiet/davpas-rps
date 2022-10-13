package games;

public class Player {

    int score;
     private String name;

    //constructor
    public Player(String name, int score){
        this.name = name;
        this.score = score;

    }

    private String getName(){
        return name;
    }

    public void rageQuit(){
        System.exit(0);

    }

}
