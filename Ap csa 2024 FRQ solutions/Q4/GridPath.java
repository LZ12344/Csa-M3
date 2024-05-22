import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
public Location getNextLoc(int row, int col) {

if(grid.length-1 == row){
  return new Location(row,col+1);
}else if(grid[0].length-1 == col){
    return new Location(row+1,col);
  }
    
else{
  if(grid[row][col+1] < grid[row+1][col]){
    return new Location(row,col+1);
  }else{
    return new Location(row+1,col);
  }
}

}

  
  // PART B
public int sumPath(int row, int col) {
 int sum =0;
 int r = row;
 int c =col;
  
  while(r != grid.length-1 && c != grid[0].length-1){
 Location abc =  getNextLoc( r, c);
    r = abc.getRow();
    c = abc.getCol();
    sum += grid[r][c];
    System.out.println(sum);
  }
  return sum;
}

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
