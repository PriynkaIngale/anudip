package com.iodemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class readTest {

	public static void main(String[] args) throws IOException {
		File f1 =new File("input.txt");
		
		FileReader fr=new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	}

}
