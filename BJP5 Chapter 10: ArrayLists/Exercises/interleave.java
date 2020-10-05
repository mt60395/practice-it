// Write a method called interleave that accepts two ArrayLists of integers a1 and a2 as parameters and inserts the elements of a2 into a1 at alternating indexes.
// If the lists are of unequal length, the remaining elements of the longer list are left at the end of a1. 

public void interleave(List<Integer> a1, List<Integer> a2) {
    int oldSize = a1.size();
    int added = 0;
    for (int i = 0; i < a2.size(); i++) {
        if (i * 2 + 1 <= a1.size()) {
            a1.add(i * 2 + 1, a2.get(i));
            added = i;
        }
    }
    // missing some if a2.size() >= formerly a1.size()
    if (a2.size() >= oldSize) {
        if (oldSize != 0) {
            for (int i = added + 1; i < a2.size(); i++) {
                a1.add(a2.get(i));
            }
        }
        else {
            for (int i: a2) {
                a1.add(i);
            }
        }
    }
}
