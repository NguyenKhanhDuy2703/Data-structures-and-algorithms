/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

import java.util.Stack;

/**
 *
 * @author KhanhDuy
 */
public class ReverseString {
    // two point
     public static void reverseString(char[] s) {
        int index = s.length - 1;
        for(int i = 0 ; i < s.length;i++){
            char c = s[i];
            s[i] = s[index];
            s[index] = c;
           
        }
        for(int i = 0; i < s.length ;i++){
            System.out.println(s[i]);
        }
    }
     // de quy
     public static void reverseString2(char[] s){
         reverse(s, 0, s.length-1);
         for(int i = 0; i < s.length ;i++){
            System.out.println(s[i]);
        }
     }
     private  static  void reverse( char[] s , int l , int r){
         // dieu kien dung 
         if(l >= r ) return ;
         char c = s[l];
         s[l] = s[r];
         s[r] = c ;
         reverse(s, l + 1, r - 1);
     }
     //stack
     public static void reverseString3(char[] s){
         Stack<Character> arr = new Stack<>();
         for (Character c : s) {
             arr.push(c);
         }
         int  i=0;
        while(!arr.empty()){
            s[i++] = arr.pop();
        }
        for(int j = 0; j < s.length ;j++){
            System.out.println(s[j]);
        }
     }
     public static void main(String[] args) {
         reverseString3(new char[]{'h','e','l','l','o'});
    }
}
