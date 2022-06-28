package ITbank;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TodayReview0628_V7 {

	public static void main(String[] args) {
		Date now = new Date();
		//현재 시스템의 시간으로 객체를 만든다.
		System.out.println(now);
		
		SimpleDateFormat date = new SimpleDateFormat("yyy년 MM월 dd일");
		SimpleDateFormat time = new SimpleDateFormat("a hh시 mm분 ss초");
		
		String strDate = date.format(now);
		String strTime = time.format(now);
		
		System.out.println("Date : " + strDate);
		System.out.println("Time : " + strTime);
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("오늘의 날짜 : "+ year+"년" + month+"월" + day+"일");
		System.out.print("현재시간 : " + hour + "시" + minute+"분" + second+"초");
		
		//이상 0628끝
		

	}

}
