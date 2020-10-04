// Write a method named swapPairs that accepts an array of strings as a parameter and switches the order of values in a pairwise fashion.
// You may assume that the array is not null and that no element of the array is null.

public static void swapPairs(String[] a) {
	int max = a.length - a.length % 2; // exclude last if odd
	for (int i = 0; i < max; i++) {
		if (i % 2 == 0) {
			String b = a[i+1];
			a[i+1] = a[i];
			a[i] = b;
		}
	}
}
