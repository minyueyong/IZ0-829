package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class copyingFiles {

	
	public void copyPath ( Path source , Path target ) throws IOException{

	    try {

	        Files.copy ( source , target ) ;           //perform shallow copy , if target folder exists, it will throw exception
	        if ( Files.isDirectory ( source ) )
	        try ( Stream <Path> s = Files.list ( source )) {

	            s.forEach ( p -> {
					try {
						copyPath ( p , target.resolve ( p.getFileName ( ) ) );
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}) ;   //append p.getFileName to target 

	        } catch ( IOException e ){
	        	e.printStackTrace();
	           //Handle exception
	       }

	    }catch( IOException e) {e.printStackTrace(); }

	}  
	public static void main(String[] args) throws IOException{
		//Throw exception if panda-save directory does not exists
		//throw exception if source folder and files does not exists
		//Throw exception if destination folder and file have exists
		//Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));
		
		
		//Throw exception if source folder does not exists
		//Throw exception if turtleCopy already exists
		//Files.copy(Paths.get("/turtle"), Paths.get("/turtleCopy"));
		
		
		Path source = Path.of("/bison");
        Path target = Path.of("/panda");   

        new copyingFiles () .copyPath(source, target);

	}

}
