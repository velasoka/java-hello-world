import java.util.Date;
import java.util.Calendar;
class HelloWorld {
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println("Hi Velmurugan, How are you?");
		System.out.println("What is the day today :"+Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		System.out.println("Welcome to end of main method");
	}
}
