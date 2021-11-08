import java.util.TreeSet;

public class SetMain {
	public static void main(String[] args) {
		//Set은 중복된 데이터를 저장하지 않음
		//TreeSet은 순차적으로 접근하면 데이터를 크리 순서대로 리턴
		TreeSet<String> songs = new TreeSet<>();
		songs.add("VVS");
		songs.add("VVS");
		songs.add("run!");
		songs.add("~~~~1");
		songs.add("~~~~2");
		
		for(String song : songs) {
			System.out.println(song);
		}
		
	}
}
