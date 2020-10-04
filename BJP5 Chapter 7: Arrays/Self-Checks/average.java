// Write a method called average that computes the average (arithmetic mean) of all elements in an array of integers and returns the answer as a double.
// Your method accepts an array of integers as its parameter and returns the average.
// You may assume that the array contains at least one element.
// Your method should not modify the elements of the array.

public double average(int[] nums) {
    double sum = 0.0;
    for (int num: nums) {
        sum += num;
    }
    return sum / nums.length;
}
