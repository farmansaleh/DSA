package dsa._2darray;

public class HM_CountOfNumber {
	public int countOfNumber(int arr[][],int number) {
		int countNumber = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == number) {
					countNumber++;
				}
			}
		}
		return countNumber;
	}
	public static void main(String[] args) {
		int arr[][] = {{4,7,8},{8,8,7}},number=8;
		int count = new HM_CountOfNumber().countOfNumber(arr,number);
		System.out.println(number+" is "+(count>0?count+" times repeat in array":"not exist"+" in array"));
	}
}
