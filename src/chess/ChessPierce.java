/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardGame.Board;
import boardGame.Pierce;


public class ChessPierce extends Pierce {
    private Color color;
    public ChessPierce(Board board , Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

  
    
}
