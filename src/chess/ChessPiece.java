package chess;

import Board_layer.Board;
import Board_layer.Piece;

import java.awt.*;

public class ChessPiece extends Piece {
    private Color color;
    private Integer moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
