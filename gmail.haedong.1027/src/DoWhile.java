
public class DoWhile {
	public static void main(String[] args) {
		
		int i = 1;
		do {
			System.out.println("hani" + i + ".jpg");
			i += 1;
			
		}while(i < 4);
		
		System.out.println("============================");
		
		do {
			System.out.println("hani" + (i-2) + ".jpg");
			i -= 1;
		}while(i > 1);
	
	
	}
}
