import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadIn {
	public static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("large-database.txt"));
		// reads in file
		try {
			// builds a string
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null)
		   {
		    	// while line is not null
		        sb.append(line); // append line
		        sb.append(System.lineSeparator()); 	// and separate line
			    line = br.readLine();		  // read line
		    }
		} finally {
		    br.close();
		}
	}
	// MAIN METHOD TO SEE IF THE STRING READ IN
	public static void main(String[] args){
		BufferedReader br = null;
		try {
			// Trying to read from rules.txt
			br = new BufferedReader(new FileReader("large-database.txt"));
			String line = br.readLine(); 
			while (line != null){
				System.out.print(line);
				line = br.readLine();
		}
		}
			catch(IOException e){ // if the file is not found an exception is thrown
				e.printStackTrace();
			}
		}
	
	}