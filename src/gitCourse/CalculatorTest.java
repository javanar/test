package gitCourse;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int toplam = calc.add(5, 3);

        System.out.println("Toplama: 5 + 3 = " + calc.add(5, 3));
        System.out.println("Çıkarma: 10 - 4 = " + calc.subtract(10, 4));
        System.out.println("Çarpma: 6 * 7 = " + calc.multiply(6, 7));
        System.out.println("Bölme: 20 / 4 = " + calc.divide(20, 4));

        System.out.println("Calculator uygulaması başarıyla çalıştı!");
    }
}
