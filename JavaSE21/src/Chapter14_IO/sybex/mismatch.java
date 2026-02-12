package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class mismatch {

	public static void main(String[] args) throws IOException {
		
		System.out.println ( Files.mismatch (
				Path.of ( "C:/Users/Yia/animals/monkey.txt" ),
				Path.of ( "C:/Users/Yia/animals/wolf.txt" ))) ;   // -1 is match , 1 or 2 if mismatch
		//show the position that its mismatch
		
		//monkey.txt is wonderful
		//wolf.txt is wonderland
		//mismatch at position 6

	}

}
