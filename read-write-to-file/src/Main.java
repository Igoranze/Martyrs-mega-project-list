import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;


public class Main {

	public static void main(String[] args) {
	
		readFromFile();
		
	}

	private static void writeToFile(String line) {
		// Convert the string to a
		// byte array.
		byte data[] = removeSpecialCharacters(line).getBytes();
		Path p = Paths.get("/home/user/Desktop/outFile.txt");

		try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, APPEND))) {
			out.write(data, 0, data.length);
		} catch (IOException x) {
			System.err.println(x);
		}
	}

	private static void readFromFile() {
		Path file = Paths.get("/home/user/Desktop/inFile.txt");
		try (InputStream in = Files.newInputStream(file);
		    BufferedReader reader =
		      new BufferedReader(new InputStreamReader(in))) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	writeToFile(line +"\n");
		    }
		} catch (IOException x) {
		    System.err.println(x);
		}
	}
	
	public static String removeSpecialCharacters(String sentence) {
		//StringBuilder container to store all the data in
		StringBuilder stringB = new StringBuilder();
		//loop trough all the characters from the sentence
		for (char c : sentence.toCharArray()) {
			//only store characters that are equal to the below values
			if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ' ) {
				stringB.append(c);
			}
		}
		return stringB.toString().toLowerCase();
	}
}
