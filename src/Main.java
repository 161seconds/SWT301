import MathUtil.MathUtil;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenValidN5RunWells();
        testFactorialGivenValidN6RunWells();
    }

    public static void testFactorialGivenValidN6RunWells() {
        int n = 6;
        long expectedValue = 720;
        long actualValue = MathUtil.getFactorial(6);
        System.out.println("6! = ");
        System.out.println("Expected: " + expectedValue);
        System.out.println("Actual: " + actualValue);
    }

    public static void testFactorialGivenValidN5RunWells() {
        int n = 5;
        long expectedValue = 120;
        long actualValue = MathUtil.getFactorial(5);
        System.out.println("5! = ");
        System.out.println("Expected: " + expectedValue);
        System.out.println("Actual: " + actualValue);
    }
}