/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava;

import java.util.Scanner;

/**
 *
 * @author KhanhDuy
 */
public class twoSum {
    public static  void twoSum (int[] arr , int target){
        int[] result  = new int[2];
       for(int i = 0 ; i < arr.length -1 ; i++){
          for(int j = 0 ; j < arr.length - 1 ; j++){
             if((arr[i] + arr[j+1]) == target ){
                result[0] = i;
                result[1] = j+1;
             }
          }}
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap taget :  ");
         int taget  = sc.nextInt();
        int arr[] = new int[]{3,2,4};
        
        twoSum(arr, taget);
    }
}
