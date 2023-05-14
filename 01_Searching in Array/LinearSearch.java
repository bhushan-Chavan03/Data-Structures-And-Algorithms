public class LinearSearch{

    static int count=0;

    public static int search(int arr[],int key){
        
        for(int i=0;i<arr.length-1;i++){
            count++;
            if(arr[i]==key){
                return i;
            }

        }
        
        return -1;
    }
    public static void main(String[]args){

        int arr[]={2,4,3,1,5};
        int key=4;

        System.out.println(search(arr, key));
        System.out.println();
        System.out.println(count);

    }
}