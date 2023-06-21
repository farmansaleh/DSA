package dsa.array;

public class MaxSubArraySum_Kedans {
	public int maxSubArraySum_Kedans(int arr[]) {
		int maxSum = Integer.MIN_VALUE,curSum = 0;
		for(int i=0;i<arr.length;i++) {
			curSum += arr[i];
			if(curSum < 0) {
				curSum = 0;
			}
			maxSum = Math.max(maxSum, curSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,-40,40,50};//{-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Max Sub Array Sum is : "+new MaxSubArraySum_Kedans().maxSubArraySum_Kedans(arr));
	}
}
