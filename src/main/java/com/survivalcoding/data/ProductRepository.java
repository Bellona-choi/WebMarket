package com.survivalcoding.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.survivalcoding.domain.model.Product;



public class ProductRepository{
	private List<Product> products = new ArrayList<>();
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
        phone.setDescription("4.7-inch, 1334x750 Retina HD display");
        phone.setCategory("Smart Phone");
        phone.setManufacturer("Apple");
        phone.setUnitsInStock(1000);
        phone.setCondition("New");

        Product notebook = new Product("P1235", "LG PC 그램", 1500000);
        notebook.setDescription("!4.7-inch, 1334x750 Retina HD display");
        notebook.setCategory("!Smart Phone");
        notebook.setManufacturer("!Apple");
        notebook.setUnitsInStock(1000);
        notebook.setCondition("Refubished");

        Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
        tablet.setDescription("?4.7-inch, 1334x750 Retina HD display");
        tablet.setCategory("?Smart Phone");
        tablet.setManufacturer("?Apple");
        tablet.setUnitsInStock(1000);
        tablet.setCondition("Old");

        products.add(phone);
        products.add(notebook);
        products.add(tablet);
	}
	//다형성
	//public static void main(String[] args) {
		// 삽입, 삭제가 빈번할 때 항상 동일 성능, 하지만 ArrayList보다 검색이 느리다.
		// 메모리 좀더 많이 차지한다.
		//List<Product> products = new LinkedList<>();
		
		// 크기가 커질수록 십입, 삭제가 느려짐, 내부적으로 배열이라 성능이 빠르다.
		//List<Product> products2 = new ArrayList<>();
		
		
	//}
	//public static ArrayList<Product> sort(List<Product> products){
		//return new ArrayList<>();
	//}
	public List<Product> getAllProducts() {
        return products;
    }
}