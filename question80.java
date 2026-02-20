package leetcode;

public class question80 {

    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                return true;
            }
            
            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }
            
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return false;        
    }

    public static boolean easySearch(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(arr, target));

        System.out.println(easySearch(arr, target));
    }
}