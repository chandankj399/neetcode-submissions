class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1 ;

        while (l < r) {
            int m = l + (r - l)/2;
            if (nums[m] == target) return m;

            else  if (nums[l] == target) return l;

            else  if (nums[r] == target) return r;

            else if (nums[m] - nums[l] > 0)  {
                l = m ;
            }

            else {
                r = m;
            }
        }
        return nums[l] == target ? l : -1;  
    }
}

// [ 4, 5, 6, 7, 8, 1, 2, 3 ]
//   l        m           r 






// [ 4, 5, 6, 7,  1, 2, 3 ]
//  l         m         r 

// [ 5, 1, 2, 3, 4 ]
//   l     m     r

           