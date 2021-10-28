
public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prime(소수): 1과 자기자신으로만 나누어 떨어지는 수
		// 소수 판별 하는 법 : 2부터 자신의 절반이 되는 숫자까지 나누어서 한번도 나누어 떨어지지 않으면 소수
		int su = 11;
		int count = 0;
		for (int i = 2; i <= su / 2; i++) {
			if (su % i == 0) {
				count += 1;
				break;
			}

		}

		if (count == 0) {
			System.out.println("소수");
		}else {
			System.out.println("소수 아님");
		}
		
		
		System.out.println("-------------------------");
		
		boolean flag = true;
		for(int i = 2; i <= su/2+1; i++) {
			//su를 i로 나누었을 때 나누어 떨어지는지(나머지가 0) 확인
			if(su % i == 0) {
				flag = !flag;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("소수");
		}else {
			System.out.println("소수 아님");
		}
	}

}
