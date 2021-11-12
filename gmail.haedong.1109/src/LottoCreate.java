import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoCreate {
	public static void main(String[] args) {
		//핸덤한 1 ~ 45까지의 숫자 6개를 저장해서 순서대로 출력
		// 6개의 중복되지 않은 데이터를 저장하기에 가장 알맞는 자료구조를 생성
		// 배열, List, Set, Map 중에서 선택
		
		//배열이나 List는 데이터 중복을 허용하기에 중복되지 않게 하려면 중복 검사를 직접수행해서 저장 여부 결정
		
		//Set은 데이터의 중복을 허용하지 않음
		//HashSet(무작위 저장)
		//LinkedHashSet(저장할 때의 순서 기)
		//TreeSet(크기를 기억)
		
		Set<Integer> lotto = new TreeSet<>();
		Random rd = new Random();
		while(lotto.size() < 6) {
			//1부터 45사이의 랜덤한 숫자를 Set에 추가
			//동일한 숫자가 있으면 추가되지 않
			lotto.add(rd.nextInt(45) + 1);
		}
		//데이터를 순회하면서 출력 
		for(Integer su : lotto) {
			System.out.println(su);
		}
		
		
	}
}
