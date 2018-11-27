package sorting;

public class SelectionSortAlgorithm extends Strategy {

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
