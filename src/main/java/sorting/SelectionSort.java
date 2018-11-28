package sorting;

/**
 * Implementation of the Selection sort algorithm
 *
 * Steps in Selection sort
 * 1) Scan the list until the smallest element is found and
 * 2) Move this element to the beginning of the list
 * 3) Repeat this process until the list is sorted
 *
 */
public class SelectionSort extends Strategy {

	@Override
	public int[] sort(int[] listToSort) {
		for (int i = 0; i < listToSort.length - 1; i++) {
			for (int j = i + 1; j < listToSort.length; j++) {

				if (listToSort[i] > listToSort[j]) {
					listToSort = swap(listToSort, i, j);
				}
			}
		}
		return listToSort;
	}

}
