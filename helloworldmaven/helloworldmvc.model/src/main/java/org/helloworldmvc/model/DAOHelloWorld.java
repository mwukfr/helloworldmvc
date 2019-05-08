package org.helloworldmvc.model;

import java.io.*;

public class DAOHelloWorld {
	
	private static String fileName = "HelloWorld.txt";
	String line = null;
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	public DAOHelloWorld() {
		
	}
	
	public static DAOHelloWorld getInstance() {
		return instance;
	}
	
	private static void setInstance(DAOHelloWorld instance) {
		//this.instance = instance;
	}
	
	//should be private
	public void readFile() throws IOException {
		BufferedReader buf = new BufferedReader(new FileReader (fileName));
		line = buf.readLine();
		System.out.println(line);
		buf.close();
		//may need to use try or catch but lets try with "throws IOException"
	}
	
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
		
	
}
