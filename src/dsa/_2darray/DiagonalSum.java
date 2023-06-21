package dsa._2darray;

public class DiagonalSum {
	public int diagonalSum(int matrix[][]) {
		for (int[] is : matrix) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		int sum=0;
		
		//brutforce worst case n0(n^2)
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				if(i==j ) {
//					sum+=matrix[i][j];
//				}else if(i+j == matrix.length-1) {
//					sum+=matrix[i][j];
//				}
//			}
//		}
		
		for(int i=0;i<matrix.length;i++) {
			sum+=matrix[i][i];
			
			if(i+i != i+matrix.length-i-1) {
				sum+=matrix[i][matrix.length-i-1];
			}
		}
		return  sum;
	}
	public static void main(String[] args) {
		int matrix[][] = {{10,20,30},{40,50,60},{70,80,90}};//{{10,20,30,40},{50,60,70,80},{90,10,11,12},{13,14,15,16}};
		int sum = new DiagonalSum().diagonalSum(matrix);
		System.out.println("Diagona Sum : "+sum);
	}
}
