// Write a method called append that accepts two integer arrays as parameters and returns a new array that contains the result of appending the second array's values at the end of the first array.

public int[] append(int[] list1, int[] list2) {
    int[] list3 = new int[list1.length + list2.length];
    int index = 0;
    for (int i: list1) {
        list3[index++] = i;
    }
    for (int i: list2) {
        list3[index++] = i;
    }
    return list3;
}
