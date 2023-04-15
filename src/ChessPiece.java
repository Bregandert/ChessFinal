abstract public class ChessPiece {

    String color;
    boolean check=true;

    public ChessPiece(String color){
        this.color = color;
    }

    abstract public String getColor();
    abstract public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    abstract public String getSymbol();
//    абстрактный метод canMoveToPosition(), возвращающий логическое (boolean) значение и паринимающий в себя параметры ChessBoard chessBoard, int line, int column, int toLine, int toColumn;
//    абстрактный метод getSymbol(), возвращающий строку — тип фигуры.

    protected boolean checkPos(int pos) {
        return pos>=0 && pos<=7;
    }

    protected int getMax(int a, int b){
        return Math.max(a, b);
    }

    protected int getMin(int a, int b){
        return Math.min(a, b);
    }
}
