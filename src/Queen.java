public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }
   /* @Override
    public String getColor() {
        return color;
    }*/
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.inBoard(toLine, toColumn))
            if ((toLine == line && toColumn != column) || (toLine != line && toColumn == column) || (Math.abs(toColumn - column) == Math.abs(toLine - line) && toLine != line))
                if(chessBoard.notOwn(toLine, toColumn, this.color))
                    return true;
        return false;
    }
    @Override
    public String getSymbol() {
        return "Q";
    }
}