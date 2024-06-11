package DSAarray;
public class RainTrappedWater {
    public static int trappedwater(int hight[]) {
        int n = hight.length;
        // calculate left max boundary
        int left[] = new int[n];
        left[0] = hight[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(hight[i], left[i - 1]);

        }

        // calculate right most max hight
        int right[] = new int[n];
        right[n - 1] = hight[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(hight[i], right[i + 1]);

        }
        // calculate trapped water
        int trappedwater = 0;
        for (int i = 1; i < n - 1; i++) {
            // water level

            int waterle = Math.min(left[i], right[i]);

            // trraped water
            trappedwater += (waterle - hight[i]);

        }

        return trappedwater;

    }

    public static void main(String[] args) {
        int hight[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedwater(hight));

    }
}
