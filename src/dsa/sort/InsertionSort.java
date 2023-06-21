package dsa.sort;

public class InsertionSort {
	public void ascendingOrder(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i],prev=i-1;
			
			while(prev >= 0 && arr[prev] > curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = curr;
		}
	}
	public void descendingOrder(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i],prev=i-1;
			
			while(prev >= 0 && arr[prev] < curr) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = curr;
		}
	}
	public static void main(String[] args) {
		int arr[] = {50,30,10,20,40};
		System.out.println("After Ascending Order");
		new InsertionSort().ascendingOrder(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new InsertionSort().descendingOrder(arr);
		System.out.println("\nAfter Descending Order");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
