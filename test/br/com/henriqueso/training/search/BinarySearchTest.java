/**
 * 
 */
package br.com.henriqueso.training.search;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author henrique
 * 
 */
public class BinarySearchTest {

    private SearchAlgorithm algorithm = new BinarySearch();

    /**
     * Test case when key exists
     */
    @Test
    public void shouldFindAndReturnTheIndex() {
        /**
         * GIVEN the array of numbers AND key exists into the array at index 4
         */
        int key = 33;
        int[] arr = new int[] { 6, 13, 14, 25, key, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97 };

        /**
         * WHEN searching with binary search algorithm
         */
        int index = algorithm.search(arr, key);

        /**
         * THEN must return index 4
         */
        Assert.assertThat(index, is(4));
    }

    @Test
    public void shouldReturnMinusOneWhenNotFound() {
        /**
         * GIVEN the array of numbers AND key does not exist into the array
         */
        int key = 30;
        int[] arr = new int[] { 6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97 };

        /**
         * WHEN searching with binary search algorithm
         */
        int index = algorithm.search(arr, key);

        /**
         * THEN must return -1
         */
        Assert.assertThat(index, is(-1));
    }

}
