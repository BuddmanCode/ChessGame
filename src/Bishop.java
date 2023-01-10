public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }
    /*@Override
    public String getColor() {
        return color;
    }*/
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.inBoard(toLine, toColumn)) {
            if (Math.abs(toColumn - column) == Math.abs(toLine - line) && toLine != line) {
                if(chessBoard.notOwn(toLine, toColumn, this.color)) {
                    int lineStep = toLine > line ? 1 : -1;
                    int columnStep = toColumn > column ? 1 : -1;
                    for(int i = line + lineStep, j = column + columnStep; i != toLine; i+=lineStep, j+=columnStep) {
                        if(!chessBoard.isEmpty(i,j))
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
        return "B";
    }
}