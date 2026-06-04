//An enum named to represent the values on the board.
enum Cell {
    X, // X for player 1
    O, // O for player 2
    EMPTY; // EMPTY for empty spots
}

public class TicTacToe3D {
    private Cell[][][] board; // 3D array for the board
    boolean player1Turn; // To see whose turn it is

    // Constructor to start the board and set player 1's turn
    public TicTacToe3D() {
        board = new Cell[4][4][4]; // 4x4x4 board
        for (int level = 0; level < 4; level++) {
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    board[level][row][col] = Cell.EMPTY; 
                }
            }
        }
        player1Turn = true; 
    }

    // Method to print the board
    public void printBoard() {
        for (int level = 0; level < 4; level++) {
            System.out.println("Level " + (level + 1) + ":");
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    if (board[level][row][col] == Cell.EMPTY) {
                        System.out.print("- ");
                    } else {
                        System.out.print(board[level][row][col] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println(); 
        }
    }

    // Method for a player to make a move
    public boolean makeMove(int level, int row, int col) {
        if (level < 0 || level >= 4 || row < 0 || row >= 4 || col < 0 || col >= 4 || board[level][row][col] != Cell.EMPTY) {
            System.out.println("Invalid move. Retry!");
            return false;
        }

        // Assign X or O based on whose turn it is
        board[level][row][col] = player1Turn ? Cell.X : Cell.O;

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
        return checkRows() || checkColumns() || checkLevels() || checkDiagonals();
    }

    // Method to check if any row has the same symbols within each level
    private boolean checkRows() {
        for (int level = 0; level < 4; level++) {
            for (int row = 0; row < 4; row++) {
                if (board[level][row][0] != Cell.EMPTY && board[level][row][0] == board[level][row][1] &&
                    board[level][row][1] == board[level][row][2] && board[level][row][2] == board[level][row][3]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check if any column has the same symbols within each level
    private boolean checkColumns() {
        for (int level = 0; level < 4; level++) {
            for (int col = 0; col < 4; col++) {
                if (board[level][0][col] != Cell.EMPTY && board[level][0][col] == board[level][1][col] &&
                    board[level][1][col] == board[level][2][col] && board[level][2][col] == board[level][3][col]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check for a win across levels vertical in the third dimension
    private boolean checkLevels() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (board[0][row][col] != Cell.EMPTY && board[0][row][col] == board[1][row][col] &&
                    board[1][row][col] == board[2][row][col] && board[2][row][col] == board[3][row][col]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check for diagonals within each level and across levels
    private boolean checkDiagonals() {
        
        for (int level = 0; level < 4; level++) {
            if (board[level][0][0] != Cell.EMPTY && board[level][0][0] == board[level][1][1] &&
                board[level][1][1] == board[level][2][2] && board[level][2][2] == board[level][3][3]) {
                return true;
            }
            if (board[level][0][3] != Cell.EMPTY && board[level][0][3] == board[level][1][2] &&
                board[level][1][2] == board[level][2][1] && board[level][2][1] == board[level][3][0]) {
                return true;
            }
        }

        
        if (board[0][0][0] != Cell.EMPTY && board[0][0][0] == board[1][1][1] &&
            board[1][1][1] == board[2][2][2] && board[2][2][2] == board[3][3][3]) {
            return true;
        }
        if (board[0][0][3] != Cell.EMPTY && board[0][0][3] == board[1][1][2] &&
            board[1][1][2] == board[2][2][1] && board[2][2][1] == board[3][3][0]) {
            return true;
        }

        return false;
    }

    // Method to check if the game is a draw
    private boolean checkDraw() {
        for (int level = 0; level < 4; level++) {
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    if (board[level][row][col] == Cell.EMPTY) {
                        return false; 
                    }
                }
            }
        }
        return true; 
    }
}
