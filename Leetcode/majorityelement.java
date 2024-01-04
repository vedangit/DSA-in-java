package Leetcode;
import java.util.Arrays;
public class majorityelement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 1, 2, 2,};
        int ans = findMajorityElement(arr);
        System.out.println(ans);
    }

    static int findMajorityElement(int[] nums){
        
     Arrays.sort(nums);
     return nums[nums.length/2];    
}
}