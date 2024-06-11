package DSAarray;
// import java.util.*;

public class LargestElement {
    public static int Largest(int largest[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] > large) {
                large = largest[i];

            }
        }
        return large;
    }

    public static int Minimum(int largest[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < largest.length; i++) {
            if (largest[i] < min) {
                min = largest[i];

            }
        }
        return min;
    }

    public static void main(String[] args) {
        int largest[] = { 90, 30, 57, 78 };
        System.out.println("largest value is : " + Largest(largest));
        System.out.println("minimum value  is : " + Minimum(largest));

    }

}
