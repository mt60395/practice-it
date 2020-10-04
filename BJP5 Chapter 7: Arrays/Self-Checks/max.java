// Write a method called max that accepts an array of integers as a parameter and returns the maximum value in the array. 
// You may assume that the array contains at least one element.
// Your method should not modify the elements of the array.

public int max(int[] nums) {
    int max = nums[0]; // or Integer.MIN_VALUE
    for (int num: nums) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}
