package Chapter14_IO.sybex;

import java.nio.file.Path;

public class relativizingPath {   //Constructing relative path from one path to another

	public static void main(String[] args) {
		
		var path1 = Path.of ( "fish.txt" );
		var path2 = Path.of ( "friendly/birds.txt" );

		System.out.println ( path1.relativize ( path2 ));  // ../friendly/birds.txt
		System.out.println ( path2.relativize ( path1 ));   // ../../fish.txt


	}

}
