// Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.

public void removeEvenLength(List<String> Strings) {
    for (int i = Strings.size() - 1; i >= 0; i--) {
        if (Strings.get(i).length() % 2 == 0) {
            Strings.remove(i);
        }
    }
}
