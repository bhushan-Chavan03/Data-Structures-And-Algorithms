import java.util.Scanner;

public class BubbleSort{

    static void bubbleSort(int arr[]){
        int n=arr.length;

        int comparisons=0;
        for(int i=0;i<n-1;i++){
          int flag=0;
            for(int j=0;j<n-1-i;j++){
                comparisons++;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }

                if(flag==0){
                    break;
                }
            }
        }
        System.out.println("NO. of comparisons is:"+ comparisons);
    }


    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String [] args){
        int n;
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        printArray(arr);

       

    }
}