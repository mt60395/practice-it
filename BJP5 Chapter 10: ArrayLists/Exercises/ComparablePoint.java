// Suppose that a class Point2D has been defined for storing a 2-dimensional point with x and y coordinates (both as doubles). 
// Your task is to modify the class to be Comparable by adding an appropriate compareTo method.
// Points should be compared relative to their distance from the origin, with points closer to the origin considered "less" than points farther from it.
// The distance between two points is defined as the square root of the sum of the squares of the differences between the x and y coordinates.

public int compareTo(Point2D point) {
    Point2D origin = new Point2D(0, 0);
    double dist = distance(origin);
    double dist2 = point.distance(origin);
    // point closer to the origin returns -1
    return dist < dist2? -1:dist > dist2? 1: 0;
}
