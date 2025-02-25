/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava;

/**
 *
 * @author KhanhDuy
 */
public class ContainsDuplicate {
    public static  void slution1 (int [] nums){
        boolean status = false;
        for(int i = 0 ; i < nums.length ; i ++){
            for(int  j = i+1 ; j < nums.length ;j++){
                if(nums[i] == nums[j]) {
                    status = true;
                    break;
                }
            }
        }
        System.out.println(status == true ? "true" : "false");
    }
    public static void main(String[] args) {
       int[] nums =  new int[]{1,2,3,1};
        slution1(nums);
        
    }
}
