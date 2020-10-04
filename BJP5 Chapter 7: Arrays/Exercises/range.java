// Write a static method named range that takes an array of integers as a parameter and returns the range of values contained in the array.
// You may assume that the array contains at least one element (that its length is at least 1).
// You should not modify the contents of the array.

public static int range(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    for (int i: nums) {
        if (i > max) {
            max = i;
        }
        if (i < min) {
            min = i;
        }
    }
    return max - min + 1; // inclusive range
}
