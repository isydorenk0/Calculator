import java.util.Scanner;

public class Main {
    static int fAdd(int a, int b) {

        return a + b;
    }

    static int fSub(int a, int b) {

        return a - b;
    }

    static int fMul(int a, int b) {

        return a * b;
    }

    static float fDiv(int a, int b) {
        if (b == 0) {
            System.out.println("Divide by zero !!!");
            return 0;
        }
        return a / b;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}