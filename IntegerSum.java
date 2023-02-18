import java.util.Scanner;

class IntegerSum {

    public static void main(String args[]) {
        int a, b, c, d, e, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();
        System.out.println("Enter the fourth number: ");
        d = sc.nextInt();
        System.out.println("Enter the fifth number: ");
        e = sc.nextInt();

        sum = sum(a, b, c, d, e);
        System.out.println("The sum of five numbers a, b, c, d and e is: " + sum);
    }

    public static int sum(int a, int b, int c, int d, int e) {
        int sum = a + b + c + d + e;
        return sum;
    }
}