package io;

import java.io.*;

public class IoStreamEx {
	
	public static void main(String[]args) {
		String path="C:\\Users\\admin\\Nandini\\abc.txt";
		File file=new File(path);
		System.out.println("is dir="+file.isDirectory());
		System.out.println("is file="+file.isFile());
		System.out.println("is hidden="+file.isHidden());
		if(file.isDirectory()) {
			String[] files=file.list();
			for(String f:files) {
				System.out.println(f);
			}
		}
		
		File dirToBeCreated=new File("D:\\folder");
		System.out.println("dir created="+dirToBeCreated.mkdir());
	}

}
