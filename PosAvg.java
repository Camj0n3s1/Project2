import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {
	private String stID;
	ArrayList<String> file = new ArrayList<String>();

	// Constructor
	public PosAvg() {

	}

	// Constructor with parameter
	public PosAvg(String stID) {
		this.stID = stID;
	}

	// Reads the Mesonet.txt
	public void fileReader(String filename) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		//Skip over redundant 3 lines
		br.readLine();
		br.readLine();
		br.readLine();
		
		//Grab first line
		String line = br.readLine();
		while(line != null) {
			stID = line.substring(1,4);
			file.add(stID);
			br.readLine();
		}
		br.close();
	}

	// Returns the index of the station
	public int indexOfStation(String stID) {
		int index = 0;
		return index;
	}
}
