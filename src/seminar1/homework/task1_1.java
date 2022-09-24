package seminar1.homework;

public class task1_1 {
    public static void main(String[] args) {
        System.out.println(divide(10, 2));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("You can't divide by zero!");
        }
        return a / b;
    }
}
