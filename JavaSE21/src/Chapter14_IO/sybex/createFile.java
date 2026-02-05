package Chapter14_IO.sybex;

import java.io.File;

//File is legacy IO
public class createFile {

	public static void main(String[] args) {
		File zooFile1 = new File ( "/home/tiger/data/stripes.txt" );
		File zooFile2 = new File ( "/home/tiger" , "data/stripes.txt");

		File parent = new File ( "/home/tiger" );
		File zooFile3 = new File ( parent ,  "data/stripes.txt" );

		System.out.println ( zooFile1.exists( ) ) ;  //false


	}

}
