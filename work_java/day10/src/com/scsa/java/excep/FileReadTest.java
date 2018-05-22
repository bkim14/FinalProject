package com.scsa.java.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
	Scanner scan;
	
	public void openFile() throws FileNotFoundException {
		scan=new Scanner(new File("data.txt"));
	}
	
	
	public void readFile() {
		while(true) {
			String msg=scan.nextLine();
			if(msg.equals("q")) break;
			System.out.println(msg);
		}
	}
	
	
	public static void main(String[] args) {
		FileReadTest frt=new FileReadTest();
		try{
			frt.openFile();
			frt.readFile();

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(frt.scan!=null) {
				frt.scan.close();
			}
		}
		System.out.println("Endd..");
		
	}

}
