public static void mystery1(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i > 0; i--) {
        if (list.get(i) < list.get(i - 1)) {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element);
        }
    }
    System.out.println(list);
}

/*

[2, 6, 1, 8] = [1, 2, 6, 8]
[30, 20, 10, 60, 50, 40] = [10, 30, 40, 20, 60, 50]
[-4, 16, 9, 1, 64, 25, 36, 4, 49] = [-4, 1, 25, 4, 16, 9, 64, 36, 49]

*/
