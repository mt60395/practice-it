// Write a method isPalindrome that accepts an array of Strings as its argument and returns true if that array is a palindrome (if it reads the same forwards as backwards) and false if not.
// Arrays with zero or one element are considered to be palindromes.

public boolean isPalindrome(String[] s) {
    for (int i = 0; i < s.length / 2; i++) {
        if (s[i] != s[s.length-1-i]) {
            return false;
        }
    }
    return true;
}
