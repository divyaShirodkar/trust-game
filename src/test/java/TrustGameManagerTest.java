import org.junit.Assert;
import org.junit.Test;

public class TrustGameManagerTest {

    @Test
    public void shouldHaveTwoPlayers(){
        TrustGameManager trustGameManager = new TrustGameManager(new Player("p1",new Normal()),new Player("p2",new Normal()));

        Player player1 = trustGameManager.getPlayer1();
        Player player2 = trustGameManager.getPlayer2();

        Assert.assertNotNull(player1);
        Assert.assertNotNull(player2);

    }

    @Test
    public void shouldUpdatePlayer()
    {
        Player player1 = new Player("p1",new Normal());
        Player player2 = new Player("p2",new Normal());

        player1.updateScore(3);
        player2.updateScore(-1);

        TrustGameManager trustGameManager = new TrustGameManager(player1,player2);

        Player retrievedPlayer1 = trustGameManager.getPlayer1();
        Player retrievedPlayer2 = trustGameManager.getPlayer2();

        Assert.assertEquals(Integer.valueOf(3),retrievedPlayer1.getScoreValue());
        Assert.assertEquals(Integer.valueOf(-1),retrievedPlayer2.getScoreValue());
        Assert.assertEquals("p1",retrievedPlayer1.getName());
        Assert.assertEquals("p2",retrievedPlayer2.getName());


    }

    
    @Test 
    public void shouldCalculateCorrectScore(){
        Player player1 = new Player("p1",new Normal());
        Player player2 = new Player("p2",new Normal());

        TrustGameManager trustGameManager = new TrustGameManager(player1,player2);
        
        trustGameManager.calculateMoveScore(TrustGameInput.COOPERATE, TrustGameInput.CHEAT);

        Player retrievedPlayer1 = trustGameManager.getPlayer1();
        Player retrievedPlayer2 = trustGameManager.getPlayer2();

        Assert.assertEquals(Integer.valueOf(-1), retrievedPlayer1.getScoreValue());
        Assert.assertEquals(Integer.valueOf(3), retrievedPlayer2.getScoreValue());
    }

    @Test
    public void declareP2WinnerTest(){

        Player player1 = new Player("p1",new Normal());
        Player player2 = new Player("p2",new Normal());

        player1.updateScore(3);
        player2.updateScore(5);

        TrustGameManager trustGameManager = new TrustGameManager(player1,player2);

        Assert.assertEquals("Player 2 has won.",trustGameManager.declareWinner());
    }
    @Test
    public void declareP1WinnerTest(){

        Player player1 = new Player("p1",new Normal());
        Player player2 = new Player("p2",new Normal());

        player1.updateScore(6);
        player2.updateScore(5);

        TrustGameManager trustGameManager = new TrustGameManager(player1,player2);

        Assert.assertEquals("Player 1 has won.",trustGameManager.declareWinner());

    }

    @Test
    public void declareWinnerTest(){

        Player player1 = new Player("p1",new Normal());
        Player player2 = new Player("p2",new Normal());

        player1.updateScore(3);
        player2.updateScore(3);

        TrustGameManager trustGameManager = new TrustGameManager(player1,player2);

        Assert.assertEquals("The game is tied!",trustGameManager.declareWinner());
    }
}
