/*
    Correct the bugs to produce the following expected output:
    
    first  = [3, 7]
    second = [3, 7]
    They contain the same elements.
*/

int[] first = {3, 7};
int[] second = {3, 7};

printf("first  = [%d, %d]\n", first[0], first[1]);
printf("second = [%d, %d]\n", second[0], second[1]);

if (Arrays.equals(first, second)) {
    println("They contain the same elements.");
}
else {
    println("The elements are different.");
}
