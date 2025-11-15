package TicTacToe;

import java.util.Scanner;

public class Board{

    Symbol[][] board = new Symbol[3][3];

    for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        board[i][j] = Symbol.EMPTY;
        }
    }
}