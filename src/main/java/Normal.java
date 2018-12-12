public class Normal implements PlayerBehavior{

    private InputReader inputReader;

    public Normal() {
        this.inputReader = new ConsoleInputReader();
    }

    @Override
    public TrustGameInput getInput() {
        return inputReader.readInput();
    }
}
