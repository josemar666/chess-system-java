
package boardGame;

public class Position {
    private  Integer rows;
    private  Integer columns;

    public Position(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public Integer getRow() {
        return rows;
    }

    public void setRow(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumn() {
        return columns;
    }

    public void setColumn(Integer column) {
        this.columns = columns;
    }
    @Override
    public String toString(){
        return rows + "," + columns;
    }
    public void setValues(Integer row ,Integer column){
        
    }
    
}
