// Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.

public void swapPairs(List<String> a) {
    int max = a.size() - a.size() % 2; // exclude last if odd
    for (int i = 0; i < max; i++) {
        if (i % 2 == 0) {
            String b = a.get(i+1);
            a.set(i + 1, a.get(i));
            a.set(i, b);
        }
    }
}
