// Write a method called median that accepts an array of integers as its argument and returns the median of the numbers in the array. 
// Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive.

public int median(int[] a) {
	Arrays.sort(a);
    return a[(a.length-1)/2];
}
