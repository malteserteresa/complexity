package sorting;

/**
 * Implementation of the Merge sort algorithm
 *
 * Steps in Merge sort
 * 1) Divide the arrays into halves until they are at their smallest
 * 2) Iteratively merge these back together in order
 *
 */
public class MergeSort extends Strategy {

	private static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0;
		for (int k = 0; k < c.length; k++) {
			if (i >= a.length)
				c[k] = b[j++];
			else if (j >= b.length)
				c[k] = a[i++];
			else if (a[i] <= b[j])
				c[k] = a[i++];
			else
				c[k] = b[j++];
		}
		return c;
	}

	@Override
	public int[] sort(int[] listToSort) {
		int N = listToSort.length;
		if (N <= 1)
			return listToSort;
		int[] a = new int[N / 2];
		int[] b = new int[N - N / 2];
		for (int i = 0; i < a.length; i++)
			a[i] = listToSort[i];
		for (int i = 0; i < b.length; i++)
			b[i] = listToSort[i + N / 2];
		return merge(sort(a), sort(b));
	}

}
