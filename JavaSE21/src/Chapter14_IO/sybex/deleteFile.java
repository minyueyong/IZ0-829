package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class deleteFile {

	public static void main(String[] args) throws IOException {
		//can delete file and folder
		
		Files.delete(Path.of ( "C:/Users/Yia/gerbil.txt" ));  //throw exception if don't exists
		Files.deleteIfExists(Path.of ( "C:/Users/Yia/food.txt" )); //not throw exception if don't exists
	}

}
