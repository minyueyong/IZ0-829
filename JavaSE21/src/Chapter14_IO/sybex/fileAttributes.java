package Chapter14_IO.sybex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class fileAttributes {

	public static void main(String[] args) throws IOException {
		
		var path = Paths.get( "C:/Users/Yia/warn.txt" );

		BasicFileAttributes data = Files.readAttributes ( path , BasicFileAttributes.class ) ;

		BasicFileAttributeView view = Files.getFileAttributeView ( path , BasicFileAttributeView.class );

		
		System.out.println ( Files.isHidden ( path));
		System.out.println ( Files.isReadable (path));
		System.out.println ( Files.isWritable (path));
		System.out.println ( Files.isExecutable ( path));

		System.out.println ( "Is a directory? " + data.isDirectory( )  );
		System.out.println ( "Is a regular file? " + data.isRegularFile( ) );
		System.out.println ( "Is a symbolic link? " + data.isSymbolicLink( ) );
		System.out.println ( "Size ( in bytes ) :" + data.size( ) );
		System.out.println ( "Last Modified: " + data.lastModifiedTime( )  );
		
		FileTime lastModifiedTime = FileTime.fromMillis ( data.lastModifiedTime( ).toMillis() +java.util.concurrent.TimeUnit.MINUTES.toMillis(1) ) ;
				view.setTimes ( lastModifiedTime , null , null );
			
		//have to reread new file attribute after you have updated it
		BasicFileAttributes newData =
				        Files.readAttributes(path, BasicFileAttributes.class);		
				
		System.out.println ( "After Modified: " + newData.lastModifiedTime( )  );



	}

}
