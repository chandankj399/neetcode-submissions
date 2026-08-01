class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26]; // Array to store character frequency
        int left = 0, maxFreq = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++; // Increment frequency of right character
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']); // Update maxFreq
            
            // If the number of characters to be changed is greater than k, shrink the window
            if ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--; // Reduce frequency of left character
                left++; // Move left pointer forward
            }

            maxLength = Math.max(maxLength, right - left + 1); // Update maxLength
        }

        return maxLength;
        
    }
}


// "A  A  B  B  B  C  B   A  A   "
//           l
//           r   


// "A  A  A  B  A  B  B"

