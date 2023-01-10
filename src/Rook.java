public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }
    /*@Override
    public String getColor() {
        return color;
    }*/
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.inBoard(toLine, toColumn) ) {
            if(chessBoard.notOwn(toLine, toColumn, this.color)) {
                if(toLine != line && toColumn == column) {
                    int step = toLine > line ? 1 : -1;
                    for (int i = line + step; i != toLine; i += step) {
                        if (!chessBoard.isEmpty(i, column))
                            return false;
                    }
                    return true;
                } else if(toLine == line && toColumn != column) {
                    int step = toColumn > column ? 1 : -1;
                    for(int i = column + step; i!=toColumn; i+=step) {
                        if(!chessBoard.isEmpty(line,i))
                            return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String getSymbol() {
        return "R";
    }
}