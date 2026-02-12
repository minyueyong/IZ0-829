package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;


//use String , bytes and String list way to write into output path
public class readPath {

	private static void copyPathAsString ( Path input , Path output ) throws IOException {
	      String string = Files.readString ( input );
	      Files.writeString ( output , string );
	     

	}

	private static void copyPathAsBytes ( Path input , Path output ) throws IOException {
	      byte[] bytes = Files.readAllBytes ( input );
	      Files.write ( output , bytes);

	}

	private static void copyPathAsLines ( Path input , Path output ) throws IOException {
	      List<String> lines = Files.readAllLines ( input );
	      Files.write ( output , lines );
	  
	}

	
	private static void readLazily  ( Path path ) throws IOException {
	     try ( Stream <String> s = Files.lines ( path )) {

	        s.forEach( System.out::println );

	     }
	}

	
	private static void copyPath ( Path input , Path output  ) throws IOException {

	     try ( var reader = Files.newBufferedReader ( input );
	           var writer = Files.newBufferedWriter ( output )) {

	         String line = null;
	         while (( line = reader.readLine ( ) ) !=  null ){
	        
	              writer.write( line )
	              writer.newLine( ) 

	         }}}

	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		copyPathAsString ( Path.of ( "C:/Users/Yia/zoo-data.txt" ) ,Path.of ( "C:/Users/Yia/pathAsString.txt" ) );
		copyPathAsBytes ( Path.of ( "C:/Users/Yia/zoo-data.txt" ) ,Path.of ( "C:/Users/Yia/pathAsBytes.txt" ) );
		copyPathAsLines( Path.of ( "C:/Users/Yia/zoo-data.txt" ) ,Path.of ( "C:/Users/Yia/pathAsLines.txt" ) );
		readLazily( Path.of ( "C:/Users/Yia/zoo-data.txt" ));
		
		
		try (var s = Files.lines(Path.of("C:/Users/Yia/warn.txt"))) {

		    s.filter(f -> f.startsWith("WARN:"))
		     .map(f -> f.substring(5))
		     .forEach(System.out::println);

		}
		
		Files.readAllLines ( Paths.get("C:/Users/Yia/warn.txt" )).forEach ( System.out::println );
		Files.lines ( Paths.get("C:/Users/Yia/warn.txt" )).forEach ( System.out::println );
		
		//readAllLines returns a list , not a Stream


	}

}
