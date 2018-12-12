public class Score {

    private Integer value;

    public Score(int value) {
        this.value = value;
    }

    public Score(Score score) {
        this.value = new Integer(score.getValue());
    }

    public Integer getValue() {
        return new Integer(value);
    }

    public void update(int score){

        value += score;
    }
}
