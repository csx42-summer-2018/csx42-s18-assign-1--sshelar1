package myArrayList;

public class MyArrayList{

	private int[] myarray;
	private int size;
	
	public MyArrayList() {
		myarray = new int [50];
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public int sum() {
		int sum=0;
		for (int i = 0; i < size; i++) {
			sum = sum + myarray[i];
		}
		return sum;
	}
	
	public void insertSorted(int newValue) {
		if (newValue<0 || newValue>10000) {
			return;
		}
		if (size==0) {
			myarray[size] = newValue;
			size++;
			return;
		}
		int x = size-1;
		while (x >= 0 && myarray[x] > newValue ) {
			myarray[x+1] = myarray[x];
			x--;
		}
        myarray[x+1] = newValue;	
        size++;
        if (size==myarray.length) {
			resize();
		}
	}
	
	private void resize() {
		// TODO Auto-generated method stub
		int newSize = (int) (size + Math.floor(size/2));
		int[] newMyArray = new int [newSize];
		for (int i = 0; i < size; i++) {
			newMyArray[i] = myarray[i];
		}
		myarray = newMyArray;
	}

	public void removeValue(int value) {
		int pos;
		while ((pos = indexOf(value)) != -1) {
			//System.out.println("Position : " + pos);
			for (int i = pos; i < size; i++) {
				myarray[i] = myarray[i+1];
			}
			myarray[size-1] = 0;
			size--;
		}
	}
	
	public int indexOf(int value) {
		// TODO Auto-generated method stub
		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (myarray[i] == value) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < size; i++) {
			builder.append(myarray[i] + " ");
		}
		return builder.toString();
	}
}