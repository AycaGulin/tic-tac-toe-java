public class Main {

	public static void main(String[] args) {
		TicTacToe3D game = new TicTacToe3D();  // Create a new game
        java.util.Scanner scanner = new java.util.Scanner(System.in);  // For player input
        boolean gameEnd = false;  // Keep track of whether the game has ended

        // Loop until the game ends
        while (!gameEnd) {
            game.printBoard();  
            System.out.println((game.player1Turn ? "Player 1" : "Player 2") + "'s turn. Enter level (1-4), row (1-4), and column (1-4): ");
                     
            int level = scanner.nextInt() - 1; 
            int row = scanner.nextInt() - 1;   
            int col = scanner.nextInt() - 1;  
            
            gameEnd = game.makeMove(level, row, col);
        }

        // Final board display
        game.printBoard();
        System.out.println("Game Over.");
    }
}
