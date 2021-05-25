/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apliccation;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;


public class Program {
    public static void main (String[] args){
        
      ChessMatch match = new ChessMatch();
      UI.printBoard(match.getPierces());
        
    }
    
}
