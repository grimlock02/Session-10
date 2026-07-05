import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    // Add
    public static void addElement(ArrayList<Integer> list, int value) {

        list.add(value);

    }

    // Remove
    public static void removeElement(ArrayList<Integer> list, Integer value) {

        list.remove(value);

    }

    // Search
    public static int searchElement(ArrayList<Integer> list, int value) {

        return list.indexOf(value);

    }

    // Sort
    public static void sortList(ArrayList<Integer> list) {

        Collections.sort(list);

    }
}