package chapter5;

public class ForStatementChallengeExercise {
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int sqroot = (int) Math.sqrt(n);
        for (int i = 2; i <= sqroot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }
        int start = 1;
        int stop = 100;
        int count = 0;
        for (int i = start; i <= stop; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count += 1;
            }
            if (count == 3000 || i == stop) {
                System.out.println("We found " + count + " prime numbers");
                break;
            }
        }
    }
}
