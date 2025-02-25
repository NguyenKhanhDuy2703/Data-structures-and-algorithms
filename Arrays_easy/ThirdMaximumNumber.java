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
public class ThirdMaximumNumber {
    // sort  => nlogn
     public static int thirdMax(int[] nums) {
            Arrays.sort(nums);
            int level = 3;
            int curr= nums[nums.length - 1];
             for(int i = nums.length - 2 ; i >= 0;i--){
                 if(curr > nums[i]) {
                     curr = nums[i];
                     level--;
                 }

                if(level == 1 ) return nums[i];
                    }


            return nums[nums.length - 1];
    }
     // method 2  => complexity = O(n)
     public static int thirdMax2( int[] nums){
         Integer first = null;
         Integer second = null;
         Integer third = null;
         
        for(Integer num : nums){
            // remove dublicate 
             if (num.equals(first) || num.equals(second) || num.equals(third)) {
            continue;
        }
            if(first == null || num > first){
                third = second;
                second = first;
                first = num;
            }else if (second == null || num > second ){
                third = second;
                second= num;
            }else if ( third == null || num > third){
                third = num;
            }
            
        }
         
         return third == null ? first : third;  
     }
     public static void main(String[] args) {
         System.out.println(" result "+thirdMax2(new int[]{3,2,1}));
    }
}
