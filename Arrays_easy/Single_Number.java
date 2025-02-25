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
public class Single_Number {

    public static int singleNumber(int[] nums) {
        int result = 0;
//        // Bits manipulation
//        for(int i = 0 ; i < nums.length  ;i++){
//               result^=nums[i];
//            
//        }
    // sort
        Arrays.sort(nums);
        for(int i  = 0 ; i < nums.length-1  ; i+=2){
                if (nums[i] != nums[i + 1]) {
                return nums[i]; // Số xuất hiện lẻ lần
            }

        }
        return result;
    }

    public static void main(String[] args) {
         System.out.println(singleNumber(new int []{4,1,2,2,2,1,2}));   
    }
}
