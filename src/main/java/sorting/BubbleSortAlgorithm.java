package sorting;

public class BubbleSortAlgorithm extends Strategy {
	/*
	 * TODO 1) iterator pattern in parent class?
	 */

	@Override
	public int[] sort(int[] listToSort) {

		for (int i = 0; i < listToSort.length - 1; i++) {
			boolean swapped = false;
			for (int j = i + 1; j < listToSort.length; j++) {

				if (listToSort[i] > listToSort[j]) {
					listToSort = swap(listToSort, i, j);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
		return listToSort;
	}

}
