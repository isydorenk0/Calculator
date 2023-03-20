
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
        int a, b, action;
        float result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть перше число");
        a = scanner.nextInt();
        System.out.println("Ведіть друге число число");
        b= scanner.nextInt();
        System.out.println("Ведіть знак операції \n1 - додати \n2 - відняти \n3 - помножити \n4 - поділити");
        action = scanner.nextInt();


        switch (action) {
            case 1 -> result=fAdd(a, b);
            case 2 -> result=fSub(a, b);
            case 3 -> result=fMul(a, b);
            case 4 -> result=fDiv(a, b);
            default -> System.out.println(" Incorrect operation !!!");
        }
        System.out.println("Результат " + result);

    }
}