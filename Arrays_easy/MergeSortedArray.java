/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */
public class MergeSortedArray {
     public static void merge(int[] nums1, int m, int[] nums2, int n) { 
        int i = m - 1 , j = n - 1;
        int index = m+n -1;
         while( i >= 0 && j >= 0 ){
             if( nums1[i] < nums2[j] ){
                 nums1[index] = nums2[j];
                 j--;
             }else{
                 nums1[index] = nums1[i];
                 i--;
             }
            index--;
             
         }
        while(j >= 0){
            nums1[index] = nums2[j];
            j--;
            index--;
        }
         
         for (int k = 0; k < nums1.length; k++) {
             System.out.print(nums1[k] + " ");
         }
        
    }
     public static void main(String[] args) {
         int[] nums1 = new int[]{4,5,6,0,0,0};
         int[] nums2 = new int []{1,2,3};
         
         merge(nums1, 3, nums2, 3);
    }
}
