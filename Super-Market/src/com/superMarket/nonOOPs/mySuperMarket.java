package com.superMarket.nonOOPs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;



public class mySuperMarket {

	
	
	public product Product; // PRODUCT CLASS VARIABLE
	
	ArrayList<product> stocks; // ARRAY LIST FOR STORE PRODUCT OBJECTS AS A STOCK
	LinkedHashMap<String, Integer> shelf; // LINKED HASH MAP FOR STORE SHELF STORAGE MAPPING

//###################------------------------ DEFUALT CONSTRUCTOR FOR INITIALIZATION  ---------------------------############################
	
	public mySuperMarket() {
		stocks = new ArrayList<>();
		shelf = new LinkedHashMap<>();
	}
	
//###################------------XXX------------ DEFUALT CONSTRUCTOR FOR INITIALIZATION  -------------XXX--------------############################

	
//###################------------------------ ADD PRODUCT DETAILS IN ARRAY LIST  ---------------------------############################
	
	
	public void addProduct(int Id, String Name, int Price, int quantity, String description, String type) {
		Product = new product(Id, Name, Price, quantity, description, type);
		
		stocks.add(Product);
		shelf.put(type, shelf.getOrDefault(type, 0) + quantity);
		
		
		System.out.println("Product added...");
	}
	
	
//###################----------XXX------------- ADD PRODUCT DETAILS IN ARRAY LIST  ---------------XXX------------############################
	
	
//###################------------------------ INPUT PRODUCT DETAILS METHOD ---------------------------############################
	
	
	public void inputValue(Scanner sc, BufferedReader br) throws Exception {
		System.out.print("Enter Product id : ");
		int id = sc.nextInt();
		System.out.println("Enter Product name : ");
		String name = br.readLine();
		System.out.println("Enter Product Price : ");
		int price = sc.nextInt();
		System.out.println("Enter Product Quantity : ");
		int quantity = sc.nextInt();
		System.out.println("Enter Product Description : ");
		String description = br.readLine();
		System.out.println("Enter Product Type : ");
		String type = br.readLine();
		
		addProduct(id, name, price, quantity, description, type);
		
	}

	
	
//###################-----------XXX------------- INPUT PRODUCT DETAILS METHOD ---------------XXX------------############################
	
	
	
//###################------------------------ DELETE PRODUCT METHOD ---------------------------############################
	
	
	public void deleteProduct(int id) {
		int size = stocks.size();
		int index=0;
		boolean found = false;
		String typeTemp = "";
		int quantityTemp = 0;
		for(int i=0; i<size; i++) {
			product temp = stocks.get(i);
			
			int proID = temp.getProductId();
			
			if(proID == id) {
				found = true;
				index = i;
				typeTemp = temp.getProductType();
				quantityTemp = temp.getProductQuantity();
				break;
			}
		}
		
		if(found) {
			stocks.remove(index);
			shelf.put(typeTemp, shelf.getOrDefault(typeTemp, 0) - quantityTemp);
			System.out.println("Product deleted...");
		}
		else {
			System.out.println("Product not found :(");
		}
	}
	
//###################-----------XXX------------- DELETE PRODUCT METHOD -------------XXX--------------############################

	
	
//###################-----------XXX------------- SHELF PRINT METHOD -------------XXX--------------############################

	public void shelfPrint() {
		for(String x : shelf.keySet()) {
			if(shelf.get(x) != 0) {
				System.out.println("Shelf Product type is '" + x.toUpperCase() + "' and Quantity is " + shelf.get(x));
			}
		}
	}

//###################-----------XXX------------- SHELF PRINT METHOD -------------XXX--------------############################	
	
	
	
//#################------------------ FIND PRODUCT --------------------#####################
	
	
	public void findProduct(int id) {
		int index = 0;
		boolean found = false;
		for(int i=0; i<stocks.size(); i++) {
			product temp = stocks.get(i);
			
			int proID = temp.getProductId();
			
			if(proID == id) {
				found = true;
				index = i;
				break;
			}
			
		}
		if(found) {
			product temp = stocks.get(index);
			
			System.out.println(temp.getProductId());
			System.out.println(temp.getProductName());
			System.out.println(temp.getProductQuantity() + "\n" + temp.getProductPrice() + "\n" + temp.getProductDescription());
			
		}
		else {
			System.out.println("Product Not Found");
		}
		
	}
	
//#################--------XXX---------- FIND PRODUCT ---------XXX-----------#####################

	
//############################------------- Main Method ------------------##################################	
	
	public static void main(String[] args) throws Exception{
		mySuperMarket obj = new mySuperMarket();
		
		obj.addProduct(1, "cocnut oil", 100, 3, "parachute oil", "oil");
		obj.addProduct(2, "fan", 1200, 1, "Bajaj","eletrical");
		obj.addProduct(3, "maggi", 12, 5, "nastle", "goods");
		obj.addProduct(4, "jhandubam oil", 100, 3, "xyz oil", "oil");
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("Welcome To Our Super Mart Management System");
			System.out.println("Enter 1 for add product : ");
			System.out.println("Enter 2 for print type of product are available and Stocks : ");
			System.out.println("Enter 3 for delete any entry : ");
			System.out.println("Enter 4 for find Product by id : ");
//			System.out.println("Enter 5 for find shelf location : ");
			System.out.println("Enter 'exit' to stop aplication : ");
			
			String ch = br.readLine();
			
			switch(ch) {
			
				case "1":
					obj.inputValue(sc, br);
					break;
					
				case "2":
					obj.shelfPrint();
					break;
					
				case "3":
					System.out.print("Enter Product id : ");
					int deleteElement = sc.nextInt();
					
					obj.deleteProduct(deleteElement);
					break;
					
				case "4":
					System.out.print("Enter Product id : ");
					int findElement = sc.nextInt();
					
					obj.findProduct(findElement);
					break;
					
//				case "5":
//					
//					break;
				case "exit":
					System.out.println("Thank You for Using ( Product Created by 'Khatroke khiladi Group' )");
					break;
				default:
					System.out.println("Sorry Wrong input");
			}
			
		}
		
	}
	
//##########################-------XXX------ Main Method -------XXX-------####################################
}




