// Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and that removes from each successive pair of values the shorter string in the pair.
// If there is a tie (both strings have the same length), your method should remove the first string in the pair.
// If there is an odd number of strings in the list, the final value should be kept in the list.

public void removeShorterStrings(List<String> Strings) {
    int max = Strings.size() - Strings.size() % 2; // exclude last if odd
    for (int i = 0; i < max / 2; i++) {
        String a = Strings.get(i);
        String b = Strings.get(i + 1);
        if (a.length() <= b.length()) {
            Strings.remove(i);
        }
        else {
            Strings.remove(i + 1);
        }
    }
}
