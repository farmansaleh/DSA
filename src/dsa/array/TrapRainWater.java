package dsa.array;

public class TrapRainWater {
	public int trapRainWater(int height[]) {
		
		int n = height.length,trappedWater=0;
		//calculate left and right max boundery
		int[] leftMax = new int[n],rightMax = new int[n];
		
		leftMax[0] = height[0];
		for(int i=1;i<n;i++) {
			leftMax[i] = Math.max(leftMax[i-1], height[i]);
		}
		
		rightMax[n-1] = height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], height[i]);
		}
		
		for(int i=0;i<n;i++) {
			trappedWater += (Math.min(leftMax[i], rightMax[i]) - height[i]);
		}
		
		return trappedWater;
	}
	public int trapRainWater1(int height[]) {
		int n = height.length;
		int res = 0, l=0, r=n-1;
		int rMax = height[r],lMax = height[l];
		
		while(l < r) {
			if(lMax < rMax) {
				l++;
				lMax = Math.max(lMax, height[l]);
				res += lMax - height[l];
			}else {
				r--;
				rMax = Math.max(rMax, height[r]);
				res += rMax - height[r];
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		int height[] = {4,6,0,4,2,5};//{0,1,0,2,1,0,1,3,2,1,2,1}=6;{4,2,0,3,2,5}=9;{7,6,4,3,1}=0;{1,3,5,6,7}=0;
		System.out.println("Total Trapped Water : "+new TrapRainWater().trapRainWater(height));
		System.out.println("Total Trapped Water : "+new TrapRainWater().trapRainWater1(height));
	}
}
