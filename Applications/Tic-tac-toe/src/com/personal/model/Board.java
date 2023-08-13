package com.personal.model;

import java.util.List;

public abstract class Board {

	private int size;
	private PlayingPiece[][] board;

	protected Board(int size) {
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public PlayingPiece[][] getBoard() {
		return board;
	}

	public void setBoard(PlayingPiece[][] board) {
		this.board = board;
	}

	public abstract boolean addPiece(int row, int column, PlayingPiece pieceType);

	public abstract boolean isValidCell(int row, int column);

	public abstract List<FreeCell> getFreeCells();

	public void displayBoard() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (board[i][j] != null) {
					System.out.print(board[i][j].pieceType.name() + "   ");
				} else {
					System.out.print("    ");

				}
				System.out.print(" | ");
			}
			System.out.println();

		}

	}

}
