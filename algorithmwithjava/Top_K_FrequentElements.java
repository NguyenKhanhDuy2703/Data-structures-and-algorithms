/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author KhanhDuy
 */
public class Top_K_FrequentElements {
    public static int [] topKFrequent(int [] nums , int k ){
        HashMap<Integer , Integer > frequent = new HashMap<>();
         for(int i = 0 ; i < nums.length ; i++){
             int count = frequent.getOrDefault(nums[i],1);
             if(frequent.containsKey(nums[i])){
                 frequent.put(nums[i],count + 1 );
             }else{
                 frequent.put(nums[i], count);
             }
             List<Integer> List = new ArrayList<>();
             
             
         }
        
        System.out.println(" hashMap :  " + frequent);
        
        return new int[]{2,3};
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,1,1,2,2,3};
        topKFrequent(arr, 0);
    }
}
