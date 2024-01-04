package Leetcode;
public class firstlastposition {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 8, 9, 10};
        int a = firstoccurence(arr, 8);
        int b = lastoccurence(arr, 8);
        System.out.println(a);
        System.out.println(b);
        
    }


    static int searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid]>target){
                end = mid -1;
            }

            else
            start = mid +1;

        }

        return -1;
        
    }


        static int firstoccurence(int[] nums, int target){
            int start = 0;
            int end = nums.length -1;

            while(start<=end){
                int mid = (start + end)/2;

                if(nums[mid] == target){
                    end = mid-1;
                }

                else if(nums[mid]>target){
                    end = mid -1;
                }

                else
                start = mid +1;

                return start;

            }

            return -1;
        

        }

        static int lastoccurence(int[] nums, int target){
            int start = 0;
            int end = nums.length -1;

            while(start<=end){
                int mid = (start + end)/2;

                if(nums[mid] == target){
                    start = mid+1;
                }

                else if(nums[mid]>target){
                    end = mid -1;
                }

                else
                start = mid +1;

                return ;

            }

            return -1;
        

        }

}
