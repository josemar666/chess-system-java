
package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Rook;


public class ChessMatch {
    private Board board;
    
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }
    public ChessPierce[][]getPierces(){
      ChessPierce[][] mat = new ChessPierce[board.getRows()][board.getColumns()];
      for(int i = 0 ; i<board.getRows();i++){
        for(int j=0;j<board.getColumns();j++){
            mat[i][j]=(ChessPierce)board.piece(i, j);
        }
    }
      return mat;
    }
    private void initialSetup(){
        board.placePierces(new Rook(board ,Color.WHITE), new Position(2,1));
        board.placePierces(new King(board,Color.BLACK), new Position(0,4));
        board.placePierces(new King(board,Color.BLACK), new Position(7,4));
    }
}
