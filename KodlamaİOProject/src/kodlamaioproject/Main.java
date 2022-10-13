package kodlamaioproject;

import kodlamaioproject.businnes.CustomerManager;
import kodlamaioproject.businnes.MilitaryCreditManager;
import kodlamaioproject.entities.Company;
import kodlamaioproject.entities.Customer;
import kodlamaioproject.entities.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer =new Customer();
		
		customer.setId(1);
		customer.setCity("Ankara");
		
		
		Person person=new Person();
		person.setName("Ahmet");
		person.setSurName("Beyaz");
		person.setNationalIdentity("34564567898");
		
		
		Company company = new Company();
		company.setCompanyName("Kodlama.io");
		company.setTaxNumber("10000");
		company.setId(12);
		
		
		CustomerManager customerManager2 = new CustomerManager(new Customer(),new MilitaryCreditManager());
		customerManager2.giveCredit();
		
		
		

	}

}
