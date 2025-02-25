/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */
// algorithm : 
//  {3,2,2,3} 
// we use the i of index Nums  and point is count element remaining when we remove element 
// check num[i] != val ( the val is removed element ) 
    // if  true => swap num
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
       if(nums.length == 0) return 0;
       int point = 0;
       for(int i = 0 ; i < nums.length  ; i++){
           if(nums[i] != val){
               nums[point] = nums[i];
               point++;
           }
       }

        return point ;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        
        System.out.println("\n result : " + removeElement(nums, val));
    }
}
