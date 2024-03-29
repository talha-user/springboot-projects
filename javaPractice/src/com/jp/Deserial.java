package com.jp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerializableStudent obj =(SerializableStudent)ois.readObject();
		obj.display();
		System.out.println(obj);
		
		ois.close();

	}

}
