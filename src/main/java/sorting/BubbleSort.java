package sorting;

/**
 * Implementation of the Bubble sort algorithm
 *
 * Steps in Bubble sort
 * 1) Start at the beginning of the array and compare the first two elements
 * 2) Swap these elements if the second is smaller than the first.
 * 3) Repeat this process until the list is sorted
 *
 */
public class BubbleSort extends Strategy {


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
