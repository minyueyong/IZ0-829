package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//throw exception if not exists
public class isSameFile {

	public static void main(String[] args) throws IOException{
		
		System.out.println ( Files.isSameFile (
				Path.of ( "C:/Users/Yia/animals/cobra" ),
				Path.of ( "C:/Users/Yia/animals/snake" )))  ;                   //true

				System.out.println ( Files.isSameFile (
				Path.of ( "C:/Users/Yia/animals/monkey/ears.png" ),
				Path.of ( "C:/Users/Yia/animals/wolf.ears.png" )));   
	}

}
