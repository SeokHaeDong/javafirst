import java.io.IOException;

public class RuntimeMethod {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		try {
			rt.exec("open /Users/haedong/Desktop/Java/Java/1104/1104.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
	}
}
