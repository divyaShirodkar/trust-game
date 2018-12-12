import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {

    @Test
    public void testUpdateScore(){
        Score score = new Score(0);
        score.update(-1);
        Assert.assertEquals(Integer.valueOf(-1),score.getValue());
    }



}

