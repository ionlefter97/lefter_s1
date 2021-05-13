package com.crystal.kahal;

public class Board {
    public Board() {

    }

    public void printBoard(int[] board) {
        System.out.println("P2  6  5  4  3  2  1\n");
        System.out.print("    ");
        for (int i = board.length - 2; i >= board.length / 2; i--) {
            System.out.print(board[i]);
            System.out.print("  ");
        }
        System.out.println("");
        System.out.print(board[13]);
        System.out.print("                      ");
        System.out.println(board[6]);
        System.out.print("    ");
        for (int i = 0; i < board.length / 2 - 1; i++) {
            System.out.print(board[i]);
            System.out.print("  ");
        }
        System.out.println("\n\nP1  1  2  3  4  5  6");
    }

    public int[] populateBoard(int[] board, int numberOfStones) {
        for (int i = 0; i < board.length - 1; i++) {
            if (i != board.length / 2 - 1) {
                board[i] = numberOfStones;
            }
        }
        return board;
    }

    public int getStonesOnBoard(int[] board, int playerNumber) {
        int numberOfStones = 0;
        if (playerNumber == 1) {
            for (int i = 0; i < board.length / 2 - 1; i++) {
                numberOfStones = numberOfStones + board[i];
            }
        } else if (playerNumber == 2) {
            for (int i = board.length / 2; i < board.length - 1; i++) {
                numberOfStones = numberOfStones + board[i];
            }
        }
        return numberOfStones;
    }

    public int getStonesOnTheOpposite(int[] board, int position) {
        return board[board.length - position - 2];
    }


}
