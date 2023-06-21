package dsa.array;

import java.util.HashSet;
import java.util.Set;

public class FindTwiceElement {
	public boolean findTwiceElement(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean findTwiceElementByMap(int arr[]) {
		Set<Integer> duplicateKey = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(duplicateKey.contains(arr[i])) {
				return true;
			}else {
				duplicateKey.add(arr[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {10,40,20,50,20};
		System.out.println(new FindTwiceElement().findTwiceElement(arr));
		System.out.println(new FindTwiceElement().findTwiceElementByMap(arr));
	}
}
