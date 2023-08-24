package car_dealership;

public class Employee {
	private String name;
	double loanamount;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void handleCustomer(Customer cust1,boolean finance, Vehicles vehicle) {
		if(finance==true) {
			loanamount = vehicle.getPrice()- cust1.getCashOnhand(); 
			runCreditHistory(cust1, loanamount);
		}
		else if(vehicle.getPrice()<= cust1.getCashOnhand()) {
			processTransaction(cust1,vehicle);
		}
		else{
			System.out.println("Bring more money to purchase "+ vehicle.getName());
		}
	}


	public void processTransaction(Customer cust1, Vehicles vehicle) {
 	
		System.out.println("Customer purchased the vehicle for price "+ vehicle);
	}

	
	public void runCreditHistory(Customer cust1, double amount2) {
		System.out.println("Ran Credit history for Customer");
		
		System.out.println("Customer has been approved to purchase the car");
//		System.out.println(vehicle.getName()+"Purcased by the"+ cust1.getName() +"at a price of"+ vehicle.getPrice());		
	}
	
}
