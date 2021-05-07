package com.crystal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kalah {
    private static String player;
    int[] players = new int[2];
    int[] board;


    public static void main(String[] args) {
        Kalah kalah = new Kalah();
        boolean playGame = true;
        Player player1 = new Player("P1", 0);
        Player player2 = new Player("P2", 0);
        String player;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (playGame) {
            kalah.printBoard();
            if (count % 2 == 0) {
                player = player1.getName();
            } else {
                player = player2.getName();
            }
            System.out.println("Player " + player + " choose the position!\n");
            int position = scanner.nextInt();
            if (player == player1.getName()) {
                int x = kalah.board[position - 1];
                kalah.board[position - 1] = 0;
                int positionCount = position;
                for (int i = 0; i < x; i++) {
                    if (positionCount + i == 13) {
                        positionCount = 0 - i;
                    }
                    kalah.board[positionCount + i] = kalah.board[positionCount + i] + 1;
                }
                System.out.println("Value is: " + x);
            } else {
                int x = kalah.board[position + 6];
                kalah.board[position + 6] = 0;
                int positionCount = position + 7;
                for (int i = 0; i < x; i++) {
                    if (positionCount + i == 14) {
                        positionCount = 0 - i;
                    }
                    if (positionCount + i == 6){
                        positionCount = positionCount + 1;
                    }
                    kalah.board[positionCount + i] = kalah.board[positionCount + i] + 1;
                }
            }
            count++;
        }

    }

    public Kalah() {
        board = new int[]{6, 6, 6, 6, 6, 6, 0, 6, 6, 6, 6, 6, 6, 0};
    }

    public void printBoard() {
        //System.out.println("ceefv");

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

}

