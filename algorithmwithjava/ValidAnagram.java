/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author KhanhDuy
 */
public class ValidAnagram {
       public static  String sortString ( String a){
         char [] chars = a.toCharArray();
         for(int i = 0 ; i < a.length()  ; i++){
             char temp ;
           for (int j = 0 ; j < a.length()- i - 1 ; j++){
                if( chars[j] > chars[j+1]){
                    temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
           }
         }
         return new String(chars);
     }
       public static boolean validAnagram( String a , String b){
       // change from string to array 
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = sc.nextLine();
        System.out.println(sortString(s).compareTo(sortString(a))== 0? " true" : "false");
        System.out.println(validAnagram(s, a) == true ? "true" : "false");

    }
}
