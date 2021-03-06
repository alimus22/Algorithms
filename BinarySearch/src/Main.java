/**
 * Ali Hanni
 *
 * Binary Search
 *
 * Binary Search is a search algorithm that finds the index of a given value inside a sorted
 * array. In Binary Search, the target value (t) is compared to the middle value of the array.
 * Since the array is sorted, if the target value is smaller than the middle value, we know
 * that if the target value is in the array, it must be in its first half. Process is then
 * repeated with the first half, and so on until the value is found, or the remaining half is
 * empty.
 *
 * Binary Search runs in O(logn).
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Tests ===");

        int[] numbers1 = {2, 4, 5};
        System.out.println("Value 4 is at position " +binarySearch(numbers1, 4));

        System.out.println("-----------");
        int[] numbers2 = {2};
        System.out.println("Value 2 is at position " + binarySearch(numbers2, 2));

        System.out.println("-----------");
        System.out.println("Value 122 is at position " + binarySearch(numbers2, 122));

        System.out.println("-----------");
        int[] numbers3 ={-3, 1, 4, 6, 7, 8};
        System.out.println("Value -12 is at position " + binarySearch(numbers3, -12));

        System.out.println("-----------");
        int[] numbers4 ={};
        System.out.println("Value -12 is at position " + binarySearch(numbers4, -12));
    }

    /**
     * @param a Array where value is to be found.
     * @param t Target to find in array.
     * @return Index of target in array or -1 if value is not in the array.
     */
    public static int binarySearch (int[] a, int t) {
        int start = 0;
        int end = a.length - 1;
        int middle;

        while(end - start >= 0) {
            middle =(int)Math.ceil((double)(end + start) / 2);
            if (a[middle] < t) {
                start = middle + 1;
            } else if (a[middle] > t) {
                end = middle - 1;
            } else  {
                return middle;
            }
        }
        return -1;
    }
}
