/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KhanhDuy
 */
public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> sRanges = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
           int start = nums[i];
            while(i + 1 < nums.length && nums[i] == nums[i+1] - 1){
                i++;
            }
           int end = nums[i];
            if(start == end) {
                sRanges.add(start+"");
            }else{
                sRanges.add(start +"->" + end);
                
            }
        }
        return sRanges;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }
}
