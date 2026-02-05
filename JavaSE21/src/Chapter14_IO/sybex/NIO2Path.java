package Chapter14_IO.sybex;

import java.nio.file.Path;

//Path instance are immutable 
public class NIO2Path {

	public static void main(String[] args) {
		
		Path p = Path.of ( "whale" );
		p.resolve ( "krill" )  ;      //This value is lost since path is immutable
		System.out.println ( p ); //whale

		System.out.println ( Path.of( "/zoo/../home").getParent().normalize().toAbsolutePath() );  //C:\
	}

}
