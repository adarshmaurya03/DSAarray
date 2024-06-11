package DSAarray;
// public class MaxSubArraySum {

//     public static void subArray(int arr[]) {

       
//         int maxsum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//              int sum = 0;
//             for (int j = i + 1; j < arr.length; j++) {
//                 // sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum = sum + arr[k];
//                 }
//                 if (sum > maxsum) {
//                     maxsum = sum;
//                 }
//             }
//         }
//         System.out.println("max subarray sum : " + maxsum);
//     }

//     public static void main(String[] args) {
//         int arr[] = { -1, -2, 9, -4 };
//         subArray(arr);
//     }
// }


public class MaxSubArraySum {

    public static void subArray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println("max subarray sum : " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2,- 9, -4 };
        subArray(arr);
    }
}
