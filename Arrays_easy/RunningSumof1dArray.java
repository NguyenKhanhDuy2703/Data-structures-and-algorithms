/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */
public class RunningSumof1dArray {
    public static int[] runningSum(int[] nums) {
        int[] result =new int[nums.length];
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
           result[i] = sum;
        }
        
        return result;
    }
    
   
}
