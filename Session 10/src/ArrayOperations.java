public class ArrayOperations {

    // Traversal
    public static void traversal(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Linear Search
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // Insert
    public static int[] insert(int[] arr, int value, int position) {

        int[] newArray = new int[arr.length + 1];

        System.arraycopy(arr, 0, newArray, 0, position);

        newArray[position] = value;

        System.arraycopy(
                arr,
                position,
                newArray,
                position + 1,
                arr.length - position);

        return newArray;
    }

    // Delete
    public static int[] delete(int[] arr, int position) {

        int[] newArray = new int[arr.length - 1];

        System.arraycopy(arr, 0, newArray, 0, position);

        System.arraycopy(
                arr,
                position + 1,
                newArray,
                position,
                arr.length - position - 1);

        return newArray;
    }
}