package sorting;

import java.util.ArrayList;

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
