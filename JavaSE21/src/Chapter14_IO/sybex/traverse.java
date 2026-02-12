package Chapter14_IO.sybex;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class traverse {

// getSize cannot be static if you want to use this ::	
// because this refers to object and static refer to class
	
	 private long getSize ( Path p ){
	    try{
	         return Files.size (p);

	     } catch ( IOException e  ){

	         throw new UncheckedIOException  ( e );
	     }

	}

	public long getPathSize ( Path source ) throws IOException  {

	     try ( var s = Files.walk ( source  )) {
	          return s.parallel ( ) 
	                 .filter ( p -> !Files.isDirectory (  p  ) )
	                 .mapToLong ( this::getSize )
	                 .sum ( ) ;

	     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
