package com.survivalcoding.domain.model;

import java.util.Objects;

public class Product extends Object{
	public static void main(String[] args) {
//1. private 멤버 변수
//2. 필요하면 생성자 추가
//3. getter / setter 읽기 전용, 쓰기 전용 을 하기위해 사용
//4. toString() 객체를 String으로 재정의(디버깅 용도로 확인)
//5. 필요하면  equals / hashCode 재정의(오버라이드)
		Product product = new Product("33", "33", 11);
		System.out.println(product);
		
		Product product2 = new Product("33", "33", 11);
		System.out.println(product2);
		
		System.out.println(product == product2);
		
		Object object = new Product("33", "33", 11);//아무거나 다 받아서 부여하겠다(다형성)
	}
	
	private String id;
	private String name;
	private int unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private String condition;
	public Product(String id, String name, int unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInStock=" + unitsInStock
				+ ", condition=" + condition + "]";
	}

}