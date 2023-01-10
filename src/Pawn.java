public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }
    /*@Override
    public String getColor() {
        return color;
    }*/

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.inBoard(toLine, toColumn)) {

            if (toColumn == column) {
                if (color.equals("White")) { //walk
                    if (toLine - line == 1 && chessBoard.isEmpty(toLine,toColumn)) {
                        return true;
                    }
                    if (line == 1 && toLine == 3 && chessBoard.isEmpty(2,toColumn) && chessBoard.isEmpty(3,toColumn)) {
                        return true;
                    }
                } else {
                    if (line - toLine == 1 && chessBoard.isEmpty(toLine,toColumn)) {
                        return true;
                    }
                    if (line == 6 && toLine == 4 && chessBoard.isEmpty(5,toColumn) && chessBoard.isEmpty(4,toColumn)) {
                        return true;
                    }
                }
            } else if(Math.abs(toColumn - column) == 1 && chessBoard.isEnemy(toLine, toColumn, this.color)) { //attack (not in task)
                if (color.equals("White")) {
                    if (toLine - line == 1) {
                        return true;
                    }
                } else {
                    if (line - toLine == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    @Override
    public String getSymbol() {
        return "P";
    }
}