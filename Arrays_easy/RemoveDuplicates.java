/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */
public class RemoveDuplicates {
     public static int removeDuplicates(int[] nums) {
         int curr = nums[0];
         int k = 1 ;
         for(int i = 1 ; i  < nums.length ; i++){
             if(nums[i] != curr){
                 curr = nums[i];
                 nums[k] = nums[i];
                 k++;
             }
         }
         for(int i  = 0 ; i < k ; i++){
             System.out.print(" " + nums[i]);
         }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println("\n k : " + removeDuplicates(nums));
    }
}
