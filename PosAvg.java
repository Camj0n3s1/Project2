import java.io.IOException;
import java.util.ArrayList;

public class PosAvg {
	private String stID;
	ArrayList<String> file = new ArrayList<String>();
	
	//Constructor
	public PosAvg() {
		
	}
	
	//Constructor with parameter
	public PosAvg(String stID) {
		this.stID = stID;
	}
	
	//Reads the Mesonet.txt
	public void fileReader(String filename) throws IOException {
		
	}
	
	//Returns the index of the station
	public int indexOfStation() {
		int index = 0;
		return index;
	}
}
