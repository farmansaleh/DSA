package dsa.sort;

public class CountingSort {
	public void ascendingOrder(int arr[]) {
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			largest = Math.max(largest, arr[i]);
		}
		int count[] = new int[largest+1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int j=0;
		for (int i = 0; i < count.length; i++) {
			while(count[i] > 0) {
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
	}
	public void descendingOrder(int arr[]) {
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			largest = Math.max(largest, arr[i]);
		}
		int count[] = new int[largest+1];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		int j=arr.length-1;
		for (int i = 0; i < count.length; i++) {
			while(count[i] > 0) {
				arr[j] = i;
				j--;
				count[i]--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,1,3,4,7,1,3,1};
		new CountingSort().ascendingOrder(arr);
		System.out.println("---After Ascending Order---");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		new CountingSort().descendingOrder(arr);
		System.out.println("\n\n---After Descending Order---");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
