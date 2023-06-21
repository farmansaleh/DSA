package dsa.array;

public class LargestNdSmallest {
	
	public int smallestElement(int arr[]) {
		int smallestElement = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < smallestElement) {
				smallestElement = arr[i];
			}
		}
		return smallestElement;
	}
	public int largestElement(int arr[]) {
		int largestElement = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largestElement) {
				largestElement = arr[i];
			}
		}
		return largestElement;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		
		LargestNdSmallest largestNdSmallest = new LargestNdSmallest();
		
		int smallest_element = largestNdSmallest.smallestElement(arr);
		System.out.println("Smallest Element is "+smallest_element);
		int largest_element = largestNdSmallest.largestElement(arr);
		System.out.println("Largest Element is "+largest_element);
	}
}
