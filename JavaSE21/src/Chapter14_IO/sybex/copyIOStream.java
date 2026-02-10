package Chapter14_IO.sybex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class copyIOStream {

	public static void main(String[] args) throws FileNotFoundException , IOException {


		try ( var is = new FileInputStream ( "C:/testing/source-data.txt" )) {

			   //Files.copy ( is , Paths.get( "C:/testing/mammals/wolf.txt" )) ;//mammals directory must exists
			   //Files.copy does not create directories , only files

			}   
           
		    //copy file content to System.out
			Files.copy ( Paths.get ( "/fish.clown.xsl" ) , System.out );

	}

}
