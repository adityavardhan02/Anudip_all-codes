package apjfsa;

import java.io.File;
import java.io.IOException;

public class FireFileHandlingApp {

	public static void main(String[] args) {

		File file = new File("demo.txt");
		try {

			if (file.createNewFile())
				System.out.println("demo.txt file created");
			else
				System.out.println("There is some problem in creating demo.txt file");
		} catch (IOException e) {
			System.out.println("IO exception thrown");
		}

	}

}
