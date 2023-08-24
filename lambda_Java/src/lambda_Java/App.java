package lambda_Java;

public class App  {

	public static void main(String[] args) {
		Human tom = new Human();
//		walker(tom);
		Robot wally =new Robot();
//		walker(wally);
		
		
		walker(() -> System.out.println("Custom object is walking... "));
		Walkable aBlockOfCode = () -> {
			System.out.println("Custom object waiting.... ");
			System.out.println("The object is tripped");};
	
	
	
	walker(aBlockOfCode);

	ALambdaInterface hellovar = ()-> System.out.println("Hello world");
	
	Calculate sumvar = (a,b)->  a+b;
	hellovar.someMethod();
	System.out.println(sumvar.compute(4, 6));
	
	
	Calculate nonZeroDivider = (a,b)->{
		if(a==0) {
			return 0;
		}
		return a/b;
	};
System.out.println(nonZeroDivider.compute(10, 5));

	myGenericInterface<String> reversestr = (str)->{
		String result="";
		for(int i= str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		return result;
	};
	System.out.println(reversestr.work("vehicle"));
	
	myGenericInterface<Integer>  factorial =(a) -> {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact= i*fact;
		}
		
		return fact;
	};
	System.out.println(factorial.work(5));
}
	
	public void sayHello() {
		System.out.println("Hello world");
	}
	
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int nonzerodivide(int arg1,int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1/arg2;	
	}
	
	
	public String reverse(String str) {
		String result="";
		for(int i= str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		return result;
	}
	
	public static void walker(Walkable walkableEntity ) {
		walkableEntity.walk();
		
	}
	
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact= i*fact;
		}
		return fact;
	}
}


 interface Calculate{
	public int compute(int a,int b);
}

interface myGenericInterface<T>{
	public T work(T t);
}

interface Numberworker{
	public int work(int a);
	

}
