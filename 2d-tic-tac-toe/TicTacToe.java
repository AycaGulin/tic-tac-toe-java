//An enum named to represent the values on the board.
enum Cell{
    X, // X for player 1
    O, // O for player 2
    EMPTY; // EMPTY for empty spots
}

public class TicTacToe {

    private Cell[][] board;
    boolean player1Turn; // To see whose turn it is
    
    // Constructor to start the board and set player 1's turn
    public TicTacToe() {
        board = new Cell[3][3];
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                board[a][b] = Cell.EMPTY;  
            }
        }
        player1Turn = true;
    }

    // Method to print the board.
    public void printBoard() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (board[a][b] == Cell.EMPTY) {
                    System.out.print("- ");
                } else {
                    System.out.print(board[a][b] + " ");
                }
            }
            System.out.println();
        }
    }

    // Method for player to make a move
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != Cell.EMPTY) {
            System.out.println("Invalid move. Retry!");
            return false; 
        }

        // Assign X or O based on whose turn it is
        board[row][col] = player1Turn ? Cell.X : Cell.O;
      
        System.out.println("Move made by " + (player1Turn ? "Player 1 (X)" : "Player 2 (O)"));

        // Check if the current player has won
        if (checkWin()) {
            System.out.println((player1Turn ? "Player 1" : "Player 2") + " wins!");
            return true;  
        }

        // Check if the game is a draw
        if (checkDraw()) {
            System.out.println("It's a draw!");
            return true;  
        }

        player1Turn = !player1Turn;
        return false;  
    }

    // Method to check if the current player has won
    private boolean checkWin() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    // Method to check if any row has the same symbols
    private boolean checkRows() {
        for (int a = 0; a < 3; a++) {
            if (board[a][0] != Cell.EMPTY && board[a][0] == board[a][1] && board[a][1] == board[a][2]) {
                return true;
            }
        }
        return false;
    }

    // Method to check if any column has the same symbols
    private boolean checkColumns() {
        for (int a = 0; a < 3; a++) {
            if (board[0][a] != Cell.EMPTY && board[0][a] == board[1][a] && board[1][a] == board[2][a]) {
                return true;
            }
        }
        return false;
    }

    // Method to check if either diagonal has the same symbols
    private boolean checkDiagonals() {
        return (board[0][0] != Cell.EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
               (board[0][2] != Cell.EMPTY && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    // Method to check if the game is a draw
    private boolean checkDraw() {
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (board[a][b] == Cell.EMPTY) {
                    return false;
                }
            }
        }
        return true;  
    }
}
