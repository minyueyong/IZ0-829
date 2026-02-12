package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class moveRename {

	public static void main(String[] args) throws IOException {
		
		//rename zoo folder to zoo-new
		Files.move ( Path.of( "C:/Users/Yia/zoo" ) , Path.of( "C:/Users/Yia/zoo-new" ));

		//move addresses.txt to zoo-new/addresses2.txt
		Files.move ( Path.of( "C:/Users/Yia/addresses.txt" ) , Path.of( "C:/Users/Yia/zoo-new/addresses2.txt" ));

       //both will throw exception if target already existed , unless you use REPLACE_EXISTING
	}

}
