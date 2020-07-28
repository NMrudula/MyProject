package com.propertyreader.filereader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertyReader {
	public static void main(String[] args) {
	FileReader reader;
	try {
		reader = new FileReader("Alphabet.properties");
		Properties properties=new Properties();
		properties.load(reader);
		System.out.println("Enter the key ");
		Scanner scanner = new Scanner(System.in);
		String key = scanner.nextLine();
		if(properties.containsKey(key)) {
			System.out.println("Value is : "+properties.getProperty(key));
		}else {
			System.out.println("Entered key is not available : "+key);
		}
	 } catch (IOException e) {
		e.printStackTrace();
	}
}
}



