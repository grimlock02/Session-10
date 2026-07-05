import java.util.ArrayList;
import java.util.Arrays;

public class Comparison {

    public static void main(String[] args) {

        // Data awal
        int[] array = {10, 20, 30, 40, 50};

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // =====================
        // Traversal
        // =====================

        System.out.print("Array Traversal: ");
        ArrayOperations.traversal(array);

        System.out.println("ArrayList Traversal: " + arrayList);

        System.out.println();

        // =====================
        // Search Array
        // =====================

        long startArray = System.nanoTime();

        int arrayIndex =
                ArrayOperations.linearSearch(array, 30);

        long endArray = System.nanoTime();

        // =====================
        // Search ArrayList
        // =====================

        long startList = System.nanoTime();

        int listIndex =
                ArrayListOperations.searchElement(
                        arrayList,
                        30);

        long endList = System.nanoTime();

        System.out.println(
                "Pencarian 30 dalam Array: Ditemukan di indeks "
                        + arrayIndex);

        System.out.println(
                "Pencarian 30 dalam ArrayList: Ditemukan di indeks "
                        + listIndex);

        System.out.println();

        // =====================
        // Insert
        // =====================

        array =
                ArrayOperations.insert(
                        array,
                        25,
                        2);

        arrayList.add(2, 25);

        System.out.println(
                "Array setelah penyisipan elemen 25: "
                        + Arrays.toString(array));

        System.out.println(
                "ArrayList setelah penyisipan elemen 25: "
                        + arrayList);

        System.out.println();

        // =====================
        // Delete
        // =====================

        array =
                ArrayOperations.delete(
                        array,
                        2);

        arrayList.remove(2);

        // =====================
        // Sort
        // =====================

        ArrayListOperations.sortList(arrayList);

        // =====================
        // Time Result
        // =====================

        double arrayTime =
                (endArray - startArray) / 1000000.0;

        double listTime =
                (endList - startList) / 1000000.0;

        System.out.printf(
                "Waktu eksekusi pencarian pada Array: %.6f ms\n",
                arrayTime);

        System.out.printf(
                "Waktu eksekusi pencarian pada ArrayList: %.6f ms\n",
                listTime);
    }
}