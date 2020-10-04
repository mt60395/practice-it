// Write a method averageLength of code that computes and returns the average String length of the elements of an array of Strings.
// Assume that the array has at least one element.

public double averageLength(String[] Strings) {
    double sum = 0;
    for (String s: Strings) {
        sum += s.length();
    }
    return sum / Strings.length;
}
