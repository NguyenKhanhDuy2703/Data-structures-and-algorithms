/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava.Array_Hasing;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author KhanhDuy
 */
public class LongestConsecutiveSequence {
    
    // methods 1 : use for
//    public static int longestConsecutive(int[] nums){
//       Arrays.sort(nums);
//        int count = 1,max = 0;
//        if(nums.length == 0)return 0;
//        if(nums.length == 1 ) return 1;
//        if(nums.length == 2 && nums[0] == nums[1]) return 1;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if(nums[i] == nums[i+1])return 1;
//             if(nums[i] == nums[i+1]){
//                continue;
//            }
//            if(nums[i] != (nums[i+1] - 1)   ){
//                count = 1;
//            }
//             if(count > max){
//                max = count;
//            }
//             count++;
//        }
//        return max ;
//}
    // methods 2 : use Hashset()
    public static int longestConsecutive (int[] nums ){
        HashSet<Integer> store = new HashSet<>();
        if(nums.length == 0 ) return 0;
        for(int i : nums){
            store.add(i);
        }
        int i = 0 ;
        while(i < nums.length){
            System.out.println("store : " + store);
            if( store.contains(nums[i] + 1) || store.contains(nums[i] - 1) ){
                
            }else{
                store.remove(nums[i]);
            }
            i++;
        }
        System.out.println("store result : " + store);
        return store.size();
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println("max : " + longestConsecutive(nums));
    }
}
