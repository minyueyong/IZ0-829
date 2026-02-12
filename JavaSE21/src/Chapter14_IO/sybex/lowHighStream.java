package Chapter14_IO.sybex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lowHighStream {
//BufferedReader is high level stream
//FileReader is low level stream
//high level stream wrap around low level stream
	public static void main(String[] args) throws IOException {
		
		try ( var br = new BufferedReader ( new FileReader ( "C:/Users/Yia/zoo-data.txt" ))){

		      System.out.println ( br.readLine ( ) ); 
		}

	}

}
