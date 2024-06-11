package DSAarray;
public class KhadansAlogoMaxSumArray {
    public static int khadans(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(maxsum<sum){
                maxsum=sum;

            }
        }
        return maxsum;
    } 
        public static void main(String[] args) {
        int arr[] = { 9, -6, 4, -2 };
        System.out.println("maxsum is : "+khadans(arr));


    }
}
