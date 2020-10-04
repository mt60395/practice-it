// Write a method named lastIndexOf that accepts an array of integers and an integer value as its parameters and returns the last index at which the value occurs in the array.
// The method should return -1 if the value is not found.

public int lastIndexOf(int[] nums, int num) {
    int last = 0;
    boolean flag = false;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == num) {
            last = i;
            flag = true;
        }
    }
    return flag? last:-1;
}
