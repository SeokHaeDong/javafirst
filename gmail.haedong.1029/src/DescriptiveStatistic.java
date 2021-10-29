
public class DescriptiveStatistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 샘플 데이터 생성
		int[] data = { 95, 80, 97, 87, 93 };

		// 데이터의 합계 구하기
		// 합계를 저정할 변수를 생성하고 합계를 구하기 이전의 값으로 초기화
		// 데이터를 순회하면서 데이터를 합꺠를 저장할 변수에 추가
		int data_sum = 0;
		for (int imsi : data) {
			data_sum += imsi;
		}
		System.out.println("합계 : " + data_sum);

		System.out.println("-------------------------------------------------");

		// 평균,중앙값, 최빈값 - 데이터를 대표하는 값
		// 평균을 계산할 때 주의할 점, 나누느 수가 0인지 확인 - 정수를 0으로 나누면 에러
		// 정수 / 정수 = 정수 라는 것을 기억
		// 실수를 0으로 나누면 Infinity, NaN 같은 값이 나온다
		// 평균을 소수 첫째자리 까지 구하기

		if (data.length == 0) {
			System.out.println("데이터가 없음");
		} else {
			// 데이터 중 1개를 실수로 변환해야만 실수로 결과를 만들 수 있음
			double mean = (double) data_sum / data.length;
			System.out.println("평균 : " + mean);
		}

		System.out.println("------------------------------------------");

		// 이후에 최대값과 최솟값 구하는 것을 하고 나면 최대값과 최소값을 제외한 데이터의 평균을 구하시오 - 절사 평

		System.out.println("------------------------------------------");
		// 최대값을 구할때는 최대값을 저정할 변수를 만들어서 데이터의 범위 중 가장 작은 값이 첫번째 데이터의 값으로 초기화를 한다
		// 모든 데이터를 숭회하면서 최대값보다 큰 데이터가 있으면 최대값을 그 값으로 변경한다
		// 데이터는 0 ~ 100의 범위를 갖는 다고 가
		int len = data.length;
		int data_max = data[0];
		int data_min = data[0];

		for (int dummy_data : data) {
			if (dummy_data > data_max) {
				data_max = dummy_data;
			}
			if (dummy_data < data_min) {
				data_min = dummy_data;
			}

		}
		System.out.println("최대값 : " + data_max);

		System.out.println("최소값 : " + data_min);

		System.out.println("------------------------------------------");

		// 최소값이 몉번째에 있는지고 같이 찾을 수 있도록 하기
		// 최소값이 변경될 때 그 때의 인덱스(순번)도 같이 정장해야하 함
		data_min = data[0];
		int min_index = 0;
		for (int i = 0; i < len; i++) {
			if (data[i] < data_min) {
				data_min = data[i];
				min_index = i;
			}
		}

		System.out.println("최소값 : " + data_min);
		System.out.println("최소값의 인덱스 : " + min_index);

		System.out.println("------------------------------------------");

		// 조건에 맞는 데이터의 개수 찾기
		// 데이터 개수를 저장할 변수를 만들어서 개수를 세기 이전의 값으로 초기화 - 대부분 0으로 초기화
		// 모든 데이터를 순회하면서 데이터가 조건에 맞는지 확인 해서 조건에 맞으면 개수를 1증가 시켜주면

		int cnt = 0;
		for (int temp : data) {
			if (temp > 90) {
				cnt = cnt + 1;
			}

		}
		System.out.println("90이 넘는 데이터 수 : " + cnt);

		System.out.println("------------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		int cnt_1 = 0;
		for( int temp : data) {
			if(temp > 90) {
				++cnt_1;
			}
		}
		System.out.println("cnt_1 : " + cnt_1);
		
		

	}

}