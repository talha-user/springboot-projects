package com.jp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) throws IOException {
		SerializableStudent student = new SerializableStudent("Talha","abc@gmail.com",12345);
		FileOutputStream fos = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		
		oos.close();
		fos.close();
		
		System.out.println("student object is serialized");

	}

}
