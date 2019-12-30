package io;

import java.io.*;

public class IoEx2 {
	
	public static void main(String[]args) throws Exception {
		long startTime=System.currentTimeMillis();
		IoEx2 a=new IoEx2();
		a.execute();
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("program finished in millis:"+executionTime);
	}
		
	
	public void execute() throws Exception{
		InputStream is=null;
		OutputStream os=null;
		try {
		File inputfile=new File("C:\\Users\\admin\\Nandini\\abc.txt");
		is= new FileInputStream(inputfile);
		File outFile=new File("D:\\folder\\newfile.txt");
		os=new FileOutputStream(outFile);
		int readBytesCount;
		byte[]buffer=new byte[1000];
		BufferedInputStream bis=new BufferedInputStream(is);
		while((readBytesCount=is.read(buffer))>=0) {
			os.write(buffer,0,readBytesCount);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(is!=null) {
				is.close();
			}
			if(os!=null) {
				os.close();
			}
		}

	}
}
