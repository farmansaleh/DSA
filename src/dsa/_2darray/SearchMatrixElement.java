package dsa._2darray;

public class SearchMatrixElement {
	//Array must be sorted
	public boolean searchMatrixElement(int matrix[][],int key) {
		for (int[] is : matrix) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
		
		int row = matrix.length-1,col = 0;
		while(col < matrix.length && row >= 0) {
			
			if(matrix[row][col] == key) {
				System.out.println("\n"+key+" - Key found at ("+row+","+col+") this position");
				return true;
			}
			
			if(key > matrix[row][col]) {
				col++;
			}else {
				row--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int key=48,matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		if(!new SearchMatrixElement().searchMatrixElement(matrix,key)) {
			System.out.println("\n"+key+" - Key not exist in matrix");
		}
	}
}
