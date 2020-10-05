// Write a method maxLength that takes an ArrayList of Strings as a parameter and that returns the length of the longest string in the list.
// If your method is passed an empty list, it should return 0.

public int maxLength(List<String> Strings) {
    int max = 0;
    for (String s: Strings) {
        if (s.length() > max) {
            max = s.length();
        }
    }
    return max;
}
