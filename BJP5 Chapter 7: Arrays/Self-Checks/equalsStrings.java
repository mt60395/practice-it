// Write a method called equals that takes in two string arrays and returns true if they are equal;
// that is, if both arrays have the same length and contain equivalent string values at each index.

public boolean equals(String[] one, String[] two) {
    if (one.length != two.length) return false;
    for (int i = 0; i < one.length; i++) {
        for (int j = 0; j < two.length; j++) {
            if (i == j) {
                if (!one[i].equals(two[i])) {
                    return false;
                }
            }
        }
    }
    return true;
}
