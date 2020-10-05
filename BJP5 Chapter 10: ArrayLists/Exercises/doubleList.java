// Write a method doubleList that takes an ArrayList of Strings as a parameter and that replaces every string with two of that string.

public void doubleList(List<String> Strings) {
    int index = 0;
    while (index != Strings.size()) {
        Strings.add(index, Strings.get(index));
        index += 2;
    }
}
