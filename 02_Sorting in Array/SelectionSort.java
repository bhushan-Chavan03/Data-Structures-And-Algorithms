public class SelectionSort {

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minNum=i;
            for(int j=i;j<arr.length;j++ ){
                if(arr[j]<arr[minNum]){
                    minNum=j;
                }
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[minNum];
            arr[minNum]=temp;
            System.out.println(arr[i]);
        }
    }

    public static void main(String []args){

        System.out.println();

        int arr[]={3,2,1,4,5};
        selectionSort(arr);

        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
