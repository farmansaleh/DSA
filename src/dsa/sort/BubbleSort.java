package dsa.sort;

public class BubbleSort {
	public void ascendingOrder(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-(i+1); j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void descendingOrder(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-(i+1); j++) {
				if(arr[j+1] > arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {50,30,20,10,40};
		System.out.println("Before sorting array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		new BubbleSort().ascendingOrder(arr);
		System.out.println("\nAfter Ascending Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		new BubbleSort().descendingOrder(arr);
		System.out.println("\nAfter Descending Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
