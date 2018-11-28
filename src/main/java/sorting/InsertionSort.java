package sorting;

import java.util.ArrayList;

/**
 * Implementation of the Insertion sort algorithm
 *
 * Steps in Insertion sort
 * 1) Start at the beginning of the array and compare the first two elements
 * 2) Swap these elements if the second is smaller than the first.
 * 3) These are then in the sorted array
 * 4) Continue to do this
 * 5) Sort new values into sorted array too
 *
 */
public class InsertionSort extends Strategy {

	@Override
	public int[] sort(int[] listToSort) {
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		sortedList.add(listToSort[0]);

		for (int i = 1; i < listToSort.length; i++) {
			// System.out.println("Add new element");
			sortedList.add(listToSort[i]);
			for (int j = 0; j < sortedList.size(); j++) {
				int newly_added_position = sortedList.size() - 1;

				if (sortedList.get(j) > sortedList.get(newly_added_position)) {
					int tmp = sortedList.get(j);
					sortedList.set(j, sortedList.get(newly_added_position));
					sortedList.set(newly_added_position, tmp);
				}

			}
		}
		int[] myArray = sortedList.stream().mapToInt(i -> i).toArray();
		return myArray;
	}

}
