package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class replaceExisting {

	public static void main(String[] args) throws IOException {

Files.copy ( Paths.get( "C:/book.txt" ) , Paths.get ( "C:/movie.txt") , StandardCopyOption.REPLACE_EXISTING );

	}

}
