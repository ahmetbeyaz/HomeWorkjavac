package kodlamaioproject.businnes;

import kodlamaioproject.entities.Customer;

public class CustomerManager {

	private Customer customer;
	private  CreditManager creditManager;
	
	
	

	public CustomerManager(Customer customer ,CreditManager creditManager) {
		this.customer = customer;
		this.creditManager=creditManager;
	}
	
	public void save() {
		
		System.out.println("Musteri Kaydedildi");
	}
	
	public void delete() {
		
		System.out.println("Musteri silindi");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		creditManager.save();
		System.out.println("Kredi Verildi");
		
		
	}
	
	
	
	
	
	
}
