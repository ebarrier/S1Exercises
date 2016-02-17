package practicum10;

import java.io.File;

public class MyFiles {

	public static void listFile(File folder){
		
		for (File file : folder.listFiles()) { //listFile works only for directories
			if (file.isDirectory()) {			// that's why we check if the file is a directory
				listFile(file);
				
			}
			System.out.println(file);
		}
		
	}
	
	public static void main(String[] args) {
		listFile(new File("/"));
	}
	
}
