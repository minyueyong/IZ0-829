package Chapter14_IO.sybex;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOOptionalParameter1 {
	
	//If schedule.xml is a symbolic link, Java checks whether the link itself exists, not whether the file it points to exists.
	//No follow the link means don't further crawl to the link
	public static void main(String[] args) {
		
		Path path = Paths.get ( "schedule.xml" );
		boolean exists = Files.exists ( path , LinkOption.NOFOLLOW_LINKS );

	}

}
