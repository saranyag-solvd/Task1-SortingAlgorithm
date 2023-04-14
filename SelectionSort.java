import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {// passes

			int min = i;
			for (int j = i + 1; j < n; j++) { // find index of minimum value
				if (a[j] < a[min]) {
					min = j;
				}

			}

			if (min != i) { // swap
				swap(a, i, min);
			}
		}

		System.out.println("Sorted Array :" + Arrays.toString(a));

	}

	private static void swap(int[] a, int i, int min) {
		int temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 99, 10, 5, 4, 16, 8, 1, 2 };
		sort(a);
	}

}
