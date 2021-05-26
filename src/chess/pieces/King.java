
package chess.pieces;

import boardGame.Board;
import chess.ChessPierce;
import chess.Color;


public class King extends ChessPierce {
    
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
