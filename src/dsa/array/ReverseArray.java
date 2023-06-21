package dsa.array;

public class ReverseArray {
	public int[] reverseArray(int arr[]) {
		int first=0,last=arr.length-1;
		while(first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			
			first++;
			last--;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {60,50,40,30,20,10};
		arr = new ReverseArray().reverseArray(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
