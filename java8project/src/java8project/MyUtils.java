package java8project;

public class MyUtils {
	public static String printSomeJunk(String arg) {
		String res= "the string is" + arg;
		return res;
	}
	
	public static void printSomeJunk(int arg) {
		System.out.println(arg);
	}
	
	public static void add2num(int arg1, int arg2) {
		System.out.println(arg1 + arg2);
	}
	
	public static int add10(int arg) {
		int res=arg+10;
		return res;
	}
}
