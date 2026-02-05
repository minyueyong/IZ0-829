package Chapter14_IO.sybex;

import java.nio.file.Path;

// Absolute + Relative with Absolute  as input , resolve relative
//Relative + Absolute with Absolute as input, return Absolute
//Absolute + Absolute , return Absolute
//Relative  + Relative , input resolve with the object 
public class resolvingPath {

	public static void main(String[] args) {
		
		//Absolute Path & Relative Path
		Path path1 = Path.of ( "/cats/../panther" );   //Absolute Path
		Path path2 = Path.of ( "food" );               //Relative Path
		System.out.println ( path1.resolve ( path2 ));    // /cats/../panther/food
		
		//Relative Path & Absolute Path
		Path path3 = Path.of ( "/cats/../panther" );   //Absolute Path
		Path path4 = Path.of ( "food" );               //Relative Path
		System.out.println ( path4.resolve ( path3 ));    // /cats/../panther
				
		
		//Absolute Path & Absolute Path 
		Path path5 = Path.of ( "/turkey/food" );       //Absolute Path
		
		//When put absolute path as input , it will print the absolute path
		System.out.println ( path3.resolve ( "/tiger/cage" )) ;   // /tiger/cage

	
		
		//Relative Path & Relative Path
		Path path6 = Path.of ( "cats/../panther" );     //Relative Path
		Path path7 = Path.of ( "food" );               //Relative Path
		System.out.println ( path6.resolve ( path7 ));    // cats\..\panther\food
		System.out.println ( path7.resolve ( path6 ));    // food\cats\..\panther

	}

}
