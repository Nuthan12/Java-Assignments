package com.valtech.training.corejava.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

public class IoExample {

	public String readCharsFromFile(String fileName) throws Exception {
		char[] rc = new char[4];
		File file = new File(fileName);
		Reader r = new BufferedReader(new FileReader(file));

		int i = -1;
		StringBuffer sb = new StringBuffer();
		while ((i = r.read(rc)) != -1) {
			System.out.println("Size of Read = " + i);
			sb.append(rc, 0, i);
		}
		r.close();
		return sb.toString();
	}

	public void writeCharsToFile(String fileName, String data) throws Exception {
		File file = new File(fileName);
		Writer out = new BufferedWriter(new FileWriter(file));
		out.write(data);
		out.flush();// flush is used to send the characters that are stored in the bufferedwriter in
					// the memory (while executing the program) to the main file in the hard drive
		out.close();
	}

	public String readFromFile(String fileName) throws Exception {
		byte[] buffer = new byte[4]; // 16k or 32k buffer size is ideal.
		File file = new File(fileName);
		InputStream is = new FileInputStream(file);
		int i = -1;
		StringBuffer sb = new StringBuffer();
		while ((i = is.read(buffer)) != -1) {
			System.out.println("Size of Read = " + i);
			sb.append(new String(buffer, 0, i));
		}
		is.close();
		return sb.toString();

	}

	public void writeToFile(String fileName, String contents) throws Exception {
		byte[] data = contents.getBytes();
		File file = new File(fileName);
		FileOutputStream os = new FileOutputStream(file);
		os.write(data);
		os.close(); // Should Always be written in Finally

	}

	public static void main(String[] args) throws Exception {
		IoExample ex = new IoExample();
		ex.writeToFile("hello.txt", "Hello World");
		ex.writeToFile("hello.txt", "How Are You");
		System.out.println(ex.readFromFile("hello.txt"));
		ex.writeCharsToFile("hello.txt", "Nuthan");
		ex.writeToFile("hello1.txt", "");
		System.out.println(ex.readCharsFromFile("hello1.txt"));
	}

}
