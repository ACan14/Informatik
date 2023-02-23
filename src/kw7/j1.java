package kw7;

public class j1 {

	public static int[] z;

	public static void main(String[] args) {

		int[] a = { 3, 1, 5, 6, 7, 0, 5 };

		z = a;

		qsort(1, 2);

		// int[] b = BubbleSort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(z[i]);
		}

	}

	public static int[] SelectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}

		return arr;

	}

	public static int[] insertionSort(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int h = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > h) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = h;
		}

		return arr;

	}

	public static int[] BubbleSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;

	}

	public static void qsort(int l, int r) {

		if (r > l) {
			int v = z[r];
			int i = l - 1;
			int j = r;
			int t = 0;

			do {
				do {
					i = i + 1;
				} while (z[i] < v);

				do {
					j = j - 1;
				} while (z[j] > v && j != 0);

				t = z[i];
				z[i] = z[j];
				z[j] = t;

			} while (j > i);

			z[j] = z[i];
			z[i] = z[r];
			z[r] = t;

			qsort(l, i - 1);
			qsort(i + 1, r);

		}

	}

}
