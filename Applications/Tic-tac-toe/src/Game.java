
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.personal.model.Board;
import com.personal.model.FreeCell;
import com.personal.model.PieceO;
import com.personal.model.PieceType;
import com.personal.model.PieceX;
import com.personal.model.Player;
import com.personal.model.PlayingPiece;
import com.personal.model.TicTactoeBoard;

public class Game {

	private Board ticTactoeBoard;
	private Deque<Player> players;

	public void initializeGame() {
		players = new LinkedList<>();

		PlayingPiece crossPiece = new PieceX();
		Player p1 = new Player("Player 1", crossPiece);

		PlayingPiece oPiece = new PieceO();
		Player p2 = new Player("Player 2", oPiece);

		players.add(p1);
		players.add(p2);

		ticTactoeBoard = new TicTactoeBoard(3);
	}

	public String play() {
		boolean win = false;

		while (!win) {
			Player playerTurn = players.remove();

			List<FreeCell> freeSpaces = ticTactoeBoard.getFreeCells();
			if (freeSpaces.isEmpty()) {
				win = false;
				continue;
			}

			ticTactoeBoard.displayBoard();
			// read the user input
			System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
			Scanner inputScanner = new Scanner(System.in);
			String s = inputScanner.nextLine();
			String[] values = s.split(",");
			int inputRow = Integer.valueOf(values[0]);
			int inputColumn = Integer.valueOf(values[1]);

			// Add piece to board
			boolean pieceAddedSuccessfully = ticTactoeBoard.addPiece(inputRow, inputColumn,
					playerTurn.getPlayingPiece());

			if (!pieceAddedSuccessfully) {
				System.out.println("Incorret possition chosen, try again");
				players.addFirst(playerTurn);
				continue;
			}

			players.addLast(playerTurn);

			boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().pieceType);
			if (winner) {
				return playerTurn.getName();
			}

		}
		return "tie";
	}

	public boolean isThereWinner(int row, int column, PieceType pieceType) {
		boolean rowMatch = true;
		boolean columnMatch = true;
		boolean diagonalMatch = true;
		boolean antiDiagonalMatch = true;

		// need to check in row
		for (int i = 0; i < ticTactoeBoard.getSize(); i++) {

			if (ticTactoeBoard.getBoard()[row][i] == null || ticTactoeBoard.getBoard()[row][i].pieceType != pieceType) {
				rowMatch = false;
			}
		}

		// need to check in column
		for (int i = 0; i < ticTactoeBoard.getSize(); i++) {

			if (ticTactoeBoard.getBoard()[i][column] == null
					|| ticTactoeBoard.getBoard()[i][column].pieceType != pieceType) {
				columnMatch = false;
			}
		}

		// need to check diagonals
		for (int i = 0, j = 0; i < ticTactoeBoard.getSize(); i++, j++) {
			if (ticTactoeBoard.getBoard()[i][j] == null || ticTactoeBoard.getBoard()[i][j].pieceType != pieceType) {
				diagonalMatch = false;
			}
		}

		// need to check anti-diagonals
		for (int i = 0, j = ticTactoeBoard.getSize() - 1; i < ticTactoeBoard.getSize(); i++, j--) {
			if (ticTactoeBoard.getBoard()[i][j] == null || ticTactoeBoard.getBoard()[i][j].pieceType != pieceType) {
				antiDiagonalMatch = false;
			}
		}

		return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

	}
}
