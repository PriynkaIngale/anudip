package com.iodemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {

	public static void main(String[] args) throws IOException {
		
		File file =new File("input.txt");
		String str="copy this string to file";
		FileWriter write =new FileWriter(file);
		write.write(str);
		write.close();

	}

}
