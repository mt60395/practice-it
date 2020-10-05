// Write a method stutter that takes an ArrayList of Strings and an integer k as parameters and that replaces every string with k copies of that string.
// If k is 0 or negative, the list should be empty after the call.

public void stutter(List<String> Strings, int k) {
    if (k <= 0) {
        Strings.clear();
    }
    for (int i = 0; i < Strings.size(); i++) {
        for (int j = 0; j < k - 1; j++) {
            if (i * k < Strings.size()) {
                Strings.add(i * k, Strings.get(i * k));
            }
        }
    }
}
