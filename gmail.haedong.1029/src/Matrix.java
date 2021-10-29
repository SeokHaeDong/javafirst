
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] scores = {{10,20,30}, {40,50,60}};
		
		int rows = scores.length;
		int cols = scores[0].length;
		
		
		//행을 먼저 순회
		for(int i = 0; i < rows; i++) {
			//각 행의 열을 순회
			for(int j = 0; j < cols; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------------");
		
		//열을 먼저 순회
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(scores[j][i] + "\t");
			}
			System.out.println("");
		}
		
		
		
	}

}
