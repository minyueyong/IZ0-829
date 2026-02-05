package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//same code as sharedFunctionality but replace with NIO.2 methods
//NIO.2 method will throw IOException but not Legacy I/O
public class sharedFunctionality2 {

	public static void main(String[] args) throws IOException{
		
		var path = Path.of( "C:\\data\\zoo.txt");
		
		if ( Files.exists(path)) {
			System.out.println ( "Absolute Path: " + path.toAbsolutePath());
			System.out.println ( "Is Directory: " + Files.isDirectory(path));
			System.out.println ( "Parent Path : " + path.getParent());
			
			if ( Files.isRegularFile(path)) {
				System.out.println ( "Size: " + Files.size(path));
				System.out.println ( "Last Modified: " + Files.getLastModifiedTime(path));
			}else {
				try ( Stream <Path> stream = Files.list(path)){
					stream.forEach( p -> System.out.println ( " " + p.getFileName()));
				}
			}
		}
	}

}
