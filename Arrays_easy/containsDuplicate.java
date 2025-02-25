/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

import java.util.Arrays;

/**
 *
 * @author KhanhDuy
 */
public class containsDuplicate {
     public static boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
         for(int i = 0 ; i < nums.length - 1 ; i++){
             if(nums[i] == nums[i+1]) return false;
         }
         
         
         return true;
    }
     public static void main(String[] args) {
         System.out.println(containsDuplicate(new int[] {1,2,3}));
    }
}
