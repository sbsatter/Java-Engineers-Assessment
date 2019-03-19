package com.datasoft.javaengineersassessment.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
	private static final BufferedReader reader;
	
	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	public static String readLine() {
		try {
			return reader.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
