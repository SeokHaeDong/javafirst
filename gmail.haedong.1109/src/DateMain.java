import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {
	public static void main(String[] args) {
		//오늘부터 1986년 5월 5일까지 지나롱 날까 계산 
//		Calendar nowday = new GregorianCalendar();
		Calendar today = Calendar.getInstance();
		
		//1986년 5월 5일 을 Calendar 객체로 생성
		Calendar meetday = new GregorianCalendar(1986, 4, 5);
		
		//epoch time 으로 변환해서 빼기 
		long cha = today.getTimeInMillis() - meetday.getTimeInMillis();
		//초 단위
		long second = cha / 1000;
		//분 단위
		long minute = second / 60;
		//시간 단위 
		long hour = minute / 60;
		//날짜 단위
		long day = hour / 24;
		
		System.out.println(cha);
		System.out.println(second);
		System.out.println(minute);
		System.out.println(hour);
		System.out.println(day);
		
		
		//Calendar를 Date로 변환
		Date date = new Date(today.getTimeInMillis());
		System.out.println(date);
		
		//Date 객체를 가지고 Calendar 변환
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal);
	}
}
