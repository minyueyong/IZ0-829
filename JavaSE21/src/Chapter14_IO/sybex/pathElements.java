package Chapter14_IO.sybex;

import java.nio.file.Path;

public class pathElements {

	public static void printPathInformation ( Path path ){

		   System.out.println ( "Filename is :" + path.getFileName ( ) ) ;
		   System.out.println ( "Root is :" + path.getRoot ( ) ) ;
		   Path currentParent = path;

		   while (( currentParent = currentParent.getParent ( ) ) != null )
		      System.out.println ( "Current parent is : " + currentParent );

		   System.out.println ( ) ;

		}

	public static void main(String[] args) {
		
		printPathInformation ( Path.of ( "zoo" ));
		printPathInformation ( Path.of ( "/zoo/armadillo/shells.txt" ));
		printPathInformation ( Path.of ( "./armadillo/../shells.txt" ));

	}

}

/*
		Filename is :zoo
		Root is :null
		
		Filename is :shells.txt
		Root is :\
		Current parent is : \zoo\armadillo
		Current parent is : \zoo
		Current parent is : \
		
		Filename is :shells.txt
		Root is :null
		Current parent is : .\armadillo\..
		Current parent is : .\armadillo
		Current parent is : .
 *
 */
