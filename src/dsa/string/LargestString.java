package dsa.string;

public class LargestString {
	public String largestString(String fruits[]) {
		String largest = "";
		largest=fruits[0];
		for (int i = 1; i < fruits.length; i++) {
			//fruits[i] == largest : 0
			//fruits[i] > largest : +v
			//fruits[i] < largest : -v
			if(fruits[i].compareTo(largest) > 0) {
				largest = fruits[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		String fruits[] = {"banana","mango","Water Melon"};
		System.out.println("Largest String : "+ new LargestString().largestString(fruits));
	}
}
