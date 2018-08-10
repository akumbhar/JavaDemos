package com.learn.demos.solid.dip;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DependancyInversionPrinciple {

	class Logger {

		NTFSFileSystem _fileSystem = new NTFSFileSystem();

		public void Log(String text) throws IOException {

			FileOutputStream fileStream = new FileOutputStream("log.txt");
			fileStream.write(text.getBytes());
			fileStream.close();

		}
	}

	// Good example

	interface ILogger {

		void doLog(String text);
	}

	static class NTFSFileSystem implements ILogger {

		@Override
		public void doLog(String text) {

			try {
				FileOutputStream fileStream = new FileOutputStream("log.txt");
				fileStream.write(text.getBytes());
				fileStream.close();
				System.out.println("NTFS Logger :: " + text);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	static class FatFileSystemLogger implements ILogger {

		@Override
		public void doLog(String text) {

			try {
				FileOutputStream fileStream = new FileOutputStream("log.txt");
				fileStream.write(text.getBytes());
				fileStream.close();
				System.out.println("Fat logger :: "+text);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	static class MyLogger {

		ILogger logger;

		public MyLogger(ILogger logger) {
			this.logger = logger;
		}

		public void log(String text) {
			logger.doLog(text);
		}

	}

	public static void main(String[] args) {

		MyLogger logger = new MyLogger(new FatFileSystemLogger());
		logger.log("do something");

		logger = new MyLogger(new NTFSFileSystem());
		logger.log("do something");

	}

}
