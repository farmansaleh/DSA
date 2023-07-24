package dsa._2darray;

public class HM_TransposeMatrix {
	public int[][] transposeMatrix(int matrix[][]){
		int [][]traMatrix = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				traMatrix[j][i] = matrix[i][j];
			}
		}
		return traMatrix;
	}
	public static void print2DArray(int matrix[][]) {
		for (int[] is : matrix) {
			for (int is1 : is) {
				System.out.print(is1+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int matrix[][] = {{10,20},{30,40},{50,60},{70,80}};//{{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("------------------ Before Transpose------------------");
		print2DArray(matrix);
		int transposeMatrix[][] = new HM_TransposeMatrix().transposeMatrix(matrix);
		System.out.println("------------------ Before Transpose------------------");
		print2DArray(transposeMatrix);
	}
}
