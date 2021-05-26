
package boardGame;


public class Board {
 private Integer rows;
 private Integer columns;
 private Pierce [][] pieces;

    public Board(Integer rows, Integer columns) {
        if(rows < 1 || columns <1){
            throw new BoardException("Error creating board : there must be at least 1 row and 1 column ");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Pierce[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

  
    public Integer getColumns() {
        return columns;
    }

 
    public Pierce piece(Integer rows , Integer columns){
        if(!positionExists(rows,columns)) {
            throw new BoardException("Psoition not on the board");
        }
        return pieces[rows][columns];
    }
    public Pierce piece(Position position){
          if(!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }
    public void placePierces(Pierce piece , Position position){
        if(theresIsApiece(position)){
            throw new BoardException("there is  already a piece position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    private boolean positionExists(int row , int column){
        return row >=0 && row < rows && column >=0 && column < columns;
    }
    
    public boolean positionExists(Position position){
        return positionExists(position.getRow() , position.getColumn());
    }
    public boolean theresIsApiece(Position position){
        if(!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
       return piece(position) != null;
    }
}
