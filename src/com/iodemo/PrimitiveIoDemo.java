package com.iodemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveIoDemo {

	public static void main(String[] args) throws IOException{

		FileOutputStream fos=new FileOutputStream("primitive");
		
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeInt(20);
		dos.writeDouble(2.4);
		dos.close();
		fos.close();
		
		System.out.println("file create hua ");
		System.out.println("===================");
		System.out.println("file reading");
		
		FileInputStream fis=new FileInputStream("primitive.txt");
		DataInputStream dis =new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		
		dis.close();
		fis.close();
		
		
	}

}
