package Chapter14_IO.sybex;

import java.nio.file.FileSystems;
import java.nio.file.Path;

//Obtaining path from FileSystems
public class FileSystemPath {

	public static void main(String[] args) {
		
		Path zooPath1 = FileSystems.getDefault( )
	               .getPath ( "/home/tiger/data/stripes.txt" );


	    Path zooPath2 = FileSystems.getDefault( )
	               .getPath ( "/home" , "tiger" , "data" , "stripes.txt" );

	}

}
