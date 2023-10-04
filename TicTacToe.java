package ClassExcerises.PersonalProjects;

import java.util.Scanner;

public class TicTacToe {
    private static final char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        boolean gameInProgress = true;

        while (gameInProgress) {
            displayBoard();
            int[] move = getPlayerMove();
            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                gameInProgress = !checkForWin(row, col);

                if (gameInProgress) {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        displayBoard();
        System.out.println("Game over! " + currentPlayer + " wins!");
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void displayBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -+-+-");
            }
        }
    }

    private static int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[2];

        System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
        move[0] = scanner.nextInt();
        move[1] = scanner.nextInt();

        return move;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private static boolean checkForWin(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkDiagonals(row, col);
    }

    private static boolean checkRow(int row) {
        return board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer;
    }

    private static boolean checkColumn(int col) {
        return board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer;
    }

    private static boolean checkDiagonals(int row, int col) {
        return checkMainDiagonal(row, col) || checkAntiDiagonal(row, col);
    }

    private static boolean checkMainDiagonal(int row, int col) {
        if (row == col) {
            return board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer;
        }
        return false;
    }

    private static boolean checkAntiDiagonal(int row, int col) {
        if (row + col == 2) {
            return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
        }
        return false;
    }
}