// Write a method called kthLargest that accepts an integer k and an array a as its parameters and returns the element such that k elements have greater or equal value.
// If k = 0, return the largest element; if k = 1, return the second largest element, and so on.
// Assume that 0 <= k < a.length. (Hint: Consider sorting the array, or a copy of the array first.)

public int kthLargest(int k, int[] a) {
    Arrays.sort(a);
    return a[a.length-1-k];
}
