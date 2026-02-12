package Chapter14_IO.sybex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class systemStreams {

	public static void main(String[] args) throws IOException {
		
		var reader = new BufferedReader ( new InputStreamReader ( System.in ));
		String userInput = reader.readLine ( ) ;
		System.out.println ( "You entered: " + userInput );
		
		try ( var out = System.out ) { } 
		System.out.println ( "Hello" );  //no display anything because stream already closed in try block

		try ( var err = System.err ) { } 
		System.err.println ( "Hello" ) ;
		
		var reader2 = new BufferedReader ( new InputStreamReader ( System.in )) ;

		try ( reader2 ) { } 
		String data = reader2.readLine ( )  ;      //IOException because u try to run on closed IO Stream

	}

}
