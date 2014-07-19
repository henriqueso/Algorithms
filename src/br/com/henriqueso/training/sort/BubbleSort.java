/**
 * 
 */
package br.com.henriqueso.training.sort;

/**
 * Worst case performance: O(n^2) <br>
 * Best case performance: O(n) <br>
 * Average case performance: O(n^2)
 * 
 * @author Henrique
 * 
 */
public class BubbleSort implements SortAlgorithm {

    /*
     * (non-Javadoc)
     * 
     * @see br.com.henriqueso.training.sort.SortAlgorithm#sort(int[])
     */
    @Override
    public int[] sort(int[] list) {
        int index = 0;
        int nextIndex = 0;
        int round = 1;

        for (; round < list.length; round++) {

            for (index = 0; index < list.length - round; index++) {

                nextIndex = index + 1;

                System.out.println("Round " + round + ". Comparing indexes " + index + " and " + nextIndex);

                if (list[index] > list[nextIndex]) {
                    exchangePosition(list, index, nextIndex);
                }

            }

        }

        return list;
    }

    private void exchangePosition(int[] list, int indexA, int indexB) {
        System.out.println("Exchaning " + list[indexA] + " by " + list[indexB]);

        // store the value
        int temp = list[indexA];

        // exchange position
        list[indexA] = list[indexB];
        list[indexB] = temp;
    }

}
