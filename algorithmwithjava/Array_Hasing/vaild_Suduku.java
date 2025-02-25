/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava.Array_Hasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author KhanhDuy
 */
public class vaild_Suduku {
    public static boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            HashSet<Character> row = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                if (row.contains(board[r][c])) {
                    return false;
                }
                row.add(board[r][c]);
            }
            
        }
        for(int c = 0 ; c < board.length ; c++){
            HashSet<Character> col = new HashSet<>();
            for(int r = 0 ; r < board.length ; r++){
                if (board[r][c] == '.') {
                    continue;
                }
                if (col.contains(board[r][c])) {
                    return false;
                }
                col.add(board[r][c]);
            }
        }
        
        for(int s = 0 ; s < 9 ; s++){
            HashSet<Character> square = new HashSet<>();
            for(int c = 0 ; c < 3 ; c++){
                for(int r = 0 ; r < 3 ;r++){
                    // transfer  9 x 9 about 3 x 3  by s / 3 ( row ) and s % 3*( col )
                    // check all box small by  (s/3) x 3  + c ( row)  and (s%3 ) x 3 (col)
                    
                    int row = (s/3) *3 + c ;
                    int col = (s%3) *3 + r ;
                    if( board[row][col] == '.') continue;
                    if(square.contains(board[row][col])) return false;
                    square.add(board[row][col]);
                }
            }
        }
        
        
       

        return true;
    }

    public static void main(String[] args) {
        char[][] sudoku = {
            {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
            {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
            {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
            {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("result : " + isValidSudoku(sudoku));
    }
}
