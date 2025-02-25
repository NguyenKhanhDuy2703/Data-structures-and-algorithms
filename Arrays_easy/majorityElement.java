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
public class majorityElement {
     public static int majorityElement(int[] nums) {
         int n = nums.length;
         int dem = 0 ;
         Arrays.sort(nums);
         int cur = nums[0];
         for(int i = 0 ; i < n ;i++){
            if(cur == nums[i]){
                dem++;
            }else{
                cur = nums[i];
            }
            if(dem > (n/2)) cur = nums[i];
         }
         
         
           return cur;
    }
     public static void main(String[] args) {
         System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
