package dsa.array;

public class BinarySearch {
	public int binarySearch(int arr[],int key) {
		int start=0,end=arr.length-1;
		while(start <= end) {
			int middle = (start+end) / 2;
			
			if(arr[middle] == key) {
				return middle;
			}else if(arr[middle] > key) {
				end=middle-1;
			}else {
				start=middle+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50},key=20;
		int element = new BinarySearch().binarySearch(arr, key);
		System.out.println(key+" exist at "+element+" index position..");
	}
}
