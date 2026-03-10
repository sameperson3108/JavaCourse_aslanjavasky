package Mod8_TicTacToe.controller;

import Mod8_TicTacToe.model.Board;
import Mod8_TicTacToe.model.Player;
import Mod8_TicTacToe.model.Symbol;

import java.util.Scanner;

public class GameController {
    Player player1;
    Player player2;
    Board board;

    {
        initPlayers();
    }

    public GameController() {
        board = new Board();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        while (true) {
            board.showCurrentState();
            System.out.println("Player " + currentPlayer.getName() + " enter your step(row and column)");
            int row = 0, column = 0;
            System.out.println("row =");

            row = scanner.nextInt();
            System.out.println("column =");
            column = scanner.nextInt();
            row--;
            column--;

            if (board.isCellEmpty(row,column)) {
                board.setCell(row, column, currentPlayer.getSymbol());
                board.showCurrentState();
            }
            if (board.isWinner(currentPlayer)) {
                System.out.println("The player " + currentPlayer.getName() + " is Winner");
                break;
            } else {
                currentPlayer = (currentPlayer == player1 ? player2 : player1);
            }
        }
    }



    private void initPlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Player1: ");
        String player1Name = scanner.nextLine();

        do {
            System.out.println("Choose the symbol for Player " + player1Name + " (X or O) :");
            String symbol = scanner.nextLine();
            if (symbol.length() == 1) {
                if (symbol.equalsIgnoreCase("X") || symbol.equalsIgnoreCase("Х")) {
                    player1 = new Player(player1Name, Symbol.X);
                } else {
                    player1 = new Player(player1Name, Symbol.O);
                }
            }
        } while (player1 == null);


        System.out.println("Enter the name of Player2: ");
        String player2Name = scanner.nextLine();
        if (player1.getSymbol() == Symbol.X) {
            player2 = new Player(player2Name, Symbol.O);
        } else {
            player2 = new Player(player2Name, Symbol.X);
        }

//        scanner.close();
    }
}
