package com.bgsit.departmentapp;

import java.util.ArrayList;

public class DepartmentDB {
	static ArrayList<Items> db= new ArrayList<Items>();

	void addProduct()
	{
		db.add(new Items(1,"Biscuits", 50, 25.00));
		db.add(new Items(2,"Chocolates", 500, 5.00));
		db.add(new Items(3,"Ice Cream", 20, 100.00));
		db.add(new Items(4,"Face Wash", 5, 250.00));
		db.add(new Items(5,"Beverages",60, 50.00));
	}
	void displayItems()
	{
		System.out.println("Name\t\tQuantity\tPrice of Each");
		for (Items items : db) {
			if(items!=null)
				System.out.println(items.name+"\t"+items.quantity+"\t\t"+items.priceOfEach);
		}	
	}
	double updateQty(int index,int qty)
	{ 
		double price=0.0;
		index-=1;
		Items i=db.get(index);
		System.out.println("Available Qty:"+i.quantity);
		if(qty<=i.quantity)
		{
			price=(qty*i.priceOfEach);
			System.out.println("Cost of ur items:"+price);
			i.quantity-=qty;
			if(i.quantity==0)
			{
				System.out.println(i.name+" Not Available");
				db.set(index, null);
			}
			else
			{
				db.set(index, i);
			}
		}
		else
		{
			System.out.println("Entered quantity is not valid");			
		}
		return price;
	}
}
