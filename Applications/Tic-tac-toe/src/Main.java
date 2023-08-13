
public class Main {

	public static void main(String[] args) {
		Game tictactoe = new Game();
		tictactoe.initializeGame();
		System.out.println("game winner is: " + tictactoe.play());

	}

}
