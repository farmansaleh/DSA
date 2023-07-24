package dsa.string;

public class Palindrome {
	public boolean isPalindrome(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "NooN";
		if(new Palindrome().isPalindrome(str)) {
			System.out.println(str+" is Palindrom");
		}else {
			System.out.println(str+" is not Palindrom");
		}
	}
}
