package com.crystal.kahal;

import java.util.Scanner;

public class Kalah {

    public static void main(String[] args) {

        Board board = new Board();

        Player player1 = new Player("P1", 0);
        Player player2 = new Player("P2", 0);

        String playerRefernce = player1.getName();

        boolean gameOver = false;

        int numberOfHoles = 6;
        int numberOfStones = 4;

        int[] arrayBoard = new int[numberOfHoles * 2 + 2];
        board.populateBoard(arrayBoard, numberOfStones);

        int[] testBoard = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println();
        System.out.println(board.getStonesOnBoard(testBoard, 2));

//count is for to maintain the order of the players
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {

            int countEmptyHoles = 0;

            //<<<<<<<<<<<<<<<<<<<<<< begin - check if game is over >>>>>>>>>>>>>>>>>>>>>>>>>>>
            //if there are no stones in the holes
            if (board.getStonesOnBoard(testBoard, 1) == 0 || board.getStonesOnBoard(testBoard, 2) == 0) {
                gameOver = true;

                player1.setScore(arrayBoard[numberOfHoles]);
                player2.setScore(arrayBoard[numberOfHoles * 2 + 1]);

                if (player1.getScore() > player2.getScore()) {
                    System.out.println("Win player :" + player1.getName() + " with " + player1.getScore() + " stones !!!");
                } else if (player1.getScore() < player2.getScore()) {
                    System.out.println("Win player :" + player2.getName() + " with " + player2.getScore() + " stones !!!");
                } else {
                    System.out.println("You both have the same number of points !!!");
                }
                return;
            }
            //<<<<<<<<<<<<<<<<<<<<<< end - check if game is over >>>>>>>>>>>>>>>>>>>>>>>>>>>
            board.printBoard(arrayBoard);

            if (count % 2 == 0) {
                playerRefernce = player1.getName();
            } else {
                playerRefernce = player2.getName();
            }
            System.out.println("Player " + playerRefernce + " choose the chosenPosition!\n");
            int chosenPosition = scanner.nextInt();

            //<<<<<<<<<<<<<<<<<<<<<< begin - All logic for player 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>
            //for player1
            if (playerRefernce == player1.getName()) {
                int numberOfStonesTaken = arrayBoard[chosenPosition - 1];
                arrayBoard[chosenPosition - 1] = 0;
                int chosenPositionCount = chosenPosition;
                for (int i = 0; i < numberOfStonesTaken; i++) {
                    if (chosenPositionCount + i == arrayBoard.length - 1) {
                        chosenPositionCount = 0 - i;
                    }
                    arrayBoard[chosenPositionCount + i] = arrayBoard[chosenPositionCount + i] + 1;
                }
                //if last stone arrive in the right hole player1 make another move
                if (chosenPositionCount + numberOfStonesTaken == arrayBoard.length / 2) {
                    count++;
                }

                System.out.println("oposite element: " + arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - 1]);

                //System.out.println("another " + board.getStonesOnTheOpposite(arrayBoard, chosenPositionCount + numberOfStonesTaken));

                if (arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - 1] != 0 && chosenPositionCount + numberOfStonesTaken < arrayBoard.length / 2 - 1 && arrayBoard[chosenPositionCount + numberOfStonesTaken - 1] == 1) {
                    arrayBoard[arrayBoard.length / 2 - 1] = arrayBoard[arrayBoard.length / 2 - 1] + arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - 1] + arrayBoard[chosenPositionCount + numberOfStonesTaken - 1];
                    arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - 1] = 0;
                    arrayBoard[chosenPositionCount + numberOfStonesTaken - 1] = 0;
                }


                //<<<<<<<<<<<<<<<<<<<<<< end - All logic for player 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>

                //<<<<<<<<<<<<<<<<<<<<<< begin - All logic for player 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>
                //for player2
            } else {
                int numberOfStonesTaken = arrayBoard[chosenPosition + numberOfHoles];
                arrayBoard[chosenPosition + numberOfHoles] = 0;

                //it is added numberOfHoles to take a position on the other side of the board
                int chosenPositionCount = chosenPosition + numberOfHoles + 1;
                for (int i = 0; i < numberOfStonesTaken; i++) {
                    if (chosenPositionCount + i == arrayBoard.length) {
                        chosenPositionCount = 0 - i;
                    }
                    if (chosenPositionCount + i == numberOfHoles) {
                        chosenPositionCount = chosenPositionCount + 1;
                    }
                    arrayBoard[chosenPositionCount + i] = arrayBoard[chosenPositionCount + i] + 1;
                }
                //if last stone arrive in the left hole player2 make another move
                if (chosenPositionCount + numberOfStonesTaken == arrayBoard.length) {
                    count++;
                }

                if (arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - 1] != 0 && chosenPositionCount + numberOfStonesTaken >= arrayBoard.length / 2 && chosenPositionCount + numberOfStonesTaken < arrayBoard.length - 1 && arrayBoard[chosenPositionCount + numberOfStonesTaken - 1] == 1) {
                    arrayBoard[arrayBoard.length - 1] = arrayBoard[arrayBoard.length - 1] + arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - numberOfHoles - 2] + arrayBoard[chosenPositionCount + numberOfStonesTaken + numberOfHoles];
                    arrayBoard[arrayBoard.length - chosenPosition - numberOfStonesTaken - 1] = 0;
                    arrayBoard[chosenPositionCount + numberOfStonesTaken - 1] = 0;
                }


            }
            //<<<<<<<<<<<<<<<<<<<<<< end - All logic for player 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>

            count++;
        }


    }


//    public Kalah() {
//        arrayBoard = new int[]{6, 6, 6, 6, 6, 6, 0, 6, 6, 6, 6, 6, 6, 0};
//    }

//    public void printBoard() {
//        //System.out.println("ceefv");
//
//        System.out.println("P2  6  5  4  3  2  1\n");
//        System.out.print("    ");
//        for (int i = arrayBoard.length - 2; i >= arrayBoard.length / 2; i--) {
//            System.out.print(arrayBoard[i]);
//            System.out.print("  ");
//        }
//        System.out.println("");
//        System.out.print(arrayBoard[13]);
//        System.out.print("                      ");
//        System.out.println(arrayBoard[6]);
//        System.out.print("    ");
//        for (int i = 0; i < arrayBoard.length / 2 - 1; i++) {
//            System.out.print(arrayBoard[i]);
//            System.out.print("  ");
//        }
//        System.out.println("\n\nP1  1  2  3  4  5  6");
//    }

}

