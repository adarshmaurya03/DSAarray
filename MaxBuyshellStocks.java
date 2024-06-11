package DSAarray;
public class MaxBuyshellStocks {
    public static int profit(int arr[]) {
        int buy = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buy < arr[i]) {
                int profit = arr[i] - buy;
                Maxprofit = Math.max(Maxprofit, profit);

            } else {
                buy = arr[i];
            }
        }
        return Maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("maxsum profit  is : " + profit(arr));

    }
}
