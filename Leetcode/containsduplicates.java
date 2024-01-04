package Leetcode;
import java.util.Arrays;
public class containsduplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};
        boolean ans = containsDuplicates(arr);
        System.out.println(ans);
    }

    static boolean containsDuplicates(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
