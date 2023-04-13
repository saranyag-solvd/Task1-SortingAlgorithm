import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] a) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++) { // passes
			int flag = 0; // flag for optimization

			for (int j = 0; j < n - 1 - i; j++) { // comparison
				if (a[j] > a[j + 1]) { // swap elements
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;
				}
			}

			if (flag == 0) { // stop if no swap done
				break;
			}

		}

		System.out.println("Sorted Array :" + Arrays.toString(a));

	}

	public static void main(String[] args) {
		int[] a = {99, 10, 3, 8, 16, 9 };
		sort(a);

	}

}