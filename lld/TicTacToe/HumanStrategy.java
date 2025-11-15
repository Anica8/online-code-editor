package TicTacToe;

import java.util.Scanner;

public class HumanStrategy implements PlayerStrategy{
    Position makeMove(){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        Position p=new Position(row, col);
        return p;
    }
}

