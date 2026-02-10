package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class makingDirectories {

	public static void main(String[] args) throws IOException{
		
		//Create a new directory field in the directory bison
		//Throw exception if directory bison does not exists or if directory field already exists
		Files.createDirectory( Path.of("/bison/field"));
		
		//create directory green along with any parent directories if they do not exists
		Files.createDirectories( Path.of("/bison/field/pasture/green"));


	}

}
