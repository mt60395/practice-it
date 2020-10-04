// Write a method printBackwards that prints an array of integers in reverse order, in the following format.
/*
    For the array {1, -3, 4, 7, 2}:

    element [4] is 2
    element [3] is 7
    element [2] is 4
    element [1] is -3
    element [0] is 1
*/

public void printBackwards(int[] nums) {
    for (int i = nums.length - 1; i > -1; i--) {
        printf("element [%d] is %d\n", i, nums[i]);
    }
}
