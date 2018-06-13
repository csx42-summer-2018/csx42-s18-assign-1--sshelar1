package myArrayList.driver;

import myArrayList.MyArrayList;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;

public class Driver{

	public static void main(String[] args) {
		MyArrayList arrayList = new MyArrayList();
		FileProcessor fileProcessor = new FileProcessor(args[0]);
		String newValue;
		
		if (args.length!=2) {
			System.out.println("Invaid number of arguments");
			System.exit(1);
		}
		
		while ((newValue =  fileProcessor.readLine())!=null) {
			arrayList.insertSorted(Integer.parseInt(newValue));
		}
		Results results = new Results(args[1]);
		String resultString = "The sum of all the values in the array list is: " + arrayList.sum();
		results.writeToFile(resultString);
	}
	
}