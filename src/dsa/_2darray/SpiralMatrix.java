package dsa._2darray;

public class SpiralMatrix {
	public void spiralMatrix(int matrix[][]) {
		for (int[] is : matrix) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int startCol = 0,startRow = 0,endCol = matrix[0].length-1,endRow = matrix.length-1;
		
		while(startRow <= endRow && startCol <= endCol){
			//Top
			for(int i=startCol;i<=endCol;i++) {
				System.out.print(matrix[startRow][i]+" ");
			}
			
			//Right
			for (int i = startRow+1; i <= endRow; i++) {
				System.out.print(matrix[i][endCol]+" ");
			}
			
			//Bottom
			for (int i = endCol-1; i >= startCol; i--) {
				if(startRow == endRow) {
					break;
				}
				System.out.print(matrix[endRow][i]+" ");
			}
			
			//Left
			for (int i = endRow-1; i >= startRow+1; i--) {
				if(startCol == endCol) {
					break;
				}
				System.out.print(matrix[i][startCol]+" ");
			}
			
			startCol++;
			endCol--;
			startRow++;
			endRow--;
		}
	}
	public static void main(String[] args) {
		int matrix[][] = {{10,11,12,13,14},{15,16,17,18,19},{20,21,22,23,24}};//{{10,20,30},{40,50,60},{70,80,90}};//{{10,20,30,40},{50,60,70,80},{90,10,11,12},{13,14,15,16}};
		new SpiralMatrix().spiralMatrix(matrix);
	}
}
