// Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no).
// Notice that given this definition, a list of 0 or 1 elements would be considered unique.

public boolean isUnique(int[] nums) {
    boolean unique = true;
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length; j++) {
            if (i != j && nums[i] == nums[j]) {
                unique = false;
            }
        }
    }
    return unique;
}
