/**
 * 
 */
package br.com.henriqueso.training.search;

/**
 * @author henrique
 * 
 */
public class BinarySearch {

    /**
     * Searches key into array
     * 
     * @param arr
     * @param key
     * 
     * @return index of found element or -1 if not found
     */
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < arr[middle]) {
                high = middle - 1;
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
