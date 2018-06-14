package myArrayList.test;

import myArrayList.MyArrayList;
import myArrayList.util.Results;

public class MyArrayListTest {
	
	private String resultString=null;
	private Results results = null;
	
	public Results testMe(MyArrayList myArrayList, Results resultsIn) {
		results = resultsIn;
		checkSumOfEmptyArray(myArrayList);
		myArrayList.reset();
		checkSum(myArrayList);
		myArrayList.reset();
		checkSize(myArrayList);
		myArrayList.reset();
		checkIndexOfAbsentValue(myArrayList);
		myArrayList.reset();
		checkPresentValuePosition(myArrayList);
		myArrayList.reset();
		checkRepeatedNumberPosition(myArrayList);
		myArrayList.reset();
		checkInvalidInsert(myArrayList);
		myArrayList.reset();
		checkRemoveValue(myArrayList);
		myArrayList.reset();
		checkResizing(myArrayList);
		myArrayList.reset();
		checkSumAfterResizing(myArrayList);
		return results;
		
	}

	private void checkSumAfterResizing(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 61; i++) {
			myArrayList.insertSorted(i);
		}
		
		if (myArrayList.sum()==1830) {
			resultString = "Test checkSumAfterResizing of elements of myArrayList Passed";
		}else {
			resultString = "Test checkSumAfterResizing failed";
		}
		results.storeNewResult(resultString);
	}

	private void checkResizing(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 55; i++) {
			myArrayList.insertSorted(i);
		}
		
		if (myArrayList.size()==55) {
			resultString = "Test checkResizing of elements of myArrayList Passed";
		}else {
			resultString = "Test checkResizing failed";
		}
		results.storeNewResult(resultString);
	}

	private void checkSumOfEmptyArray(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		if (myArrayList.sum()==0) {
			resultString = "Test checkSumOfEmptyArray of elements of myArrayList Passed";
		}else {
			resultString = "Test checkSumOfEmptyArray failed";
		}
		results.storeNewResult(resultString);
	}

	private void checkSum(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(4);
		myArrayList.insertSorted(5);
		myArrayList.insertSorted(1);
		if (myArrayList.sum()==10) {
			resultString = "Test checkSum of elements of myArrayList Passed";
		}else {
			resultString = "Test checkSum failed";
		}
		results.storeNewResult(resultString);
	}
	
	private void checkSize(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		for(int i=0; i<50; i++) {
			myArrayList.insertSorted(i);	
		}
		if (myArrayList.size()==50) {
			resultString = "Test checkSize of elements of myArrayList Passed";
		}else {
			resultString = "Test checkSize failed";
		}
		results.storeNewResult(resultString);
	}
	
	private void checkIndexOfAbsentValue(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(1);
		myArrayList.insertSorted(4);
		myArrayList.insertSorted(1);
		if (myArrayList.indexOf(0)==-1) {
			resultString = "Test checkIndexOfAbsentValue of elements of myArrayList Passed";
		}else {
			resultString = "Test checkIndexOfAbsentValue failed";
		}
		results.storeNewResult(resultString);
	}
	
	private void checkPresentValuePosition(MyArrayList myArrayList) {
		myArrayList.insertSorted(1);
		myArrayList.insertSorted(4);
		myArrayList.insertSorted(1);
		if (myArrayList.indexOf(4)==2) {
			resultString = "Test checkPresentValuePosition of elements of myArrayList Passed";
		}else {
			resultString = "Test checkPresentValuePosition failed";
		}
		results.storeNewResult(resultString);
	}
	
	private void checkRepeatedNumberPosition(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(1);
		myArrayList.insertSorted(4);
		myArrayList.insertSorted(4);
		if (myArrayList.indexOf(4)==1) {
			resultString = "Test checkRepeatedNumberPosition of elements of myArrayList Passed";
		}else {
			resultString = "Test checkRepeatedNumberPosition failed";
		}
		results.storeNewResult(resultString);
	}
	
	private void checkInvalidInsert(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(1);
		myArrayList.insertSorted(8);
		myArrayList.insertSorted(-4);
		if (myArrayList.indexOf(-4)==-1) {
			resultString = "Test checkInvalidInsert of elements of myArrayList Passed";
		}else {
			resultString = "Test checkInvalidInsert failed";
		}
		results.storeNewResult(resultString);
	}
	
	private void checkRemoveValue(MyArrayList myArrayList) {
		// TODO Auto-generated method stub
		myArrayList.insertSorted(4);
		myArrayList.insertSorted(8);
		myArrayList.insertSorted(4);
		myArrayList.removeValue(4);
		if (myArrayList.sum()==8) {
			resultString = "Test checkRemoveValue of elements of myArrayList Passed";
		}else {
			resultString = "Test checkRemoveValue failed";
		}
		results.storeNewResult(resultString);
	}
	
	
	
}
