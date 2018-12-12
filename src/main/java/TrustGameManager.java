public class TrustGameManager {

    private Player player1;
    private Player player2;
    private final int TOTAL_MOVE = 5;

    public TrustGameManager(Player player1Name, Player player2Name) {
        player1 = player1Name;
        player2 = player2Name;
    }

    public Player getPlayer1() {
        return new Player(player1);
    }

    public Player getPlayer2() {
        return new Player(player2);
    }


    public void gameplay(){

        int moves = 0;

        while(moves < TOTAL_MOVE){

            recordMoves();
            moves++;
            System.out.println("----------------------");
            System.out.println("Current score: \nPlayer1: " + player1.getScoreValue() +" \nPlayer2: " + player2.getScoreValue());
            System.out.println("----------------------");

        }

        System.out.println(declareWinner());
    }

    public String declareWinner() {

        if(player1.getScoreValue() > player2.getScoreValue()) {
            return "Player 1 has won.";
        }
        if(player2.getScoreValue() > player1.getScoreValue()) {
            return "Player 2 has won.";
        }
        return "The game is tied!";
    }


    private void recordMoves(){

//        InputReader inputReader = new ConsoleInputReader();
//        System.out.println("Player 1:");
//        TrustGameInput player1Input = inputReader.readInput();
//        System.out.println("Player 2:");
//        TrustGameInput player2Input = inputReader.readInput();

        System.out.println("Player 1:");
        TrustGameInput player1Input = player1.getInput();
        System.out.println("Player 2:");
        TrustGameInput player2Input = player2.getInput();

        calculateMoveScore(player1Input, player2Input);

    }

    public void calculateMoveScore(TrustGameInput firstPlayerInput, TrustGameInput secondPlayerInput){

        player1.updateScore(ResultMap.resultMap.get(""+firstPlayerInput+secondPlayerInput).get(0));
        player2.updateScore(ResultMap.resultMap.get(""+firstPlayerInput+secondPlayerInput).get(1));
    }

    public static void main(String[] args) {
        Player player1 = new Player("p1",new Normal());
        Player player2 = new Player("p2",new Cheater());
        new TrustGameManager(player1,player2).gameplay();
    }
}
