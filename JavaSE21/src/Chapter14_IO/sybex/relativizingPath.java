package Chapter14_IO.sybex;

import java.nio.file.Path;
import java.nio.file.Paths;

public class relativizingPath {   //Constructing relative path from one path to another
	//Actual value returned must use the input

	public static void main(String[] args) {
		
		//Both relative path
		var path1 = Path.of ( "fish.txt" );
		var path2 = Path.of ( "friendly/birds.txt" );

		//To get to fish.txt from friendly/birds.txt
		System.out.println ( path1.relativize ( path2 ));  // ../friendly/birds.txt
		System.out.println ( path2.relativize ( path1 ));   // ../../fish.txt
		
		
		//Both absolute path
		Path path3 = Paths.get ( "E:\\habitat" );
		Path path4 = Paths.get ( "E:\\sanctuary\\raven\\poe.txt" );

		System.out.println ( path3.relativize ( path4 )) ;   // ..\sanctuary\raven\poe.txt
		System.out.println ( path4.relativize ( path3 ));    // ..\..\..\habitat

		
		//Requires both path to be relative or absolute , or else will throw exception
		//Absolute + Relative path
		Path path5 = Paths.get ( "/primate/chimpanzee" );    //absolute path
		Path path6 = Paths.get ( "bananas.txt" ) ;           //relative path

		path5.relativize ( path6 );    //IllegalArgumentException cannot mix absolute and mixed path

		Path path7 = Paths.get ( "C:\\primate\\chimpanzee" );   //absolute path
		Path path8 = Paths.get ( "D:\\storage\\bananas.txt" );           //relative path

		path7.relativize ( path8 );  //  IllegalArgumentException because have different drive letters

	}

}
