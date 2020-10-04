// Write a method countStrings that takes an array of Strings and a target String and returns the number of occurences target appears in the array.

public int countStrings(String[] Strings, String s) {
    int count = 0;
    for (String str: Strings) {
        if (str.equals(s)) {
            count++;
        }
    }
    return count;
}
