public class Ascending {
    public static void main(String[] args) {
        // write your code here
        int num[]={31,23,43,10,28};


        for(int i = 0;i< num.length-1;i++){//outer loop for passes
            int flag=0;
            for(int j=0;j<num.length-1-i;j++){//inner loop  for sort
                if(num[j]<num[j+1]){
                    int temp;
                    temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                    flag=flag+1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
