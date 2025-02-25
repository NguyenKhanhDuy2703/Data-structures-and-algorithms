/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

/**
 *
 * @author KhanhDuy
 */
public class PlusOne {
        public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i =  n - 1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i] +=1;
                return digits;
            }else{
                digits[i] = 0 ;
            }
        }  
        int [] arr = new int[n +1] ;
        arr[0] = 1;
        return arr;
        }
    public static void main(String[] args) {
        int[] digits = new int[]{0};
        int[] test = plusOne(digits);
        for(int i = 0 ; i < test.length ;i++){
            System.out.print(test[i]);
        }
    }
}
