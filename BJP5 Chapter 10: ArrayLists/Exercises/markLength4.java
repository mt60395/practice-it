// Write a method markLength4 that takes an ArrayList of Strings as a parameter and that places a string of four asterisks "****" in front of every string of length 4.
// Notice that you leave the original strings in the list, "this", "lots", "Java", but include the four-asterisk string in front of each to mark it.

public void markLength4(List<String> Strings) {
    int index = 0;
    while (index != Strings.size()) {
        if (Strings.get(index).length() == 4) {
            Strings.add(index, "****");
            index++;
        }
        index++;
    }
}
