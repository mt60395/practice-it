// Write a method called evenBeforeOdd that accepts an array of integers and rearranges its elements so that all even values appear before all odds.
// The exact order of the elements does not matter, so long as all even values appear before all odd values.
// The array might contain no even elements or no odd elements.
// Do not use any temporary arrays in your solution, and do not call Arrays.sort.

public void evenBeforeOdd(int[] a) {
    int index = 0;
    int swap = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0) {
            swap = a[index];
            a[index++] = a[i]; // confirmed even at the index
            a[i] = swap;
        }
    }
}
