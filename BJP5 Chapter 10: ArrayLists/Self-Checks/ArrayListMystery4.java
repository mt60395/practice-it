public static void mystery4(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        int element = list.get(i);
        list.remove(i);
        list.add(0, element + 1);
    }
    System.out.println(list);
}

/*

[10, 20, 30] = [31, 21, 11]
[8, 2, 9, 7, 4]	= [5, 8, 10, 3, 9]
[-1, 3, 28, 17, 9, 33] = [34, 10, 18, 29, 4, 0]

*/
