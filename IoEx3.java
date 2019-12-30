package io;

import java.io.*;

public class IoEx3 {
	public static void main(String[]args) throws Exception {
		IoEx3 a=new IoEx3();
		a.execute();
	}
		
	
	public void execute() throws Exception{
		InputStream is=null;
		OutputStream os=null;
		try {
		is= System.in ;
		File outFile=new File("D:\\folder\\newfile.txt");
		os=new FileOutputStream(outFile);
		int read;
		while((read=is.read())>=0) {
			os.write(read);
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
