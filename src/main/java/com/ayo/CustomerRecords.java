package com.ayo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	/* (non-Javadoc)
	 * @see com.ayo.CustomerRecordsReadOnly#getCustomers()
	 */
	
	public Map<String, CustomerReadonly> getCustomers() {
		HashMap<String, CustomerReadonly> unmodifiableMap =new HashMap<String,CustomerReadonly>(records);
		return unmodifiableMap;
	}

	@Override
	public Iterator<Customer> iterator() {
		// TODO Auto-generated method stub
		return records.values().iterator();
	}
	
	public CustomerReadonly getCustomer(String customer){
		return this.records.get(customer);
	}
}

