// Write a method called collapse that accepts an array of integers as a parameter and returns a new array containing the result of replacing each pair of integers with the sum of that pair.
// If the list stores an odd number of elements, the final element is not collapsed.
// Your method should not change the array that is passed as a parameter.

public int[] collapse (int[] nums) {
    int[] newNums = new int[(int) Math.ceil(nums.length/2.0)];
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
        if (i % 2 == 0) {
            newNums[index] = nums[i];
            if (nums.length % 2 != 0 && i == nums.length - 1) {} // final element not collapsed if odd number
            else {
                newNums[index] += nums[i+1];
            }
            index++;
        }
    }
    return newNums;
}
