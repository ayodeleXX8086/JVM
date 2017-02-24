package com.ayo;

public class Customer implements CustomerReadonly {
	private String name;

	/* (non-Javadoc)
	 * @see com.ayo.CustomerReadonly#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(Customer oldCustomer) {
		this.name = oldCustomer.name;
	}
	
		public String toString() {
		return name;
	}
		public void setName(String name){
			this.name=name;
		}
	
}