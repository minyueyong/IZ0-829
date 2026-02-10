package Chapter14_IO.sybex;

import java.nio.file.Path;
import java.nio.file.Paths;

public class normalizePath {
//eliminate unnecessary redundancies in a path
	public static void main(String[] args) {
		
		var p1 = Path.of( "./armadillo/../shells.txt" );
		System.out.println ( p1.normalize( ) ) ;    // shells.txt


		var p2 = Path.of( "/cats/../panther/food" );
		System.out.println ( p2.normalize( ) ) ;    // /panther/food


		var p3 = Path.of( "../../fish.txt" );
		System.out.println ( p3.normalize( ) ) ;    // ../../fish.txt
		
		var p4 = Paths.get("/pony/../weather.txt");
        var p5 = Paths.get("/weather.txt");
		System.out.println ( p4.equals(p5) ) ;                            // false
		System.out.println ( p4.normalize().equals(p5.normalize()) ) ;    // true after we normalize the path

        
	}

}
