// Suppose that a class CalendarDate has been defined for storing a calendar date with month, day and year components.
// Your task is to modify the class to be Comparable by adding an appropriate compareTo method.
// Dates that occur chronologically earlier should be considered "less" than dates that occur later.

public int compareTo(CalendarDate date) {
    int[] calendar = {year, month, day};
    int[] calendar2 = {date.getYear(), date.getMonth(), date.getDay()};
    for (int i = 0; i < 3; i++) {
        if (calendar[i] > calendar2[i]) {
            return 1;
        }
        else if (calendar[i] < calendar2[i]) {
            return -1;
        }
    }
    return 0;
}
