package com.personal.model;

import java.util.ArrayList;
import java.util.List;

public class TicTactoeBoard extends Board {

	public TicTactoeBoard(int size) {
		super(size);
	}

	@Override
	public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
		// TODO Auto-generated method stub
		if (isValidCell(row, column)) {
			this.getBoard()[row][column] = playingPiece;
			return true;
		}
		return false;
	}

	@Override
	public boolean isValidCell(int row, int column) {

		if (this.getBoard()[row][column] != null) {
			return false;
		}

		if (row < 0 || row > this.getSize() || column < 0 || column > this.getSize()) {
			return false;
		}

		return true;
	}

	public List<FreeCell> getFreeCells() {
		List<FreeCell> freeCells = new ArrayList<>();

		for (int i = 0; i < this.getSize(); i++) {
			for (int j = 0; j < this.getSize(); j++) {
				if (this.getBoard()[i][j] == null) {
					FreeCell freeCell = new FreeCell(i, j);
					freeCells.add(freeCell);
				}
			}
		}

		return freeCells;
	}

}
