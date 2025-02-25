/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

import java.util.Hashtable;

/**
 *
 * @author KhanhDuy
 */
// đầu vào  cho một mảng và hai số giống nhau , tìm 2 số giống nhau theo 2 chỉ mục i và  j sao cho  nums[i] == nums[j] bà trị tuyệt đối i - j <= k
public class Contains_Duplicate_II {
    public static  boolean containsNearbyDuplicate (int [] nums ,  int k){
        
          for(int i = 0 ; i < nums.length ; i++){
              for(int j = i+1 ;  j < nums.length;j++){
                  if(nums[i] == nums[j] && (j - i) <= k) return true;
              }
        }
        return false;
    }
    public static boolean  containsNearbyDuplicate2 (int [] nums ,  int k){
        Hashtable<Integer, Integer > list = new Hashtable<>();
        
        for(int i = 0 ; i < nums.length ; i++){
           if(list.containsKey(nums[i]) && Math.abs(i - list.get(nums[i])) <= k){
               return true;
           }
           list.put(nums[i], i);
        }
      return false;
    }
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate2(new int[]{1,0,1,1}, 1));
    }
}
