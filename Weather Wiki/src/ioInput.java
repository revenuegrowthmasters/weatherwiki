import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class ioInput {

	public ioInput() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BufferedReader br = null;
        FileReader fri = null;

        try {

            fri = new FileReader("input.txt");
            br = new BufferedReader(fri);

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        } finally {
            try {
                if (br != null)
                    br.close();

                if (fri != null)
                    fri.close();
            } catch (IOException ex) {
                System.err.format("IOException: %s%n", ex);
            }
        }

    }

}