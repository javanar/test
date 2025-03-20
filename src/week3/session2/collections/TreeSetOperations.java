package week3.session2.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations {

    public static void main(String[] args) {

//        ## TreeSet Oluşturma


        // 1. Boş bir TreeSet oluşturma
        TreeSet<Integer> set1 = new TreeSet<>();

        // 2. Collection'dan TreeSet oluşturma
        Set<Integer> hashSet = Set.of(5, 2, 8, 1, 9, 3);
        TreeSet<Integer> set2 = new TreeSet<>(hashSet);
        System.out.println("Collection'dan: " + set2); // [1, 2, 3, 5, 8, 9] (sıralı)

        // 3. Comparator ile TreeSet oluşturma (ters sıralama)
        TreeSet<Integer> set3 = new TreeSet<>(Comparator.reverseOrder());
        set3.addAll(Set.of(5, 2, 8, 1, 9, 3));
        System.out.println("Ters sıralı: " + set3); // [9, 8, 5, 3, 2, 1]



//        ## TreeSet Temel İşlemleri


        TreeSet<Integer> sayilar = new TreeSet<>();

        // Eleman ekleme
        sayilar.add(50);
        sayilar.add(20);
        sayilar.add(80);
        sayilar.add(10);
        sayilar.add(60);

        System.out.println("TreeSet: " + sayilar); // [10, 20, 50, 60, 80]

        // Eleman içeriyor mu kontrolü
        boolean varMi = sayilar.contains(20);
        System.out.println("20 var mı? " + varMi); // true

        // Eleman silme
        sayilar.remove(20);
        System.out.println("20 silindikten sonra: " + sayilar); // [10, 50, 60, 80]

        // İlk ve son elemanı alma
        System.out.println("İlk eleman: " + sayilar.first()); // 10
        System.out.println("Son eleman: " + sayilar.last()); // 80

        // Boyut ve boşluk kontrolü
        System.out.println("TreeSet boyutu: " + sayilar.size()); // 4
        System.out.println("TreeSet boş mu? " + sayilar.isEmpty()); // false

        // Kümeyi temizleme
        sayilar.clear();
        System.out.println("Temizlendikten sonra boş mu? " + sayilar.isEmpty()); // true

        // Çoklu eleman ekleme
        sayilar.addAll(java.util.Arrays.asList(55, 25, 35, 15, 45));
        System.out.println("Yeni elemanlarla: " + sayilar); // [15, 25, 35, 45, 55]

        // İterasyon
        System.out.println("\nFor-each ile iterasyon:");
        for (Integer sayi : sayilar) {
            System.out.print(sayi + " "); // 15 25 35 45 55
        }

        System.out.println("\n\nIterator ile iterasyon:");
        java.util.Iterator<Integer> iterator = sayilar.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // 15 25 35 45 55
        }

        System.out.println("\n\nDescendingIterator ile ters iterasyon:");
        java.util.Iterator<Integer> descIterator = sayilar.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.print(descIterator.next() + " "); // 55 45 35 25 15
        }
        System.out.println();


//        ## TreeSet'in Navigasyon Metodları


        sayilar = new TreeSet<>();
        sayilar.addAll(java.util.Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));

        System.out.println("TreeSet: " + sayilar); // [10, 20, 30, 40, 50, 60, 70, 80, 90]

        // lower(E e): Verilen elemandan küçük olan en büyük elemanı döndürür
        System.out.println("lower(45): " + sayilar.lower(45)); // 40

        // floor(E e): Verilen elemana eşit veya küçük olan en büyük elemanı döndürür
        System.out.println("floor(40): " + sayilar.floor(40)); // 40
        System.out.println("floor(45): " + sayilar.floor(45)); // 40

        // ceiling(E e): Verilen elemana eşit veya büyük olan en küçük elemanı döndürür
        System.out.println("ceiling(40): " + sayilar.ceiling(40)); // 40
        System.out.println("ceiling(45): " + sayilar.ceiling(45)); // 50

        // higher(E e): Verilen elemandan büyük olan en küçük elemanı döndürür
        System.out.println("higher(40): " + sayilar.higher(40)); // 50

        // pollFirst(): İlk elemanı döndürür ve kümeden siler
        System.out.println("pollFirst(): " + sayilar.pollFirst()); // 10
        System.out.println("pollFirst() sonrası TreeSet: " + sayilar); // [20, 30, 40, 50, 60, 70, 80, 90]

        // pollLast(): Son elemanı döndürür ve kümeden siler
        System.out.println("pollLast(): " + sayilar.pollLast()); // 90
        System.out.println("pollLast() sonrası TreeSet: " + sayilar); // [20, 30, 40, 50, 60, 70, 80]

        // descendingSet(): Ters sıralı bir view döndürür
        System.out.println("descendingSet(): " + sayilar.descendingSet()); // [80, 70, 60, 50, 40, 30, 20]

    }

}
