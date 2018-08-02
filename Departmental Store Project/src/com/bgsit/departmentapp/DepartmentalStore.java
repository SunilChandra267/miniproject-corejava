package com.bgsit.departmentapp;

import java.util.Scanner;

public class DepartmentalStore {
	static double cost=0.0;
	public static void main(String[] args) {
		System.out.println("Welcome to BGSIT Store");
		Scanner sc = new Scanner(System.in);
		DepartmentDB db = new DepartmentDB();
		db.addProduct();
		db.displayItems();
		System.out.println("--------------------------------------------");
		while(true)
		{
			System.out.println("Enter\n1:Biscuits\n2:Chocolates");
			System.out.println("3:Ice Cream\n4:Face Wash\n5:Beverages\n6:Total bill");
			System.out.println("Enter any number above 6 to terminate and pay the bill");
			System.out.println("------------------------------------");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(db.db.get(choice-1)==null)
				{
					System.out.println("Biscuits Not Available");
				}
				else
				{
					System.out.println("Enter the quantity");
					int qty=sc.nextInt();
					cost+=db.updateQty(choice, qty);
					db.displayItems();
				}
				break;
			case 2:
				if(db.db.get(choice-1)==null)
				{
					System.out.println("Chocolates Not Available");
				}
				else
				{
					System.out.println("Enter the quantity");
					int qty1=sc.nextInt();
					cost+=db.updateQty(choice, qty1);
					db.displayItems();
				}
				break;
			case 3:
				if(db.db.get(choice-1)==null)
				{
					System.out.println("Ice creams Not Available");
				}
				else
				{
					System.out.println("Enter the quantity");
					int qty2=sc.nextInt();
					cost+=db.updateQty(choice, qty2);
					db.displayItems();
				}
				break;
			case 4:
				if(db.db.get(choice-1)==null)
				{
					System.out.println("Face Wash Not Available");
				}
				else
				{
					System.out.println("Enter the quantity");
					int qty3=sc.nextInt();
					cost+=db.updateQty(choice, qty3);
					db.displayItems();
				}
				break;
			case 5:
				if(db.db.get(choice-1)==null)
				{
					System.out.println("Beverages Not Available");
				}
				else
				{
					System.out.println("Enter the quantity");
					int qty4=sc.nextInt();
					cost+=db.updateQty(choice, qty4);
					db.displayItems();
				}
				break;
			case 6:
				System.out.println("Total bill is:"+cost);
				break;
			default:
				System.out.println("Pay the Bill "+cost+" and Leave the Store");
				System.out.println("Thank you for Shopping");
				System.exit(0);
				break;
			}
		}
	}
}
