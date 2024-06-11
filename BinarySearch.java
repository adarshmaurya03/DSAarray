package DSAarray;
public class BinarySearch {

    public static int bin(int arr[], int key) {
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (high + low) / 2;
            // int index=-1;
            if (key == arr[mid]) {
                // index=
                return mid;
            } else {
                if (arr[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;

                }
            }

        }

        return -1;
    }


    //using recursion 
    public static int bin(int arr[],int key,int high,int low){
    int mid=(high+low)/2;
    // int index=-1;
    if(key==arr[mid]){
    // index=
    return mid;
    }
    else{
    if(arr[mid]>key){
    high=mid-1;
    }
    else{
    low=mid+1;
    }
    return bin( arr, key, high, low);
    }
    
    }
    public static void main(String[] args) {
        int arr[] = { 12, 23, 37, 45, 56, 67, 78, 89, 90 };
        int key = 78;
        System.out.println(bin(arr, key));
    }

}