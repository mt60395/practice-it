// Write a method called mode that returns the most frequently occurring element of an array of integers.
// Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive.
// Break ties by choosing the lower value.

public int mode(int[] a) {
    int[] b = new int[101]; // inclusive
    for (int num: a) {
        b[num]++; // histogram
    }
    int max = 1;
    int min = a[0];
    for (int num = 0; num < b.length; num++) {
        if (b[num] > max) { // simple case
            max = b[num]; // new greatest occurrence
            min = num;
        }
        else if (b[num] == max) { // account for if same number of occurrences
            if (num < min) { // break ties by choosing the lower value
                min = num;
            }
        }
    }
    return min;
}
