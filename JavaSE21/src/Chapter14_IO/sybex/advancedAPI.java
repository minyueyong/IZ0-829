package Chapter14_IO.sybex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class advancedAPI {

	public static void readData ( InputStream is ) throws IOException {

		   System.out.print ( (char) is.read() ) ;      //W

		   if ( is.markSupported( ) ) {
               
		       is.mark(100)  ;        //Mark up to 100 bytes 
		       System.out.print ( (char) is.read() );   //A  ( remember this position because I is at 100 bytes )
		       System.out.print ( (char) is.read() ) ;  //R
		       is.reset ( ) ;                          //Reset stream to position before I
		   }

		      System.out.print ( (char) is.read() ) ;  //A
		      System.out.print ( (char) is.read() ) ;  //R
		      System.out.print ( (char) is.read() ) ;  //N
		}

	
	public static void main(String[] args) throws IOException {
		
		InputStream in = new BufferedInputStream(
	            new FileInputStream("C:/Users/Yia/warn.txt"));
		
		readData ( in );
		
		InputStream is = new BufferedInputStream(
	            new FileInputStream("C:/Users/Yia/zoo-data.txt"));
		
         System.out.println ();
		System.out.print ( (char) is.read( )  ) ;   //T
		is.skip(2)  ;                               // Skips I and G
		is.read( ) ;                                // Reads E but doesn't output it
		System.out.print ( (char) is.read( ) );     //R
		System.out.print ( (char) is.read( ) ) ;    //S

	}

}
