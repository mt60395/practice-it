// Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even numbers in the array as a real number. 
// If the array contains no even elements or no elements at all, return 0.0.

public double percentEven(int[] ints) {
    int count = 0;
    for (int i: ints) {
        if (i % 2 == 0) {
            count++;
        }
    }
    return ints.length<1? 0.0:count * (100.00 / ints.length);
}
