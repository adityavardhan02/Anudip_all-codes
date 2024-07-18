package apjfsa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fwrite = new FileWriter("Demo.txt");

		fwrite.write("Hello java  World");

		fwrite.close();

		File file = new File("Demo.txt");
		Scanner scanner = new Scanner(file);

		if (scanner.hasNext()) {
			String str = scanner.nextLine();
			System.out.println(str);
		}
		scanner.close();
		System.out.println("length of the file:" + file.length());
	}

}
