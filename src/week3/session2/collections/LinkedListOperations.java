package week3.session2.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListOperations {

    public static void main(String[] args) {

//        ### Temel Ekleme İşlemleri


        LinkedList<String> programlamaDilleri = new LinkedList<>();

// Liste sonuna eleman ekleme
        programlamaDilleri.add("Java");
        programlamaDilleri.add("Python");

// Belirli bir indexe eleman ekleme
        programlamaDilleri.add(1, "C++");

// Liste başına eleman ekleme
        programlamaDilleri.addFirst("JavaScript");

// Liste sonuna eleman ekleme (alternatif)
        programlamaDilleri.addLast("PHP");

// Çoklu eleman ekleme
        List<String> list = Arrays.asList("Rust", "Go", "Swift");
        programlamaDilleri.addAll(list);

        System.out.println(programlamaDilleri);
// Çıktı: [JavaScript, Java, C++, Python, PHP, Rust, Go, Swift]


//        ### Erişim İşlemleri


        // İlk elemana erişim
        String ilkDil = programlamaDilleri.getFirst();
        System.out.println("İlk dil: " + ilkDil);  // İlk dil: JavaScript

// Son elemana erişim
        String sonDil = programlamaDilleri.getLast();
        System.out.println("Son dil: " + sonDil);  // Son dil: Swift

// Belirli bir indeksteki elemana erişim
        String ucuncuDil = programlamaDilleri.get(2);
        System.out.println("Üçüncü dil: " + ucuncuDil);  // Üçüncü dil: C++

// Eleman arama
        boolean containsJava = programlamaDilleri.contains("Java");
        System.out.println("Java içeriyor mu? " + containsJava);  // Java içeriyor mu? true

// Eleman indeksini bulma
        int index = programlamaDilleri.indexOf("Python");
        System.out.println("Python'un indeksi: " + index);  // Python'un indeksi: 3


//        ### Güncelleme İşlemleri

        // Belirli indeksteki elemanı güncelleme
        programlamaDilleri.set(3, "Python 3");
        System.out.println(programlamaDilleri);


//        ### Silme İşlemleri

        // İlk elemanı silme
        programlamaDilleri.removeFirst();

// Son elemanı silme
        programlamaDilleri.removeLast();

// Belirli bir elemani silme (ilk eşleşme)
        programlamaDilleri.remove("C++");

// Belirli indeksteki elemanı silme
        programlamaDilleri.remove(0);

        System.out.println(programlamaDilleri);
// Çıktı: [JavaScript]

// Tüm elemanları silme
        // programlamaDilleri.clear();
        System.out.println("Liste boş mu? " + programlamaDilleri.isEmpty());
// Çıktı: Liste boş mu? true

//        ### İterasyon İşlemleri

        // For döngüsü ile
        System.out.println("For döngüsü ile:");
        for (int i = 0; i < programlamaDilleri.size(); i++) {
            System.out.println(programlamaDilleri.get(i));
        }

// For-each döngüsü ile
        System.out.println("\nFor-each döngüsü ile:");
        for (String dil : programlamaDilleri) {
            System.out.println(dil);
        }

// Iterator ile
        System.out.println("\nIterator ile:");
        Iterator<String> iterator = programlamaDilleri.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

// ListIterator ile (ileri ve geri gezinme)
        System.out.println("\nListIterator ile (tersten):");
        ListIterator<String> listIterator = programlamaDilleri.listIterator(programlamaDilleri.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


    }

}
