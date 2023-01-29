import java.util.Scanner;

class InsertionSort{

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>temp){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=temp;

    }

}
    public static void main(String []args){
       int arr[]={2,4,3,1,5};

       insertionSort(arr);

            for(int k=0;k<5;k++){
                System.out.print(arr[k]+" ");
            }

        }
       

        
    }
