package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIOOptionalParameter2 {

	public static void main(String[] args) throws IOException{
		
		Path source = Path.of ( "/home/tiger/data/stripes.txt" );
		Path target = Path.of  ( "/home","tiger" , "data" , "stripes.txt");
		
		//If the target is a symbolic link , move the symbolic link itself , move the file as atomic file system operation
		//move must be atomic on the same file system
		  Files.move ( source , target , 
                  LinkOption.NOFOLLOW_LINKS, 
                  StandardCopyOption.ATOMIC_MOVE );



	}

}
