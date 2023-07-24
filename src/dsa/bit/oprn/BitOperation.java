package dsa.bit.oprn;

public class BitOperation {
	public static void isOddOrEven(int n) {
		int bitmask = 1<<0;//0001
		if((n&bitmask) == 0) { //n(13 : 1101&0001 = (0001) odd 
			System.out.println(n+" is even number!!");
		}else {
			System.out.println(n+" is odd number!!");
		}
	}
	public static void getIthBit(int n,int i) {
		int bitmask = 1 << i; // 1<<1 -- 0010
		
		if((n&bitmask) == 0) { // 10 : 1010&0010 = (0010) 
			System.out.println("0 bit at "+i+" position");
		}else {
			System.out.println("1 bit at "+i+" position");
		}
	}
	public static void setIthBit(int n,int i) {
		int bitmask = 1 << i;
		
		int setBit = (n|bitmask);
		System.out.println("After set 1 bit at "+i+" position is : "+setBit);
	}
	public static int clearIthBit(int n,int i) {
		int bitmask = ~(1 << i);// ~(0010) = 1101
		
		int clearBit = (n&bitmask);  //  1010(10) & 1101 = 1000 (8)
		System.out.println("After clear bit at "+i+" position is : "+clearBit);
		return clearBit;
	}
	public static void updateIthBit(int n,int i,int newBit) {
		int bitmask = newBit << i;
		
		int updateBit = 0;
//		if(newBit == 0) {
//			updateBit = BitOperation.clearIthBit(n, i);
//		}else {
//			updateBit = n | bitmask;
//		}
		n = BitOperation.clearIthBit(n, i);
		updateBit = n|bitmask;
		System.out.println("After update "+newBit+" bit at "+i+" position is : "+updateBit);
	}
	public static void clearLastIBit(int n,int i) {
		int bitmask = ((~0)<<i); //~0/-1(1111)<<2 = 1100
		int clearLastBit = n&bitmask;
		System.out.println("After clear last Ith("+i+") Bit is : "+clearLastBit);
	}
	public static void clearRangeOfBit(int n,int i,int j) {
		int a = ((~0)<<(j+1));
		int b=(1<<i)-1;
		int bitmask = a|b;
		
		int rangeOfBit = n&bitmask;
		System.out.println("After clear range of bit is : "+rangeOfBit);
	}
	public static void main(String[] args) {
		BitOperation.clearRangeOfBit(103, 0, 4);//96
	}
}
