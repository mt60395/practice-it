// Write a static method named contains that accepts two arrays of integers a1 and a2 as parameters and that returns a boolean value indicating whether or not a2's sequence of elements appears in a1 (true for yes, false for no).
// You may assume that both arrays passed to your method will have lengths of at least 1.
// You may not use any Strings to help you solve this problem, nor methods that produce Strings such as Arrays.toString.

public static boolean contains(int[] a1, int[] a2) {
    if (a1.length < a2.length) return false;
    for (int i = 0; i < a1.length; i++) {
        boolean match = true;
        for (int j = 0; j < a2.length; j++) {
            try {
                if (a2[j] != a1[i + j]) {
                    match = false;
                }
            }
            catch (Exception e) { // insufficient length. definitely not found.
                return false;
            }
        }
        if (match) return true;
    }
    return false;
}
