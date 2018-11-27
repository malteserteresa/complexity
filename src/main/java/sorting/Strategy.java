package sorting;

public abstract class Strategy {

	abstract int[] sort(int[] listToSort);

	public int[] swap(int[] listToSort, int first, int second) {
		int tmp = listToSort[first];
		listToSort[first] = listToSort[second];
		listToSort[second] = tmp;
		return listToSort;
	}
}
