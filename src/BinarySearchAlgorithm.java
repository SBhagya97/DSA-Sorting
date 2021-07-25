import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    static int size;
    static int myArray[];
    public static void main(String[] args) {
        BinarySearchAlgorithm ob = new BinarySearchAlgorithm();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter array size : ");
        size = input.nextInt(); //initialize array size
        myArray = new int[size]; //assign array size


        if (0 < size){
            System.out.println("Please Enter "+size+" Array Elements :");
            //to iterate array element one by one
            for (int i = 0; i < myArray.length; i++){
                System.out.print("Enter array element "+(i+1)+": ");
                myArray[i] = input.nextInt(); // to asign array value
            }
            Arrays.sort(myArray);//to sort array
            ob.printArray(); //to display array elements
            int n = myArray.length;
            System.out.print("Enter value what you want to search in this array : ");
            int searchValue = input.nextInt(); //initialize search value
            int result = ob.binarySearch(myArray, 0, n - 1, searchValue); //call binary search method
            System.out.println("===================================");
            if (result == -1) {
                System.out.println("Element not present");
            }else {
                System.out.println("Element found at index " + result);
            }
        }else {
            System.out.println("Please enter any integer number greater than 0");
            main(args);
        }
    }

    //implementation of binarySearch method
    int binarySearch(int[] myArray, int first, int last, int searchValue) {
        if (last >= first) {
            int mid = (first + last) / 2;

            if (myArray[mid] == searchValue) {
                return mid;
            }
            if (myArray[mid] > searchValue) {
                return binarySearch(myArray, first, mid - 1, searchValue);
            }
            return binarySearch(myArray, mid + 1, last, searchValue);
        }
        return -1;
    }

    //implementation of print array method
    void printArray(){
        System.out.print("Sorted Array : {");
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i]+", ");
        }
        System.out.println("\b\b}");
    }
}
