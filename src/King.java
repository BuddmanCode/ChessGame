public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }
    /*@Override
    public String getColor() {
        return color;
    }*/
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.inBoard(toLine, toColumn)) {
            if (Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1 && ((toLine != line)||(toColumn != column)))
                if(chessBoard.notOwn(toLine, toColumn, this.color))
                    return true;
            return false;
        }
        return false;
    }
    @Override
    public String getSymbol() {
        return "K";
    }
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for(int i = 0; i<8; i++) {
            for(int j=0;j<8;j++) {
                if(chessBoard.isEnemy(i,j,this.color)) {
                    if( chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column) ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}