public class Player {

    private String name;


    private Score score;

    private PlayerBehavior behavior;


    Player(String name,PlayerBehavior behavior) {
        this.name = name;
        this.score = new Score(0);
        this.behavior = behavior;

    }

    public Player(Player player1) {
        this.name = player1.name;
        this.score = new Score(player1.score);
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public Score getScore() {
        return score;
    }

    public Integer getScoreValue() {
        return score.getValue();
    }


    public void updateScore(Integer score){
        this.score.update(score);
    }


    public TrustGameInput getInput() {
       return behavior.getInput();
    }
}
