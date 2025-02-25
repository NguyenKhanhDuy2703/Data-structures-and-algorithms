/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */
public class searchInsert {
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i ;
            }
            if(target < nums[i]) return i;
                
            
            
        }
        return nums.length ;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}
