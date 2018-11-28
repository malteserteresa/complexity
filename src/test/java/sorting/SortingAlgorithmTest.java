package sorting;

import org.junit.Test;

import java.util.Random;

public class SortingAlgorithmTest {


	private final Strategy[] sorting = {new BubbleSort(), new SelectionSort(), new InsertionSort(),
			new MergeSort() };
	private final Strategy algorithm = sorting[0];


	@Test
	public void canSortList() throws Exception {
		int length = 100;
		int[] sortedList = algorithm.sort(generateList(length));

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {

				if (sortedList[i] <= sortedList[j]) {
					continue;
				} else {
					throw new Exception("Not sorted");
				}
			}
		}
	}

	public static int[] generateList(int length) {
		int[] list = new int[length];
		Random rand = new Random();

		for (int n = 0; n < length; n++) {
			list[n] = rand.nextInt(100);
			n++;
		}
		return list;
	}




}
