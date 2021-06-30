package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here
        int arr[]={23,11,9,05,15,28};


        for(int i = 0;i< arr.length-1;i++){//outer loop for passes
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){//inner loop  for sort
                if(arr[j]<arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=flag+1;
                }
            }
            if(flag==0){
               break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
