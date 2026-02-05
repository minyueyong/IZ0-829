package Chapter14_IO.sybex;

import java.io.File;

// Use Legacy IO
public class sharedFunctionality {

	public static void main(String[] args) {
		
		
		var file = new File ( "C:\\data\\zoo.txt");
		if ( file.exists()) {
			
			System.out.println ( "Absolute Path:" + file.getAbsolutePath());
			System.out.println ( "Is Directory:" + file.isDirectory());
			System.out.println ( "Parent Path:" + file.getParent());
			
		}
		
		if ( file.isFile()) {
			System.out.println ( "Size: " + file.length());
			System.out.println ( "Last Modified  " + file.lastModified());

		}else {
			for ( File subfile : file.listFiles()) {
				System.out.println ( " " + subfile.getName());
			}
		}
	}

}
