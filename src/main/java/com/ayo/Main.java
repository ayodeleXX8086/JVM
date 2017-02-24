package com.ayo;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();
        
		
		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Bohn"));
		records.addCustomer(new Customer("Simon"));
				
		
		
		for (CustomerReadonly next : records.getCustomers().values())
				{
					System.out.println(next);
				}
           //records.iterator().remove();
		
		System.out.println("\n");
		System.out.println("*******************************************");
		System.out.println(records.getCustomers().get("John"));
		System.out.println("\n");
		System.out.println("*******************************************");
		System.out.println(records.getCustomers().get("John"));
		System.out.println("\n");
		System.out.println("*******************************************");
		System.out.println(records.getCustomers().get("John"));
		System.out.println("\n");
		System.out.println("*******************************************");
		for (CustomerReadonly next : records.getCustomers().values())
		{
			System.out.println(next);
		} 
		System.out.println("\n");
		System.out.println("*******************************************");
		System.out.println(records.getCustomer("John"));
		
		
		System.out.println("\n");
		System.out.println("*******************************************");
		for (CustomerReadonly next : records.getCustomers().values())
		{
			System.out.println(next);
		} 
		
		records.getCustomers().remove("John");
		System.out.println(records.getCustomers().values().size());
		records.getCustomers().clear();
		System.out.println(records.getCustomers().values().size());
	}
	
}
