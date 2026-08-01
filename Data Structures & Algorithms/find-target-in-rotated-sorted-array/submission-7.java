class Solution {
    public int search(int[] nums, int target) {

       int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target in left half
                } else {
                    left = mid + 1; // target in right half
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // target in right half
                } else {
                    right = mid - 1; // target in left half
                }
            }
        }

        return -1; // Not found
}
}

// [ 4, 5, 6, 7, 8, 1, 2, 3 ]
//   l        m           r 






// [ 4, 5, 6, 7,  1, 2, 3 ]
//  l         m         r 

// [ 5, 1, 2, 3, 4 ]
//   l     m     r

           