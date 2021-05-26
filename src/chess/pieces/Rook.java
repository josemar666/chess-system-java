
package chess.pieces;

import boardGame.Board;
import chess.ChessPierce;
import chess.Color;


public class Rook extends ChessPierce {
    
    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "R";
    }
}
