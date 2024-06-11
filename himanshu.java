package DSAarray;
public class himanshu {



    public static void main(String[] args) {
        int height = 7;  // Height of the pattern
        int width = 7;   // Width of the pattern

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' in the shape of 'G'
                if ((i == 0 || i == height - 1) && (j > 0 && j < width - 1)) // Top and bottom horizontal lines
                    System.out.print("*");
                else if ((j == 0 || (j == width - 1 && i >= height / 2) || (i == height / 2 && j >= width / 2)) && (i > 0 && i < height - 1)) // Left vertical line, right vertical line from middle, and middle horizontal line
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}




