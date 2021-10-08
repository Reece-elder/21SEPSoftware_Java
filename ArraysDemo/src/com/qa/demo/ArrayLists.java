package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	
	// ArrayLists are RESIZABLE
	// You can create an array list of 4 items, if you need to add more.. you can add more
	// Uses inbuilt functions to add, remove, update etc.
	
	// They require importing, they add extra data / memory to your project
	
	
	// Create an arrayList as a global variable
	
	public static String[] pizzaListOld = {"pizza", "cheese"};
	
	// ArrayList<DataType>  nameOfArrayList  = new ArrayList<>();
	// Ctrl Shift O
    // import java.util.ArrayList;
	public static ArrayList<String> pizzaList = new ArrayList<>();
	
	public static void arrayListDemo() {
		
		System.out.println(pizzaList);
//		System.out.println(pizzaListOld);
		
		// How can we add items to our arraylist
		// ArrayLists use semantic key words
		
		// ArrayListName.function("whatever you want to pass in")
		pizzaList.add("Meat feast");
		System.out.println(pizzaList);
		
		// Add a pepperoni pizza to my list
		pizzaList.add("Pepperoni");
//		pizzaList.addAll("Four cheese", "other pizza");
		pizzaList.add("Hawaiaan");
		pizzaList.add("Veggie volcano");
		System.out.println(pizzaList);
		
		
		// Make a guess what word to use to remove a pizza
		// arrayList.remove(index number) -> Removes that element
		pizzaList.remove(1);
		System.out.println(pizzaList);
		
		
		// Arraylist.get(index) -> Gets the element
		pizzaList.get(1);
		System.out.println(pizzaList.get(1));
		// WONT WORK BECAUSE NOT AN ARRAY
//		System.out.println(pizzaList[1]);
		
		// length = size()
		// Returns the length/size of an array list
		
		System.out.println(pizzaList.size());
		
		// Set -> Updating elements in our array list
		pizzaList.set(1, "hawaiian");
		System.out.println(pizzaList);
		
		
		System.out.println("==========================");
		pizzaList.add(2, "Calzone");
		System.out.println(pizzaList);
		
		// clear -> Removes EVERYTHING from the arraylist
//		pizzaList.clear();
		System.out.println(pizzaList);
		
		
		// Sorting
		// Collections.sort(arrayList)
		Collections.sort(pizzaList);
		System.out.println(pizzaList);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
