package assignments;

public class LeapYear {

	public static void main(String[] args) {
		int year=2020;
		int i=year%4;
		if(i==0) {
			System.out.println(year +" is Leap Year");
		}else {
			System.out.println(year +" is not Leap Year");
		}

	}

}
