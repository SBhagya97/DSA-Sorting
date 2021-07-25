public class BubbleSort {
    public static void main(String args[]) {
        int myarray[] = {45, 34, 6, 9, 2};
        int n = myarray.length;

        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (myarray[j] > myarray[j + 1]) {
                    int temp = myarray[j];
                    myarray[j] = myarray[j + 1];
                    myarray[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(myarray[i]);

        }

    }
}
