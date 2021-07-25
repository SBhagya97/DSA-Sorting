import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while ((j > 0) && (arr[j - 1] > arr[j])) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 5, 8, 2, 4, 9};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
