package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Paths;

public class retrieveRealFileSystem {

	//Throw exception if file does not exists
	//verify file exists within path system
	public static void main(String[] args) throws IOException {
		
		//If we have symbolic link from /zebra to /horse
		//Given a current working directory of /horse/schedule
		System.out.println (  Paths.get ( "/zebra/food.txt" ).toRealPath( ) ) ;  
		System.out.println ( Paths.get ( ".././food.txt" ).toRealPath ( ) )  ;   

		// /horse/food.txt   

	}

}
