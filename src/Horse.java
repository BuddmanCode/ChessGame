public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }
    /*@Override
    public String getColor() {
        return color;
    }*/
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.inBoard(toLine, toColumn)) {
            if ((Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2) || (Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1)) {
                if(chessBoard.notOwn(toLine, toColumn, this.color))
                    return true;
            }
        }
        return false;
    }
    @Override
    public String getSymbol() {
        return "H";
    }
}