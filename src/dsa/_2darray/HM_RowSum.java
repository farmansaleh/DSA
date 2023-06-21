package dsa._2darray;

public class HM_RowSum {
	public int sumOfRow(int arr[][],int rowNum) {
		int sum = 0;
		
		if(arr.length < rowNum) {
			return -1;
		}
		
		for (int j = 0; j < arr[rowNum-1].length; j++) {
			sum += arr[rowNum-1][j];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[][] = {{1,4,9},{11,4,3},{2,2,3}},rowNum = 2;
		int sum = new HM_RowSum().sumOfRow(arr, rowNum);
		System.out.println(sum>0?"Sum of "+rowNum+" is "+sum:rowNum+"th row not exist");
	}
}
