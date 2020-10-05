// Write a method called removeInRange that accepts four parameters: an ArrayList of integers, an element value, a starting index, and an ending index.
// The method's behavior is to remove all occurrences of the given element that appear in the list between the starting index (inclusive) and the ending index (exclusive).
// Other values and occurrences of the given value that appear outside the given index range are not affected.

public void removeInRange(List<Integer> nums, int element, int start, int end) {
    int index = 0;
    for (int i = 0; i < end - start; i++) {
        if (nums.get(start + index) == element) {
            nums.remove(start + index);
        }
        else {
            index++;
        }
    }
}
