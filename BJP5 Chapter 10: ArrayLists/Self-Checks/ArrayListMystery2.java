public static void mystery2(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
        if (i % 2 == 0) {
            list.add(list.get(i));
        } else {
            list.add(0, list.get(i));
        }
    }
    System.out.println(list);
}

/*

[10, 20, 30] = [20, 10, 20, 30, 30, 20]
[8, 2, 9, 7, 4]	= [8, 7, 8, 2, 9, 7, 4, 4, 2, 8]
[-1, 3, 28, 17, 9, 33] = [33, 28, 33, -1, 3, 28, 17, 9, 33, 17, -1, 33]

*/
