
public class While_2 {
	public static void main(String[] args) {
		//image1, image2, image3를 순서대로 출력
		System.out.println("image1");
		System.out.println("image2");
		System.out.println("image3");
		
		System.out.println("======================");
		int i = 1;
		while (i < 5) {
			System.out.println("image" + ((i-1)*2+1) );
			i += 1; // i = i + 1과 동일함 
			//책들은 Java만 하므로 ++를 사용하지만 , 여러가지 언어를 하므로 공통된 방법을 사용하기 위해서 i = i + 1 사
		}
		
		System.out.println("======================");
		
		// 4, 3, 2, 1
		
		
		while (i > 1) {
			System.out.println("image" + (i-1));
			i -= 1;
		}
		
		System.out.println("======================");
		
		int j = 0;
		while(j < 4) {
			System.out.println("image" + (4-j));
			j += 1;
		}
		
		
	}
}
