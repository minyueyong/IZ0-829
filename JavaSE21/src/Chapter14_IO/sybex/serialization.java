package Chapter14_IO.sybex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

 class Gorilla implements Serializable {

	   public static final long serialVersionUID = 1L;
       private String name ;
       private int age;
       private Boolean friendly;
       private transient String favoriteFood;
       
       public Gorilla(String name, int age, Boolean friendly, String favoriteFood) {
           this.name = name;
           this.age = age;
           this.friendly = friendly;
           this.favoriteFood = favoriteFood;
       }

       @Override
       public String toString() {
           return "Gorilla{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   ", friendly=" + friendly +
                   ", favoriteFood='" + favoriteFood + '\'' +
                   '}';
       }
}

public class serialization {

	static void saveToFile ( List<Gorilla> gorillas , File dataFile ) throws IOException {

	    try ( var out = new ObjectOutputStream ( 
	                    new BufferedOutputStream (
	                      new FileOutputStream ( dataFile ) ))) {

	        for ( Gorilla gorilla : gorillas ){
	            out.writeObject ( gorilla );

	        }
	}}
	

	static List <Gorilla>  readFromFile (  File dataFile ) throws IOException, ClassNotFoundException {

     var gorillas = new ArrayList <Gorilla> ( ) ;
   
     try ( var in = new ObjectInputStream ( 
                    new BufferedInputStream ( 
                    new FileInputStream ( dataFile )))) {


          while ( true ) {

              var object = in.readObject ( ) ;
              if ( object instanceof Gorilla g ) 
                  gorillas.add ( g) ;


          }

       }catch ( EOFException e ) {


       }
       return gorillas;

    }

	    
	public static void main(String[] args) throws IOException , ClassNotFoundException{
		
		var gorillas = new ArrayList <Gorilla> ( ) ;
		gorillas.add ( new Gorilla ( "Grodd" , 5, false, "fries" ));
		gorillas.add ( new Gorilla ( "Ishmel" , 8, true , "rice"));
		File dataFile = new File ( "C:/Users/Yia/gorilla.data");

		saveToFile ( gorillas , dataFile );
		var gorillasFromDisk = readFromFile( dataFile );
		gorillasFromDisk.forEach(System.out::println);

		//favouriteFood is transient so it become default value when we deserialize it
		
		/*
		 * Gorilla{name='Grodd', age=5, friendly=false, favoriteFood='null'}
           Gorilla{name='Ishmel', age=8, friendly=true, favoriteFood='null'}

		 */
	}

}
