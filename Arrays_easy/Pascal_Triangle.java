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
public class Pascal_Triangle {
     public  static List<List<Integer>> generate(int numRows) {
         List<List<Integer>> pas = new ArrayList<>();
         for(int i = 0 ; i < numRows ; i++){
             List<Integer> row = new ArrayList<>();
             for(int j = 0 ; j <= i  ; j++){
                if(j == i || j == 0  ){
                    row.add(1);
                    
                }
                if(i > 1 && j > 0 && j != i){
                    int nex = pas.get(i - 1).get(j) + pas.get(i - 1).get(j - 1);
                    row.add(nex);
                }
                 
                 
                
             }
             
             pas.add(row);
         }
        
         System.out.println(pas);
         return pas;
    }
    public static void main(String[] args) {
        generate(5);
    }
}
