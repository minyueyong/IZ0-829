package Chapter14_IO.sybex;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ObjectInputStream;

public class streamClass {

	public static void main(String[] args) {
		
	//	new BufferedInputStream ( new FileReader ( "z.txt" )) ;         //DOES NOT COMPILE mix Reader with InputStream ( mix byte stream with character stream

	//	new BufferedWriter ( new FileOutputStream ( "z.txt" )) ;        //DOES NOT COMPILE mix Writer with OutputStream ( mix byte stream with character stream

	//	new ObjectInputStream ( new FileOutputStream ( "z.txt" ))  ;    //DOES NOT COMPILE  cannot mix InputStream with OutputStream

	//	new BufferedInputStream ( new InputStream ( ) )  ;             //DOES NOT COMPILE   Input Stream is an abstract class , cannot create an instance of it

	}

}
