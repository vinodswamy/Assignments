package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;



public class Java 
{
		    public static void main(String[] args) throws IOException 
		    {
		    	 File fr=new File("C:\\Users\\DELL\\Desktop\\vinod.txt");    
		    	  BufferedReader br= new BufferedReader(new FileReader(fr));
		 
		   
		        String st;
		        while ((st = br.readLine()) != null)
		 
		            // Print the string
		            System.out.println(st);  
		          
		          
		       
		    	/*File file = new File("C:\\Users\\DELL\\Desktop\\vv.txt");;
				boolean success =file.renameTo(new File("C:\\Users\\DELL\\Desktop\\j\\java.txt"));
				System.out.println("Successfully Moved");*/
		    }
	}


