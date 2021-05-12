public class NumMatrix {

	int[][] matrix;

	public NumMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;
		
	

		while (row1 <= row2) {
			int colstart = col1;
			while (colstart <= col2) {
				sum += matrix[row1][colstart];
				colstart++;
			}

			
			row1++;
		}
		
		return sum;

	}

}
