homework-template-project
=========================

Apache Maven project template for the Software Engineering and Technologies course.

Consider 4 coins and a game board consisting of 4x4 cells. Initially, the coins are placed on the 4 cells in the center of the board as shown below:


The goal of the game is to move each coin to a corner cell. In a move, one of the coins must be moved either horizontally or vertically by 1, 2, or 3 cells. A coin can be moved if and only if all of the following conditions hold:

1. It is adjacent to one or more coins either horizontally or vertically.
2. The target cell is empty and all cells between the coin and the target cell are empty.

When a new game is started the program must ask for the name of the player.

The program must store the result of the games as follows. For each game, the following information must be stored: the date and time when the game was started/finished, the name of the player, the number of moves made by the player during the game, and the outcome (the puzzle is solved/given up). The program must show a high score table in which the top 10 results are displayed. You can score the players based on the steps/time required to solve the puzzle.