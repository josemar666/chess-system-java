
package apliccation;

import chess.ChessPierce;


public class UI {
    public static  void printBoard(ChessPierce[][] pierces){
        for(Integer i = 0 ; i<pierces.length;i++){
            System.out.print((8 - i)+ " ");
            for(Integer j =0 ; j<pierces.length ; j++){
                printPierce(pierces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    private static void printPierce(ChessPierce pierces){
        if(pierces == null){
            System.out.print("- ");
        }
        else{
            System.out.print(pierces);
        }
        System.out.print("");
    }
}
