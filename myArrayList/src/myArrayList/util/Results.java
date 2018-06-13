package myArrayList.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Results implements FileDisplayInterface, StdoutDisplayInterface{

	private File file;
	private String outputString;
	private BufferedWriter bufferedWriter;
	
	public Results(String string) {
		// TODO Auto-generated constructor stub
		outputString = null;
		file = new File(string);
		try {
			if (!file.exists()) {
				bufferedWriter = new BufferedWriter(new FileWriter(file));
				bufferedWriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void writeToStdout(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	@Override
	public void writeToFile(String s) {
		// TODO Auto-generated method stub
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("The sum of all the values in the array list is: " + s);
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("writeToFile : " + e.getMessage());
		}
	}

}
