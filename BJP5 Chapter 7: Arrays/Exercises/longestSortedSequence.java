// Write a method named longestSortedSequence that accepts an array of integers as a parameter and that returns the length of the longest sorted (nondecreasing) sequence of integers in the array. 
// Notice that sorted means nondecreasing, which means that the sequence could contain duplicates. 
// Your method should return 0 if passed an empty array.

public int longestSortedSequence(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }
    int largestCount = 0;
    int count = 0;
    int max = nums[0];
    for (int i: nums) {
        if (i >= max) {
            max = i;
            count++;
            if (count >= largestCount) {
                largestCount = count;
            }
        }
        else {
            max = i;
            count = 1;
        }
    }
    return largestCount;
}
