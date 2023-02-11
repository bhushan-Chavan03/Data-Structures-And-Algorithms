import java.util.Scanner;

class InsertionSort{

    public static void insertionSort(int arr[]){
        int comparisons=0;
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int prev=i-1;
            comparisons++;
            while(prev>=0 && arr[prev]>temp){
                arr[prev+1]=arr[prev];
                prev--;
                comparisons++;
            }
            arr[prev+1]=temp;
    }
    System.out.println("No, of comparisons is "+comparisons);

}
    public static void main(String []args){
       int arr[]={3,2,4,1,5};

       insertionSort(arr);

            for(int k=0;k<5;k++){
                System.out.print(arr[k]+" ");
            }

        }
       

        
    }
