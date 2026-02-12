package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class copyFilesToDirectory {

	public static void main(String[] args) throws IOException	{
		
		var file = Paths.get ( "C:/Users/Yia/food.txt" );
		var directory = Paths.get ( "C:/Users/Yia/enclosure" ); 
		//Throw exception if enclosure already exists
		//if enclosure does not exists, it will create an enclosure file
		//java doesn't know enclosure is a folder
		Files.copy ( file , directory );   
		
		var file2 = Paths.get ( "C:/Users/Yia/food.txt" );
		var directory2 = Paths.get ( "C:/Users/Yia/enclosure/food.txt" );  //Throw exception if enclosure does not exists
		//Files.copy ( file2 , directory2 ); 
	}

}
