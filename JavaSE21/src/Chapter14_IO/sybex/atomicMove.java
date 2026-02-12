package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

//only rename the file
public class atomicMove {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

Files.move ( Path.of ( "C:/Users/Yia/mouse.txt" ) , Path.of ( "C:/Users/Yia/gerbil.txt" ) , StandardCopyOption.ATOMIC_MOVE );


	}

}
