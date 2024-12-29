package java_programs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {

		String srcFile = "C:\\Java Note.docx";
		String desFile = "Dest.docx";

		FileReader fileReader = null;
		FileWriter fileWriter = null;

		try {
			fileReader = new FileReader(srcFile);
			fileWriter = new FileWriter(desFile);

			char[] buffer = new char[1024];
			int bytesRead;

			while ((bytesRead = fileReader.read(buffer)) != -1) {
				fileWriter.write(buffer, 0, bytesRead);
			}
			System.out.println("File Copied Successfully!");
		} catch (IOException e) {
			System.out.println("An error occured:  " + e);
		}
	}

}
