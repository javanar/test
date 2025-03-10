package gitCourse;

// this is a comment from local repository
// this is a comment from remote repository
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Sıfıra bölünemez");
        }
        return (double) a / b;
    }
}
