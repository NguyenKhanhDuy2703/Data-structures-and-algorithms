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
public class missingNumber {
     public static int missingNumber(int[] nums) {
         Arrays.sort(nums);
         System.out.println(nums.length);
         for(int i = nums.length - 1 ; i >= 0 ; i-- ){
             if(nums[i] <  nums.length ) return nums[i]+1;
             if(nums[i-1] + 1 == nums[i]){
                 continue;
             }else{
                 return nums[i]- 1;
             }
         }
        return 0;
    }
     public static void main(String[] args) {
         System.out.println(missingNumber(new int[]{0}));
    }
}
