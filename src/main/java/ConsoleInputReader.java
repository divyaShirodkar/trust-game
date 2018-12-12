import java.util.Scanner;

public class ConsoleInputReader implements InputReader{

    public TrustGameInput readInput(){
        int input = 0;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice. \n 1 for Cooperate \n 2 for Cheat");

            input = Integer.parseInt(scanner.nextLine());

        }finally {

        }

        if (input == 1)
            return TrustGameInput.COOPERATE;

        if (input == 2)
            return TrustGameInput.CHEAT;
        System.out.println("You've entered something other than 1 and 2. Please try again!");

        return readInput();
    }

}
