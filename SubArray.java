package DSAarray;
public class SubArray {
   public static void subArray(int arr[]){
    int tsb=0;
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        tsb++;
        for(int j=i+1;j<arr.length;j++){
            for(int k=i;k<=j;k++){

            
System.out.print(arr[k]);
// tsb++;
        
    }
System.out.println();
tsb++;}
    // System.out.println();
    }
System.out.println("total subarray : "+tsb);}
   
   public static void main(String[] args) {
    int arr[]={1,2,3,4};
    subArray(arr);
   }
}
