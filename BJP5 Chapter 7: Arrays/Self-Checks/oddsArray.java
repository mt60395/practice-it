// Write code that creates an array named odds and stores all odd numbers between -6 and 38 into it using a for loop.
// Make the array's size exactly large enough to store the numbers.

int count = 0;
for (int i = -6; i < 38; i++) {
    if (i % 2 != 0) {
        count++;
    }
}
int[] odds = new int[count];
count = 0;
for (int i = -6; i < 38; i++) {
    if (i %2 != 0) {
        odds[count++] = i;
    }
}
