import org.junit.Assert;
import org.junit.Test;

public class CheaterPlayerTest {

    @Test
    public void testCheaterInput()
    {
        Player player1 = new Player("Player1",new Cheater());
        //when
        TrustGameInput cheaterInput = player1.getInput();
        //then
        Assert.assertEquals(TrustGameInput.CHEAT,cheaterInput);


    }
}
