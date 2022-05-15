package org.restapi.crud.crud.model;

/**
 * @author Waruna
 *
 */
public class crudmodel {

	private int id;
	private String name;
	private int amount;
	private String address;
	private String payType;
	
	public crudmodel() {
		
	}

	public crudmodel(int id, String name, int amount, String address, String payType) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.address = address;
		this.payType = payType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	

	
	
	
}
