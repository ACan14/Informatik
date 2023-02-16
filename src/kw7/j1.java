package kw7;

public class j1 {

	public static void main(String[] args) {
		
		int[] a = {3,1,5,6,7,0,5};
		
		int[] b = SelectionSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
		
	}
	
	public static int[] SelectionSort (int arr[]) {
		
		for (int i=0; i< arr.length-1; i++) {
			int min = i;
			
			for (int j=i+1; j<arr.length; j++) {
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
	
	public static int[] insertionSort (int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			int h = arr[i];
			int j = i;
			while (j > 0 && arr[j-1] > h) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = h;
		}
		
		return arr;
		
	}

}
