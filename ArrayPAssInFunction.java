package DSAarray;
public class ArrayPAssInFunction {
//Array pass in Any function by referance  

    public static void Update(int m[]) {
        for (int i = 0; i < m.length; i++) {
            m[i] = m[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 12, 45, 67 };
        System.out.println("before calling function ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Update(marks);

        System.out.println("after calling function ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }

    }
}
