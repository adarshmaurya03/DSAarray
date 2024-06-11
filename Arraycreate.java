package DSAarray;

import java.util.*;

class Arraycreate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings to be stored:");
        int n = sc.nextInt();
//

        sc.nextLine(); // Consume the newline left-over

        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your " + (i) + " string element:");
            arr[i] = sc.nextLine();
        }
        
        System.out.println("Your string elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}
