class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            // If middle element is greater than right, the min must be to the right
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                // The min is at mid or to the left of mid
                r = m;
            }
        }

        // l == r, pointing to the minimum
        return nums[l];
    }
}


// 2  1
//    l  r

//  [3, 4, 5, 6, 7, 1, 2]
    //  l        m        r
    //           l  m     r 
    //              l  m  r        


    // if l > m && r > m:
    // return m;
    // else if l > m:
    //      r = m;
    //      m = (l + m) / 2;
    //  else ( m > r):
    //    l = m;
    //    m = (m + r) / 2;
     


