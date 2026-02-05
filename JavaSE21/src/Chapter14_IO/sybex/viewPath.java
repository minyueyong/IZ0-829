package Chapter14_IO.sybex;

import java.nio.file.Path;
import java.nio.file.Paths;

public class viewPath {

	public static void main(String[] args) {
		
		Path path = Paths.get ( "/land/hippo/harry.happy" );
		System.out.println ( "The Path Name is " + path );

		for ( int i =0 ; i< path.getNameCount ( ) ; i ++ ){

			System.out.println ( "Element " + i + " is: " + path.getName ( i ) );
		}
		
		var p = Path.of( "/");
		System.out.println ( p.getNameCount());   //0
		System.out.println ( p.getName(0) );    //throw IllegalArgumentException because root element don't 
		//include in list of names

		

	}

}

/*
 * 
 * The Path Name is \land\hippo\harry.happy
	Element 0 is: land
	Element 1 is: hippo
	Element 2 is: harry.happy

 */
