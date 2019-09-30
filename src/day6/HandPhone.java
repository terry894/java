package day6;

public class HandPhone {
	private String productName;
	private String productType;
	private int price;
	private int phoneNumber;
	public HandPhone() {
		
	}
	HandPhone(String productName) {
		this.productName = productName;
	}
	HandPhone(String productName, String productType) {
		this.productName = productName;
		this.productType = productType;
	}
	HandPhone(String productName, String productType, int price) {
		this.productName = productName;
		this.productType = productType;
		this.price = price;
	}
	HandPhone(String productName, String productType, int price, int phoneNumber) {
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.phoneNumber = phoneNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
