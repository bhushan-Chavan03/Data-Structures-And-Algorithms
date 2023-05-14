import java.util.Scanner;

import javax.naming.ldap.SortControl;

class Main{

     static int binarySearch(int arr[],int key){
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    


     }

    public static void main(String []args){

        int arr[]={2,4,5,3,1};
        System.out.println(binarySearch(arr, 0));

    }

    

        
    }
