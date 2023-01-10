abstract public class ChessPiece {
    protected String color;
    protected boolean check;

    public ChessPiece(String color) {
        this.color = color;
        check = true;
    }
    public String getColor() {
        return color;
    }

    abstract public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract public String getSymbol();
}