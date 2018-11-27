package sorting;

public class SortingAlgorithm {

	private Strategy strategy;
	private int[] listToSort;

	public SortingAlgorithm(Strategy strategy, int[] listToSort) {
		this.strategy = strategy;
		this.listToSort = listToSort;
	}

	public int[] sort() {
		return strategy.sort(listToSort);
	}
}
