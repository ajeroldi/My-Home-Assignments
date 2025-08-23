package week1.day2;

public class FibonacciSeries {

    public static void main(String[] args) {
        int numberOfTerms = 8; 
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series up to " + numberOfTerms + " terms:");

        if (numberOfTerms >= 1) {
            System.out.print(firstTerm);
        }
        if (numberOfTerms >= 2) {
            System.out.print(", " + secondTerm);
        }

        for (int i = 2; i < numberOfTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
	
