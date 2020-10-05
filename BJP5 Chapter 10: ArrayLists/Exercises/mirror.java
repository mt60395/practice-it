// Write a method mirror that accepts an ArrayList of Strings as a parameter and produces a mirrored copy of the list as output, with the original values followed by those same values in the opposite order.

public void mirror(List<String> Strings) {
    for (int i = Strings.size() - 1; i >= 0; i--) {
        Strings.add(Strings.get(i));
    }
}
