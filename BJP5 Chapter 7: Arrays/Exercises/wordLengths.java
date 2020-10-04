// Write a method called wordLengths that accepts a Scanner representing an input file as its argument.
// Your method should read from the given file, count the number of letters in each token in the file, and output a result diagram of how many words contain each number of letters.
// Use tabs before the asterisks so that they'll line up. If there are no words of a given length, omit that line from the output.
// You may assume that no token in the file is more than 80 characters in length.

public void wordLengths(Scanner input) {
    int[] a = new int[81]; // add 1 to the length because 0 is also a length, ignoring
    while (input.hasNext()) {
        a[input.next().length()]++; // histogram
    }
    for (int i = 1; i < a.length; i++) { // no strings have 0 length
        if (a[i] == 0) { // token with the length must exist
            continue;
        }
        printf("%d: %d\t", i, a[i]);
        for (int j = 0; j < a[i]; j++) {
            print("*");
        }
        println();
    }
}
