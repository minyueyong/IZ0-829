package Chapter14_IO.sybex;

import java.io.File;
import java.nio.file.Path;

public class SwitchFilePath {

	public static void main(String[] args) {
		
		File file = new File ( "rabbit" );
		Path nowPath  = file.toPath( );

		File backToFile = nowPath.toFile();


	}

}
