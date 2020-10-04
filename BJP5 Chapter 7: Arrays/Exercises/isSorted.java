// Write a static method named isSorted that accepts an array of doubles as a parameter and returns true if the list is in sorted (nondecreasing) order and false otherwise.
// Assume the array has at least one element. A one-element array is considered to be sorted.

public static boolean isSorted(double[] nums) {
    int index = 0;
    double max = nums[0] - 1;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > max) {
            index++;
            max = nums[i];
        }
        if (index - 1 != i) {
            return false;
        }
    }
    return true;
}
