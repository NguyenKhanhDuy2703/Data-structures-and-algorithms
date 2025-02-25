/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KhanhDuy
 */
// Create 1 List => row previous ( prev )
// at  prev[1] = 1
// create row of pascal following n ( to 1 -> rowIndex) 
// each n => create List curr[n] ( with the size = n )  || the fist and last element assigned by 1
// 1 ->  ( <n)  =  prev[n](j-1) + prev[n](j);
// assign cur for prev
// n == rowindex return prev 

public class Pascal_Triangle_II {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer>  prev = new ArrayList<>();
        prev.add(1);
        for(int i = 1 ; i <= rowIndex ; i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1 ; j < i ;j++){
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            prev = curr;
        }
        System.out.println( prev);
                
       return prev;
       
    }
    public static void main(String[] args) {
        getRow(3);
    }
}
