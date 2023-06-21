package dsa.array;

public class MaxSubArraySum_Prefix {
	public int maxSubArraySum(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[arr.length];
		
		prefix[0]=arr[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int curSum = Integer.MIN_VALUE;
				curSum = i==0?prefix[j]:prefix[j]-prefix[i-1];
//				System.out.println(prefix[j]+"["+j+"] - "+(i>0?prefix[i-1]:0)+"["+(i-1)+"] = "+curSum);
				
				if(curSum > maxSum) {
					maxSum = curSum;
				}
			}
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};//{-2,-3,4,-1,-2,1,5,-3};
		System.out.println("Max Sum of Sub Array is : "+new MaxSubArraySum_Prefix().maxSubArraySum(arr));
	} 
}
