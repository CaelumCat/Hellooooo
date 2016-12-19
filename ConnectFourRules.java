/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jointgames;

/**
 *
 * @author leahr
 */
public class ConnectFourRules {
    private final int[][] grid = new int[6][7];
    
    public void setGridPt(int row, int column, int player) { //player doesn't actually exist yet
        grid[row][column] = player;
    }
    
    public int getGridPt(int row, int column) {
        return grid[row][column];
    }
    
    public void findWinner() {
        int middle;

        //rows testing
        String row = "";
        for (int r=0; r<6; r++) { //uses a specific row
            for (int c=0; c<7; c++) { //makes a String of the row
                row += grid[r][c];
            }
            middle = row.charAt(3);
            if ((row.charAt(0) == middle) && (((row.charAt(1) == middle) && (row.charAt(2) == middle)) || 
                    ((row.charAt(1) == middle) && (row.charAt(2) == middle) && (row.charAt(4) == middle)) || 
                    ((row.charAt(2) == middle) && (row.charAt(4) == middle) && (row.charAt(5) == middle)) || 
                    ((row.charAt(4) == middle) && (row.charAt(5) == middle) && (row.charAt(6) == middle)))) {
                //player ___ wins
                break;
            } else {
                row = "";
            }
        }
        
        //columns testing
        String column = "";
        for (int c=0; c<7; c++) { //uses a specific column
            for (int r=0; r<6; r++) { //makes a String of the column
                column += grid[r][c];
            }
            middle = column.charAt(3);
            if ((column.charAt(0) == middle) && (((column.charAt(1) == middle) && (column.charAt(2) == middle)) || 
                    ((column.charAt(1) == middle) && (column.charAt(2) == middle) && (column.charAt(4) == middle)) || 
                    ((column.charAt(2) == middle) && (column.charAt(4) == middle) && (column.charAt(5) == middle)))) {
                //player ___ wins
                break;
            } else {
                column = "";
            }
        }
        
        //diagonal1 testing
        for (int repeats=0; repeats<4; repeats++) {
            String diagonal1 = "";
            for (int b=0; b<6; b++) { //makes a String of the diagonal1
                diagonal1 += grid[b][b];
            }
            middle = diagonal1.charAt(3);
            if ((diagonal1.charAt(0) == middle) && (((diagonal1.charAt(1) == middle) && (diagonal1.charAt(2) == middle)) || 
                    ((diagonal1.charAt(1) == middle) && (diagonal1.charAt(2) == middle) && (diagonal1.charAt(4) == middle)) || 
                    ((diagonal1.charAt(2) == middle) && (diagonal1.charAt(4) == middle) && (diagonal1.charAt(5) == middle)))) {
                //player ___ wins
            } else {
                diagonal1 = "";
            }
        }
        
        //diagonal2 testing
        String diagonal2 = "";
        for (int b=1; b<7; b++) { //makes a String of the diagonal1
            diagonal2 += grid[b][b];
        }
        middle = diagonal2.charAt(3);
        if ((diagonal2.charAt(0) == middle) && (((diagonal2.charAt(1) == middle) && (diagonal2.charAt(2) == middle)) || 
                ((diagonal2.charAt(1) == middle) && (diagonal2.charAt(2) == middle) && (diagonal2.charAt(4) == middle)) || 
                ((diagonal2.charAt(2) == middle) && (diagonal2.charAt(4) == middle) && (diagonal2.charAt(5) == middle)))) {
            //player ___ wins
        } else {
            diagonal2 = "";
        }
        
    }
}
