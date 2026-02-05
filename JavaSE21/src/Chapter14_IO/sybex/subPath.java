package Chapter14_IO.sybex;

import java.nio.file.Path;
import java.nio.file.Paths;

public class subPath {

	public static void main(String[] args) {
		
		Path p = Paths.get ( "/mammal/omnivore/raccoon.image" );
		
	
		System.out.println ( "subpath(0,3): " + p.subpath ( 0,3));   
		System.out.println ( "subpath(1,2): " + p.subpath ( 1,2) );  
		System.out.println ( "subpath(1,3): " + p.subpath ( 1,3) );   
		
		System.out.println ( "subpath(0,4): " + p.subpath ( 0,4) );  //IllegalArgumentException because path don't exist 
		System.out.println ( "subpath(1,1): " + p.subpath ( 1,1) );   //IllegalArgumentException because path don't exist 

	}

}
/*
 * 
 *         subpath(0,3): mammal\omnivore\raccoon.image
           subpath(1,2): omnivore
           subpath(1,3): omnivore\raccoon.image
 */
