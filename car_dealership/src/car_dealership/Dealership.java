package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1= new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St");
		cust1.setCashOnhand(12000);
//		System.out.println(cust1.getCashOnhand());
//		Vehicles v1=new Vehicles();
//		v1.setName("wagon");
//		v1.setColour("White");
//		v1.setPrice(12200);
		
		Employee emp=new Employee();
		emp.setName("jack");
		
		
		Customer cust2 = new Customer();
		cust2.setName("larry");
		cust2.setAddress("45 storm street");
		cust2.setCashOnhand(130000);
		
		Vehicles v2 = new Vehicles("lambo", "purple", 45000);
		
		
		cust2.purchaseCar(v2, emp, false);
		
		
		
		      	
		/**
		 * handleCustomer(Customer cust,boolean finance, vehicle vehicle)
		 * if(finanace==true)
		 * 	runCreditHistory(Customer cust, double double Amount)
		 * else if(vehicle getPrice() <= cust,getCastonHand());
		 * 	processTransaction(Customer cust,Vehicle, vehicle)
		 *else:
		 *	tell customer bring more money
		 */
	}

}
