package TicTacToe;

public class AiStrategy implements PlayerStrategy{
    Position makeMove(){
        int row=(int)(Math.random()*3);
        int col=(int)(Math.random()*3);
        Position p=new Position(row, col);
        return p;
    }
}
