
package boardGame;


public class Board {
 private Integer rows;
 private Integer columns;
 private Pierce [][] pieces;

    public Board(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Pierce[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }
    public Pierce piece(Integer rows , Integer columns){
        return pieces[rows][columns];
    }
    public Pierce piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
 
}
