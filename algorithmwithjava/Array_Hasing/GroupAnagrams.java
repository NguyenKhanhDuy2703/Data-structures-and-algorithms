/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmwithjava.Array_Hasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author KhanhDuy
 */

// tao Store de luu gia tri key và value 
// them tư phan tu tu array vao
// so sanh voi key  neu la anagrams => luu bo vao list chưa key 
// nguoc lai tao key mơi
public class GroupAnagrams {
    public static ArrayList<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> map = new HashMap<>();
     
    
     for( String s : strs){
         // chuyen qua kieu char va sắp xếp chuoi
         char[] a = s.toCharArray();
         Arrays.sort(a);
         // luu vao bien key vơi kiêu dư liệu là string 
         String key = String.valueOf(a);
         // neu trong map chưa có key  hiện tại thì tạo mới 
         if(map.containsKey(key) == false) {
             map.put(key, new ArrayList());
         }
         // them gia trị s của mang String vào Map theo Key = key , value = s 
         map.get(key).add(s);
         
     }       
     ArrayList<List<String>>  ls = new ArrayList<>(map.values());
    
     System.out.println(ls);
    return ls;  
    }
    public static void main(String[] args) {
     String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
     
    }
    
}
