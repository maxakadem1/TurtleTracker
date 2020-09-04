public class TestDateTime{
	
	public static void main(String[] args){
		
		TestDate();
		TestTime();

	}

	public static void TestTime(){
		System.out.println("\nTest our Time class to make sure the comparisons are working");

		TimeData time = new TimeData(15, 56, 17);
		
		// equals time 1
		TimeData time2 = new TimeData(15, 56, 17); // Equal

		// more then time 1
		TimeData time3 = new TimeData(16, 56, 17); // hour larger
		TimeData time4 = new TimeData(15, 57, 17); // minutes larger
		TimeData time5 = new TimeData(15, 56, 18); // seconds larger

		// less then time1
		TimeData time6 = new TimeData(1, 56, 17); // hours smaller
		TimeData time7 = new TimeData(15, 54, 17); // minutes smaller
		TimeData time8 = new TimeData(15, 56, 16); // seconds smaller

		testCompareTime(time, time2);
		testCompareTime(time, time3);
		testCompareTime(time, time4);
		testCompareTime(time, time5);
		testCompareTime(time, time6);
		testCompareTime(time, time7);
		testCompareTime(time, time8);
	}

	public static void testCompareTime(TimeData d1, TimeData d2){
		int comparison = d1.compareTo(d2);
		if( comparison == 0 ){
			System.out.println(d1.toString() + " equals " + d2.toString());
		}else if( comparison < 0){
			System.out.println(d1.toString() + " is less then " + d2.toString());
		}else{
			System.out.println(d1.toString() + " is greater then " + d2.toString());

		}
	}

	public static void TestDate(){
		System.out.println("\nTest our Date class to make sure the comparisons are working");

		DateData date1 = new DateData(1234, 56, 78);
		
		// equals date 1
		DateData date2 = new DateData(1234, 56, 78); // Equal

		// more then date 1
		DateData date3 = new DateData(1235, 56, 78); // year larger
		DateData date4 = new DateData(1234, 57, 78); // month larger
		DateData date5 = new DateData(1234, 56, 79); // day larger

		// less then date1
		DateData date6 = new DateData(1233, 56, 78); // year smaller
		DateData date7 = new DateData(1234, 54, 78); // month smaller
		DateData date8 = new DateData(1234, 56, 71); // day smaller

		testCompareDate(date1, date2);
		testCompareDate(date1, date3);
		testCompareDate(date1, date4);
		testCompareDate(date1, date5);
		testCompareDate(date1, date6);
		testCompareDate(date1, date7);
		testCompareDate(date1, date8);
	}

	public static void testCompareDate(DateData d1, DateData d2){
		int comparison = d1.compareTo(d2);
		if( comparison == 0 ){
			System.out.println(d1.toString() + " equals " + d2.toString());
		}else if( comparison < 0){
			System.out.println(d1.toString() + " is less then " + d2.toString());
		}else{
			System.out.println(d1.toString() + " is greater then " + d2.toString());

		}
	}
}