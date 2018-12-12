import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void shouldUpdateScore(){
        //given
        Player player1 = new Player("Player1",new Normal());
        //when
        player1.updateScore(2);
        //then
        Assert.assertEquals(Integer.valueOf(2),player1.getScoreValue());

    }
}
