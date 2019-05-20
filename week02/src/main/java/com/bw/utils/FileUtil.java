package com.bw.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtil {
	public static String getExtendName(String fileName){
		try {
			FileInputStream in = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileName;
	}
}
