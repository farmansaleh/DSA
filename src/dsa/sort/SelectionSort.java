package dsa.sort;

public class SelectionSort {
	public void ascendingOrder(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public void descendingOrder(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int max = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[max] < arr[j]) {
					max = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {50,30,20,10,40};
		System.out.println("Before sorting array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		new SelectionSort().ascendingOrder(arr);
		System.out.println("\nAfter Ascending Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		new SelectionSort().descendingOrder(arr);
		System.out.println("\nAfter Descending Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
