/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardGame;

public class Pierce {
   protected Position position;
   private Board board;

    public Pierce(Board board) {
        this.board = board;
        position =null;
    }

    protected Board getBoard() {
        return board;
    }

   
    
}
