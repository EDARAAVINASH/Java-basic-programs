import java.util.Scanner;

class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        double squareRoot = Math.sqrt(number);

        // Check if the square root is an integer
        if (squareRoot == (int) squareRoot) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
}
