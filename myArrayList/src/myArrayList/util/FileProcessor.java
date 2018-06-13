package myArrayList.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {
	
	private File file;
	private Scanner scanner;
	
	public FileProcessor(String string) {
		// TODO Auto-generated constructor stub
		file = new File(string);
		try {
			scanner = new Scanner(file);
			if (!scanner.hasNextLine()) {
				System.out.println("File " + string + " does not contain any data");
				System.exit(1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public String readLine() {
		while (scanner.hasNextLine()) {
			return scanner.nextLine();
		}
		return null;
	}
}
