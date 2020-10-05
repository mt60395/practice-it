// Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value in the list to the front, otherwise preserving the order of the elements.
// You may assume that the list stores at least one value.

public void minToFront(List<Integer> nums) {
    int index = 0;
    for (int i = 0; i < nums.size(); i++) {
        if (nums.get(i) < nums.get(index)) {
            index = i;
        }
    }
    int min = nums.get(index);
    nums.remove(index);
    nums.add(0, min);
}
