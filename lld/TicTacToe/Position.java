package TicTacToe;

public class Position{
    int row;
    int col;

    Position(int row, int col){
        this.row=row;
        this.col=col;
    }

    public int getRow(int row){
        return row;
    }

    public int getCol(int col){
        return col;
    }
}
