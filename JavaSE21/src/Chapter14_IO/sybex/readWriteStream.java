package Chapter14_IO.sybex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


//✅ Input stream → buffer holds data read from file → closing does NOT write anything.

//✅ Output stream → buffer holds data to be written → closing writes remaining data to file.
public class readWriteStream {

	static void copyStream ( InputStream in , OutputStream out ) throws IOException {

	     int b; 
	     while (( b = in.read ( ) ) != -1 ){

	        out.write (b) ;
	    }

	}


	static void copyStream ( Reader in , Writer out ) throws IOException {

	     int b ;
	     while (( b = in.read ( ) ) != -1 ){

	        out.write (b) ;
	    }

	}
	
	static void copyBufferStream ( InputStream in , OutputStream out ) throws IOException {

	     int batchSize = 1024 ;
	     var buffer = new byte [batchSize];
	     int lengthRead;
	 
	     while (( lengthRead = in.read ( buffer , 0 , batchSize ) ) > 0  ){

	        out.write ( buffer , 0 , lengthRead ) ;
	        out.flush ( ) ;

	    }

	}

	
 //must put in try so it will close the stream and write content of buffer to output stream
	public static void main(String[] args) throws IOException{
		
		 // Character stream copy
	    try (Reader in = new FileReader("C:/Users/Yia/zoo-data.txt");
	         Writer out = new FileWriter("C:/Users/Yia/zoo-out.txt")) {

	        copyStream(in, out);
	    }

	    // Byte stream copy
	    try (InputStream in = new BufferedInputStream(
	            new FileInputStream("C:/Users/Yia/zoo-data.txt"));
	         OutputStream out = new BufferedOutputStream(
	            new FileOutputStream("C:/Users/Yia/zoo-byte.txt"))) {

	        copyStream(in, out);
	        copyBufferStream(in, out);
	    }

	}

}
