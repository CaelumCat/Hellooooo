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

public class TicTacToeRules {
    
    private int[][] board = new int[3][3];
    
    public void setBoardPt(int row, int column, int player) { //player doesn't exist yet
        board[row][column] = player;
    }
    
    public int getBoardPt(int row, int column) {
        return board[row][column];
    }
    
    public void findWinner() {
        int middle;

        //rows testing
        String row = "";
        for (int r=0; r<3; r++) { //uses a specific row
            for (int c=0; c<3; c++) { //makes a String of the row
                row += board[r][c];
            }
            middle = row.charAt(0);
            if ((row.charAt(1) == middle) && (row.charAt(2) == middle)) {
                //player ___ wins
                break;
            } else {
                row = "";
            }
        }
        
        //columns testing
        String column = "";
        for (int c=0; c<3; c++) { //uses a specific row
            for (int r=0; r<3; r++) { //makes a String of the row
                column += board[r][c];
            }
            middle = column.charAt(0);
            if ((column.charAt(1) == middle) && (column.charAt(2) == middle)) {
                //player ___ wins
                break;
            } else {
                column = "";
            }
        }
        
        //diagonal1 testing
        String diagonal1 = "";
        for (int b=0; b<3; b++) { //makes a String of the diagonal1 using 'both'
            diagonal1 += board[b][b];
        }
        middle = diagonal1.charAt(0);
        if ((diagonal1.charAt(1) == middle) && (diagonal1.charAt(2) == middle)) {
            //player ___ wins
        } else {
            diagonal1 = "";
        }
        
        //diagona2 testing
        String diagonal2 = "";
        for (int b=0; b<3; b++) {
            diagonal2 += board[b][2-b];
        }
        middle = diagonal2.charAt(0);
        if ((diagonal2.charAt(1) == middle) && (diagonal2.charAt(2) == middle)) {
            //player ___ wins
        } else {
            diagonal2 = "";
        }
        
    }
        
}
