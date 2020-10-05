// Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and that eliminates any duplicates from the list.
// Because the values will be sorted, all of the duplicates will be grouped together.

public void removeDuplicates(List<String> Strings) {
    int i = 0;
    while (i + 1 < Strings.size()) {
        if (Strings.get(i) == Strings.get(i + 1)) {
            Strings.remove(i + 1);
        }
        else {
            i++;
        }
    }
}
