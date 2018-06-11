package myArrayList.driver;

import myArrayList.MyArrayList;

public class Driver{

	public static void main(String[] args) {
		System.out.println("Hi");
		MyArrayList myArrayList = new MyArrayList();
		System.out.println("Array : " + myArrayList.toString());
		System.out.println("Size : " + myArrayList.size());
		System.out.println("Sum : " + myArrayList.sum());
		myArrayList.insertSorted(10);
		myArrayList.insertSorted(5);
		myArrayList.insertSorted(7);
		myArrayList.insertSorted(7);
		System.out.println("Array : " + myArrayList.toString());
		System.out.println("Size : " + myArrayList.size());
		System.out.println("Sum : " + myArrayList.sum());
		myArrayList.removeValue(7);
		System.out.println("Array : " + myArrayList.toString());
		System.out.println("Size : " + myArrayList.size());
		System.out.println("Sum : " + myArrayList.sum());
		System.out.println("Bye");
	}
	
}