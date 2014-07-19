/**
 * 
 */
package br.com.henriqueso.training.search;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.henriqueso.training.sort.BubbleSort;
import br.com.henriqueso.training.sort.SortAlgorithm;

/**
 * @author Henrique
 * 
 */
public class BubbleSortTest {

    private long time;
    private SortAlgorithm algorithm = new BubbleSort();

    @Test
    public void test() {
        /**
         * GIVEN an unsorted array of numbers
         */
        int[] unsortedList = new int[] { 8, 3, 10, 4, 67, 7, 2 };

        /**
         * WHEN sorting the list
         */
        int[] sortedList = algorithm.sort(unsortedList);

        /**
         * THEN sorted list should have the following order: 2, 3, 4, 7, 8, 10, 67
         */
        Assert.assertThat(sortedList, CoreMatchers.is(CoreMatchers.equalTo(new int[] { 2, 3, 4, 7, 8, 10, 67 })));
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        time = System.currentTimeMillis();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        System.out.println((System.currentTimeMillis() - time) / 1000.0 + " milliseconds");
    }

}
