

package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 	 |_ Car
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 27.
 * <pre>
 *
 * @author : suboum
 * @version : 1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String company, String newModel, String newColor, int newmaxSpeed, int newPrice) {
		this.company = company;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = newmaxSpeed;
		this.price = newPrice;
	}
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, maxSpeed, 0);
	}
	public Car3(String company, String model, String color){
		this(company, model, color, 0);
	}
	
	
// Getter
public String  getCompany(){
	return company;
}

public String  getModel(){
	return model;
}

public String  getColor(){
	return color;
}

public int  getMaxSpeed(){
	return maxSpeed;
}

public int  getPrice(){
	return price;
}
//	// Setter
//	public void  setCompany(String newCompany){
//		company = newCompany;
//	}
//	
//	public void  setModel(String newModel){
//		model = newModel;
//	}
//	
//	public void  setColor(String newColor){
//		color = newColor;
//	}
//	
//	public void  setMaxSpeed(int newMaxSpeed){
//		maxSpeed = newMaxSpeed;
//	}
//	
//	public void  setPrice(int newPrice){
//		price = newPrice;
//	}


}