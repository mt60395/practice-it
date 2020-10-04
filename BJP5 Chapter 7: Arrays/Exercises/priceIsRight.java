// Write a method priceIsRight that accepts an array of integers bids and an integer price as parameters.
// The method returns the element in the bids array that is closest in value to price without being larger than price.
// You may assume there is at least 1 element in the array, and you may assume that the price and the values in bids will all be greater than or equal to 1.
// Do not modify the contents of the array passed to your method as a parameter.

public int priceIsRight(int[] bids, int price) {
    int index = -1;
    for (int i = 0; i < bids.length; i++) {
        if (index != -1) { // if the first suitable value is not found yet
            if (bids[i] <= price && bids[i] > bids[index]) {
                index = i;
            }
        }
        else {
            if (bids[i] <= price) {
                index = i;
            }
        }
    }
    return index == -1? -1:bids[index];
}
