// Write a method called allLess that accepts two arrays of integers and returns true if each element in the first array is less than the element at the same index in the second array.
// If the arrays are not the same length, you should return false.

public boolean allLess(int[] nums, int[] nums2) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
            if (i == j && nums[i] > nums2[j]) {
                return false;
            }
        }
    }
    return (nums.length == nums2.length);
}
