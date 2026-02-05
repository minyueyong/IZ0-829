package Chapter14_IO.sybex;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//NIO use Path
public class createPath {
//Path is an interface so can't create an instance directly .
//Interface don't have constructors
	public static void main(String[] args) {
		
		Path zooPath1 = Path.of ( "/home/tiger/data/stripes.txt" );
		Path zooPath2 = Path.of  ( "/home","tiger" , "data" , "stripes.txt");

		Path zooPath3 = Paths.get( "/home/tiger/data/stripes.txt" );
		Path zooPath4 = Paths.get ( "/home", "tiger" ,"data" , "stripes.txt" );

		System.out.println ( Files.exists ( zooPath1) ) ;  //false


	}

}
