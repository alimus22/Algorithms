public class Main {

    public static void main(String[] args) {

        System.out.println("Unit tests");

        int[] numbers = {2, 6, 1, -3, 12, 23};
        printArray(bubbleSort(numbers));

        int[] a = {1};
        printArray(bubbleSort(a));

        int[] b = {};
        printArray(bubbleSort(b));

        int[] d = {1, 1, 1, 1};
        printArray(d);
    }


    public static int[] bubbleSort(int[] a) {
        boolean swapped;
        int n = a.length;

        do {
           swapped = false;

           for(int i = 1; i < n - 1; i++) {
               if(a[i - 1] > a[i]) { //if pair is not ordered
                  swap(a, i - 1, i);
                  swapped = true;
               }
           }
        } while (swapped);

        return a;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int[] a) {
        StringBuilder str = new StringBuilder("[");
        for(int i: a) {
            str.append(i).append(" ");
        }
        str.append("]");
        System.out.println(str);
    }
}
