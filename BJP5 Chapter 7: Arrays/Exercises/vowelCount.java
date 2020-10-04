// Write a static method named vowelCount that accepts a String as a parameter and returns an array of integers representing the counts of each vowel in the String. 
// Assume that the string contains no uppercase letters.

public static int[] vowelCount(String s) {
    int[] count = new int[5];
    String vowels = "aeiou";
    for (char ch: s.toCharArray()) {
        int index = vowels.indexOf(String.valueOf(ch));
        if (index != -1) {
            count[index]++;
        }
    }
    return count;
}
