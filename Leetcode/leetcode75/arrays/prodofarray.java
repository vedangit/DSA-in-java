package Leetcode.leetcode75.arrays;

public class prodofarray {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];
        int leftproduct = 1;
        for(int i = 0; i<n; i++){
            result[i] = leftproduct;
            leftproduct *=nums[i];
        }

        int rightproduct = 1;
        for(int i = n-1; i>=0; i--){
            result[i] *= rightproduct;
            rightproduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = productExceptSelf(nums1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        // Output: 24 12 8 6

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = productExceptSelf(nums2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        // Output: 0 0 9 0 0
    }
}
