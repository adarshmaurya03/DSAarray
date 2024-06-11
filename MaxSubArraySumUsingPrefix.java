package DSAarray;
public class MaxSubArraySumUsingPrefix {

    public static void main(String[] args) {
        int arr[] = { -1, -2, 9, 4 };
        // subArray(arr);
        prifixsum(arr);
    }

    public static void prifixsum(int arr[]) {
        int prifix[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prifix[i] = sum;

        }

        // for(int i=0;i<arr.length;i++){

        // System.out.println(prifix[i]);

        // }
        subArray(prifix);
    }

    public static void subArray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = i == 0 ? arr[j] : arr[j] - arr[i - 1];
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum);
    }

}
