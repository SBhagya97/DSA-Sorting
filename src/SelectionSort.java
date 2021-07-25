
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {60, 15, 23, 40, 55, 10};
        ob.selectionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void selectionSort(int arr[]) {

        int n = arr.length;

        //one by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            //find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }
}
