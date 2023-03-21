package ConfigurationReader;

import java.io.IOException;

public class FileReaderManger {

	
	// Declare Const As a Private
	
	private FileReaderManger() {

	}

	public static FileReaderManger GetInstanceFR() {
		FileReaderManger fr = new FileReaderManger();
		return fr;

	}

	public ConfigReader getInstanceCR() throws IOException {
		ConfigReader c = new ConfigReader();
		return c;
	}
	
	
}
