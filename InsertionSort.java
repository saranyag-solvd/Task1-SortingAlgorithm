import java.util.Arrays;

public class InsertionSort {
	public static void sort(int[] a) {
		int n = a.length;

		for (int i = 1; i < n; i++) {// unsorted sublist
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp) {// sorted sublist
				a[j + 1] = a[j]; 
				j--;
			}

			a[j + 1] = temp;
		}
		System.out.println("Sorted Array :" + Arrays.toString(a));

	}

	public static void main(String[] args) {
		int[] a = { 99, 1, 5, 6, 10, 8, 2 };
		sort(a);
	}

}
