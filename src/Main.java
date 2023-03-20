import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operant1, operant2, action, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть перше число");
        operant1 = scanner.nextInt();
        System.out.println("Ведіть друге число число");
        operant2 = scanner.nextInt();
        System.out.println("Ведіть знак операції \n1 - додати \n2 - відняти \n3 - помножити \n4 - поділити");
        action = scanner.nextInt();

        System.out.println("Результат " + result);
    }
}