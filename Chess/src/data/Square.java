package data;

import java.io.Serializable;

public class Square implements Serializable{
    private int row;
    private int col;
    private char value;
    private Piece piece;

    public Square(int row, int col, char value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    
}


/*
Board shape

8   T C A R K A C T
7   P P P P P P P P
6   # * # * # * # *
5   * # * # * # * #
4   # * # * # * # *
3   * # * # * # * #
2   p p p p p p p p
1   t c a r k a c t

    A B C D E F G H

# - blanco
* - negro

- minsculas - blancas
- mayusculas - negras
*/