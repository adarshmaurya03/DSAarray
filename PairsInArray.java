package DSAarray;
public class PairsInArray {
   public static void pairs(int arr[]){
    int tp=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
System.out.print("("+arr[i]+","+arr[j]+")");
tp++;
        }
        System.out.println();
    }
    System.out.println("total pair is : "+tp);
   }
   public static void main(String[] args) {
    int arr[]={1,2,3,4};
    pairs(arr);
   }
}