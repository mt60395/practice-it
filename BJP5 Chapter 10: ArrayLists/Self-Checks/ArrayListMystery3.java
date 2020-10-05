public static void mystery3(ArrayList<Integer> list) {
    for (int i = list.size() - 2; i > 0; i--) {
        int a = list.get(i);
        int b = list.get(i + 1);
        list.set(i, a + b);
    }
    System.out.println(list);
}

/*

[72, 20] = [72, 20]
[1, 2, 3, 4, 5, 6] = [1, 20, 18, 15, 11, 6]
[10, 20, 30, 40] = [10, 90, 70, 40]

*/
