package dsa.array;

public class MaxSubArraySum_BruteForce {
	public int maxSubArraySum_BruteForce(int arr[]) {
		int maxSum=Integer.MIN_VALUE,curSum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				curSum = 0;
				for(int k=i;k<=j;k++) {
					curSum+=arr[k];
				}
				if(curSum > maxSum) {
					maxSum = curSum;
				}
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Max sum of sub array is : "+new MaxSubArraySum_BruteForce().maxSubArraySum_BruteForce(arr));
	}
}
