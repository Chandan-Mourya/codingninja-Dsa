#Binary Search
find number in array if exist return index or return -1

public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
