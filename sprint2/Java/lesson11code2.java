public class Main {
    public static int factorial(int n) {
        int accumulator = 1;
        int i = n;
        while (i > 1) {
            accumulator *= i;
            i--;
        }
        return accumulator;
    }
    
    
    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
