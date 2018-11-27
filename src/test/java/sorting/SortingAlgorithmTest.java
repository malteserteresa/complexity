package sorting;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;

import sorting.BubbleSortAlgorithm;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.SelectionSortAlgorithm;
import sorting.SortingAlgorithm;
import sorting.Strategy;
import util.Helper;

public class SortingAlgorithmTest {

	private final int length = 10000000;
	private final int[] initalList = util.Helper.TOOLS.generateListToSort(length);

	Strategy[] sorting = { new BubbleSortAlgorithm(), new SelectionSortAlgorithm(), new InsertionSort(),
			new MergeSort() };

	SortingAlgorithm algorithm = new SortingAlgorithm(sorting[1], initalList);

	@Test
	public void canCreateAlgorithm() {
		assertNotNull(algorithm);
	}

	@Test
	public void canSortList() throws Exception {
		System.out.println(Arrays.toString(initalList));
		int[] sortedList = algorithm.sort();

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {

				if (sortedList[i] <= sortedList[j]) {
					continue;
				} else {
					throw new Exception("Not sorted");
				}
			}
		}
		System.out.println(Arrays.toString(sortedList));
	}

	@Test
	public void timeToExecute() {

		long startTime = System.nanoTime();

		algorithm.sort();

		long endTime = System.nanoTime();

		double duration = (double) (endTime - startTime) / 1000000000;

		System.out.println("This takes " + String.format("%.10f", duration) + " seconds to run");
	}

}
