// Write a method called stdev that returns the standard deviation of an array of integers.

public double stdev(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
    double avg = sum / (double) a.length; // calculate the mean
    double dev = 0;
    for (int i: a) {
        dev += Math.pow(i - avg, 2); // sum of the squares of the differences between each element and the mean
    }
    return Math.sqrt(dev / (a.length-1)); // divided by one less than the number of elements.
}
