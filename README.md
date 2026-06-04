# Tic-Tac-Toe Java Project

## Project Description

This project is a Java console-based Tic-Tac-Toe application that includes both a standard 2D Tic-Tac-Toe game and an extended 3D Tic-Tac-Toe version.

The 2D version uses a 3 by 3 board, while the 3D version uses a 4 by 4 by 4 board. Both versions allow two human players to take turns, place their symbols on empty cells, check for winning conditions, and detect draw situations.

The project demonstrates object-oriented programming concepts in Java, including classes, enums, arrays, methods, encapsulation, game logic, and console input handling.

## Technologies Used

- Java
- Object-Oriented Programming
- Java Arrays
- Java Enum
- Java Scanner
- Console-Based Application

## Project Structure

```text
tic-tac-toe-java
├── .gitignore
├── README.md
├── 2d-tic-tac-toe
│   ├── TicTacToe.java
│   └── Main.java
└── 3d-tic-tac-toe
    ├── TicTacToe3D.java
    └── Main.java
```

## Features

- Standard 2D Tic-Tac-Toe game
- 3D Tic-Tac-Toe game on a 4 by 4 by 4 board
- Two-player turn-based gameplay
- Board initialization with empty cells
- Move validation
- Win detection
- Draw detection
- Console-based board display
- Separate game logic and main execution files
- Enum-based cell representation using `X`, `O`, and `EMPTY`

## 2D Tic-Tac-Toe

The 2D version uses a 3 by 3 board. Two players take turns entering row and column values. Player 1 uses `X`, and Player 2 uses `O`.

The game checks the following winning conditions:

- Rows
- Columns
- Diagonals

If all cells are filled and no player wins, the game ends as a draw.

## 3D Tic-Tac-Toe

The 3D version uses a 4 by 4 by 4 board. Two players take turns entering level, row, and column values.

The game checks the following winning conditions:

- Rows within each level
- Columns within each level
- Vertical connections across levels
- Diagonals within levels
- Diagonals across levels

The 3D version extends the standard Tic-Tac-Toe logic by using a three-dimensional array.

## How to Compile and Run

Because both versions contain a `Main.java` file, compile and run each version separately.

## Running the 2D Version

### Compile

```bash
javac 2d-tic-tac-toe/TicTacToe.java 2d-tic-tac-toe/Main.java
```

### Run

```bash
java -cp 2d-tic-tac-toe Main
```

## Running the 3D Version

### Compile

```bash
javac 3d-tic-tac-toe/TicTacToe3D.java 3d-tic-tac-toe/Main.java
```

### Run

```bash
java -cp 3d-tic-tac-toe Main
```

## Example 2D Gameplay

```text
- - -
- - -
- - -
Player 1's turn. Enter row and column (1-3):
```

The player enters a row and column number between 1 and 3.

## Example 3D Gameplay

```text
Level 1:
- - - -
- - - -
- - - -
- - - -

Level 2:
- - - -
- - - -
- - - -
- - - -

Player 1's turn. Enter level (1-4), row (1-4), and column (1-4):
```

The player enters a level, row, and column number between 1 and 4.

## Notes

- The project uses console input and output.
- The 2D and 3D versions are stored in separate folders because both versions use a `Main.java` file.
- Invalid moves are rejected if the selected position is outside the board or already occupied.
- The program continues until one player wins or the game ends in a draw.
- No external libraries are required.

## Purpose of the Project

The purpose of this project is to practice Java object-oriented programming through a simple game-based application. It focuses on using classes, enums, arrays, methods, condition checking, and user input in Java.

## Project Outcome

This project demonstrates the ability to design and implement turn-based game logic in Java. It also shows how standard 2D game logic can be extended into a 3D version using multidimensional arrays.
