

class QuickSort {
    
    public static void quickSort(int arr[],int l,int h){
           if(l<h){
               int pivot=partition(arr,l,h);
               //calling by recurssion
               quickSort(arr,l,pivot-1);
               quickSort(arr,pivot+1,h);
               
           }
       }
       
       public static int partition(int arr[],int l,int h){
           int pivot=arr[l];
           int i=l;
           int j=h;
           
           while(i<j){
            //finding indices and dividing elements as smaller elements than pivot on left side and larger element than pivot on right side
               while(i<=j && arr[i]<=pivot) i++;
               while(arr[j]>pivot) j--;
               if(i<j){
                //swap 
                   int temp;
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
               
               
           }
           int temp;
           //swapping pivot at its original place
                   temp=arr[j];
                   arr[j]=arr[l];
                   arr[l]=temp;
                   return j;
       }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5};
        quickSort(arr,0,4);
        
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}