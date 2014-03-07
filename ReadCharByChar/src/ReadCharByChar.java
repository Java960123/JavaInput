import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadCharByChar {

	ReadCharByChar(){
		
	}
	
	public static void main(String [ ] args) throws IOException{		
		char[] myChar = null;
		Scanner s = null;
	        try {
	            s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\src\\input.txt")));
	            while (s.hasNext())
	            {
	               String str = s.next(); 
	               myChar = str.toCharArray();
	            }
	        } finally {
	            if (s != null) {
	                s.close();
	            }
	        }
	        for(int i = 0; i < 20; i++){
				System.out.println(myChar[i]);
	        }
	}
}
