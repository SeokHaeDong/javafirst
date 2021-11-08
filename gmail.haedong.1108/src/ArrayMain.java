import java.util.Arrays;

public class ArrayMain {
	public static void main(String[] args) {
		//배열을 생성
		String[] soccers = {"반바스텐", "굴리트","리카르도"};
		//데이터 확인 - 디버깅 (세부 데이터 확인 하는 작업)
		//배열운 벓 toString으로 호출 하면 요소의 클래스 이름과 해시코드가 리턴 
		System.out.println(soccers);
		//Arrays 클래스의 toString을 이용하면 배열 각 요소의 toString을 호출
		System.out.println(Arrays.toString(soccers));
		
		//soccers 배열을 복사해서 새로운 배열을 생성 
		// java.util.Arrats 클래스의 copyOf라는 메서드 이용할 수 잇음
		
		String[] copy = Arrays.copyOf(soccers, soccers.length);
		copy[0] = "베르캄프";
		System.out.println(Arrays.toString(copy));
		
//		String[] fill_array = Arrays.fill("null", soccers.length);
		//soccers 의 데이터 정렬 - 정렬 가능 
		//soccers는 String 클래스의 배열인데 Comparable 인터페이스가 구현되어 있
		Arrays.sort(soccers);
		System.out.println(Arrays.toString(soccers));
		
	}
}

