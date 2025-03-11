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

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Sıfıra bölünemez");
        }
        return (double) a / b;
    }



    public static int kalanBulma(int bolunen, int bolen) {
        int kalan = bolunen % bolen;
        return kalan;
    }


    public static int ebob(int sayi1, int sayi2) {
        int sayi = 1;
        int min = sayi1 > sayi2 ? sayi2 : sayi1;
        for (int i=0; i<findMinimum(sayi1, sayi2); i++) {
            if(sayi1 % sayi2 == 0) {
                sayi = sayi * i;
            }
        }
        return sayi;
    }

    public static int findMinimum(int... sayilar) {
        int min = Integer.MAX_VALUE;
        for (int sayi : sayilar) {
            if (sayi < min) {
                min = sayi;
            }
        }
        return min;
    }

    // recursion:  öz yineleme recursive methods özyinelemli metodlar
    public void deneme() {
        deneme();
    }

    public int faktoriyel(int sayi) {
        if (sayi <= 1) {
            return 1;
        }
        return sayi * faktoriyel(sayi -1);

    }

    public static void main(String[] args) {
       int sonuc = kalanBulma(10,3);

        System.out.println(2.0);
    }

}
